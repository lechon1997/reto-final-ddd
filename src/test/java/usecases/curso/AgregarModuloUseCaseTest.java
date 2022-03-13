package usecases.curso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.curso.commands.AgregarModulo;
import domain.curso.events.CursoCreado;
import domain.curso.events.ModuloAgregado;
import domain.curso.values.CursoId;
import domain.modulo.values.ModuloId;
import domain.values.Descripcion;
import domain.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AgregarModuloUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    void agregarModulo(){
        CursoId cursoId = CursoId.of("dddd");
        ModuloId moduloId = ModuloId.of("aaaa");

        var command = new AgregarModulo(cursoId,moduloId);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new AgregarModuloUseCase();
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (ModuloAgregado)events.get(0);
        Assertions.assertEquals("empresa.curso.moduloagregado", event.type);
        Assertions.assertEquals("aaaa", event.moduloId().value());
        Assertions.assertEquals("dddd", event.aggregateRootId());
    }

    private List<DomainEvent> events(){
        Nombre nombre = new Nombre("Mecanica");
        Descripcion descripcion = new Descripcion("asdsad");
        return List.of(new CursoCreado(nombre,descripcion));
    }

}