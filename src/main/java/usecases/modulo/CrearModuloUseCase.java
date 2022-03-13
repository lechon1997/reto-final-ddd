package usecases.modulo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.modulo.Modulo;
import domain.modulo.commands.CrearModulo;

public class CrearModuloUseCase extends UseCase<RequestCommand<CrearModulo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearModulo> input) {
        var command = input.getCommand();
        var modulo = new Modulo(command.getModuloId(),command.getNombre(),command.getDescripcion(),command.getContenidoId(),command.getForoId());
        emit().onResponse(new ResponseEvents(modulo.getUncommittedChanges()));

    }
}
