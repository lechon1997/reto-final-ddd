package usecases.curso;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.curso.Curso;
import domain.curso.commands.CrearCurso;

public class CrearCursoUseCase extends UseCase<RequestCommand<CrearCurso>, ResponseEvents> {


    @Override
    public void executeUseCase(RequestCommand<CrearCurso> input) {
        var command = input.getCommand();
        var curso = new Curso(command.getCursoId(), command.getNombre(),command.getDescripcion());
        emit().onResponse(new ResponseEvents(curso.getUncommittedChanges()));
    }
}
