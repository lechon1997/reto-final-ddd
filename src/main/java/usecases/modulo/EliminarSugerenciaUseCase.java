package usecases.modulo;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.modulo.Modulo;
import domain.modulo.commands.EliminarSugerencia;

public class EliminarSugerenciaUseCase extends UseCase<RequestCommand<EliminarSugerencia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<EliminarSugerencia> input) {
        var command = input.getCommand();
        var modulo = Modulo.from(command.getModuloId(), retrieveEvents());
        try{
            modulo.eliminarSugerencia(command.getSugerenciaId());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getModuloId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(modulo.getUncommittedChanges()));
    }
}
