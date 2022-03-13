package usecases.modulo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.contenido.values.ContenidoId;
import domain.curso.events.CursoCreado;
import domain.foro.values.ForoId;
import domain.modulo.commands.CrearModulo;
import domain.modulo.events.ModuloCreado;
import domain.modulo.values.ModuloId;
import domain.values.Descripcion;
import domain.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearModuloUseCaseTest {
    @Test
    void crearModulo(){
        ModuloId moduloId = ModuloId.of("aaaa");
        Nombre nombre = new Nombre("modulo 1");
        Descripcion descripcion = new Descripcion("este modulo 1 se profundiza en ...");
        ContenidoId contenidoId = ContenidoId.of("cccc");
        ForoId foroId = ForoId.of("dddd");

        var command = new CrearModulo(nombre,descripcion,contenidoId,foroId,moduloId);
        var useCase = new CrearModuloUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (ModuloCreado)events.get(0);
        Assertions.assertEquals("empresa.modulo.modulocreado", event.type);
        Assertions.assertEquals("modulo 1", event.nombre().value().nombre());
        Assertions.assertEquals("este modulo 1 se profundiza en ...", event.descripcion().value().descripcion());
        Assertions.assertEquals(contenidoId, event.ContenidoId());
        Assertions.assertEquals(foroId, event.ForoId());
        Assertions.assertEquals("aaaa", event.aggregateRootId());
    }

}