package usecases.curso;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.curso.Curso;
import domain.curso.commands.InscribirEmpleado;

public class InscribirEmpleadoUseCase extends UseCase<RequestCommand<InscribirEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<InscribirEmpleado> input) {
        var command = input.getCommand();
        var curso = Curso.from(command.getCursoId(),retrieveEvents());
        try {
            curso.inscribirEmpleado(command.getEmpleadoId());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getCursoId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(curso.getUncommittedChanges()));
    }
}
