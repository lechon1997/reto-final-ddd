package usecases.curso;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.curso.Curso;
import domain.curso.commands.AgregarModulo;
import domain.modulo.values.ModuloId;

public class AgregarModuloUseCase extends UseCase<RequestCommand<AgregarModulo>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarModulo> input) {
        var command = input.getCommand();
        var curso = Curso.from(command.getCursoId(), retrieveEvents());
        try{
            curso.agregarModulo(command.getModuloId());

        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getCursoId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(curso.getUncommittedChanges()));
    }
}
