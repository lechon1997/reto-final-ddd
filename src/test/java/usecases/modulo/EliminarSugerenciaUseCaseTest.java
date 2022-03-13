package usecases.modulo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.values.ContenidoId;
import domain.foro.values.ForoId;
import domain.modulo.commands.EliminarSugerencia;
import domain.modulo.events.ModuloCreado;
import domain.modulo.events.SugerenciaAgregada;
import domain.modulo.events.SugerenciaEliminada;
import domain.modulo.values.ModuloId;
import domain.modulo.values.SugerenciaId;
import domain.values.Descripcion;
import domain.values.Nombre;
import domain.values.Texto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class EliminarSugerenciaUseCaseTest {
    @Mock
    DomainEventRepository repository;

    @Test
    void eliminarSugerencia(){
        ModuloId moduloId = ModuloId.of("xxxx");
        SugerenciaId sugerenciaId = SugerenciaId.of("oooo");

        var command =  new EliminarSugerencia(moduloId,sugerenciaId);
        Mockito.when(repository.getEventsBy(null)).thenReturn(events());

        var useCase = new EliminarSugerenciaUseCase();
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (SugerenciaEliminada)events.get(0);
        Assertions.assertEquals("empresa.modulo.sugerenciaeliminada", event.type);
        Assertions.assertEquals("oooo", event.getSugerenciaId().value());
        Assertions.assertEquals("xxxx", event.aggregateRootId());
    }

    private List<DomainEvent> events() {

        ModuloId moduloId = ModuloId.of("xxxx");
        Nombre nombre = new Nombre("modulo 1");
        Descripcion descripcion = new Descripcion("este modulo 1 se profundiza en ...");
        ContenidoId contenidoId = ContenidoId.of("cccc");
        ForoId foroId = ForoId.of("dddd");
        List<DomainEvent> eventos = new ArrayList<>();

        SugerenciaId sugerenciaId = SugerenciaId.of("oooo");
        Texto texto = new Texto("estudiar 3 horas por días");

        eventos.add(new ModuloCreado(nombre,descripcion,contenidoId,foroId));
        eventos.add(new SugerenciaAgregada(sugerenciaId,texto));

        return eventos;
    }
}