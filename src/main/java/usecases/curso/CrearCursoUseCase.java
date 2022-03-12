package usecases.curso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.curso.commands.CrearCurso;

public class CrearCursoUseCase extends UseCase<RequestCommand<CrearCurso>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearCurso> input) {
        var command = input.getCommand();

    }
}
