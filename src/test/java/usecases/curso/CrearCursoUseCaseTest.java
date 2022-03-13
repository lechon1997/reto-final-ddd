package usecases.curso;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.curso.commands.CrearCurso;
import domain.curso.events.CursoCreado;
import domain.curso.values.CursoId;
import domain.values.Descripcion;
import domain.values.Nombre;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearCursoUseCaseTest {
    @Test
    void crearCurso(){
        CursoId cursoId = CursoId.of("dddd");
        Nombre nombre = new Nombre("Mecanica");
        Descripcion descripcion = new Descripcion("Un curso muy bueno");

        var command = new CrearCurso(cursoId,nombre,descripcion);
        var useCase = new CrearCursoUseCase();

        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var event = (CursoCreado)events.get(0);
        Assertions.assertEquals("empresa.curso.cursocreado", event.type);
        Assertions.assertEquals("Mecanica", event.getNombre().value().nombre());
        Assertions.assertEquals("Un curso muy bueno", event.getDescripcion().value().descripcion());
        Assertions.assertEquals("dddd", event.aggregateRootId());
    }
}