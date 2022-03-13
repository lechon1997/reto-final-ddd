package usecases.curso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.curso.commands.InscribirEmpleado;
import domain.curso.events.CursoCreado;
import domain.curso.events.EmpleadoInscripto;
import domain.curso.values.CursoId;
import domain.empleado.values.EmpleadoId;
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
class InscribirEmpleadoUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    void inscribirEmpleado(){
        CursoId cursoId = CursoId.of("xxxx");
        EmpleadoId empleadoId = EmpleadoId.of("ffff");

        var command = new InscribirEmpleado(cursoId,empleadoId);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new InscribirEmpleadoUseCase();
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (EmpleadoInscripto)events.get(0);
        Assertions.assertEquals("empresa.curso.empleadoinscripto", event.type);
        Assertions.assertEquals("ffff", event.empleadoId().value());
        Assertions.assertEquals("xxxx",event.aggregateRootId());
    }

    private List<DomainEvent> events() {
        Nombre nombre = new Nombre("Mecanica");
        Descripcion descripcion = new Descripcion("asdsad");
        return List.of(new CursoCreado(nombre,descripcion));
    }
}