package usecases.modulo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.modulo.Modulo;
import domain.modulo.commands.AgregarBibliografia;

public class CrearBibliografiaUseCase extends UseCase<RequestCommand<AgregarBibliografia>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarBibliografia> input) {
        var command = input.getCommand();
        var modulo = Modulo.from(command.get ,retrieveEvents())
    }
}
