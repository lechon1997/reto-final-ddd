package usecases.modulo;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.modulo.Modulo;
import domain.modulo.commands.AgregarSugerencia;

public class CrearSugerenciaUseCase extends UseCase<RequestCommand<AgregarSugerencia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarSugerencia> input) {
        var command = input.getCommand();
        var modulo = Modulo.from(command.getModuloId(),retrieveEvents());
        try{
            modulo.agregarSugerencia(command.getSugerenciaId(),command.getTexto());
        }catch (IllegalArgumentException e){
            throw new BusinessException(command.getModuloId().value(), e.getMessage());
        }
        emit().onResponse(new ResponseEvents(modulo.getUncommittedChanges()));
    }
}
