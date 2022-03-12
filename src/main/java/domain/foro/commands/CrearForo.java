package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ForoId;

public class CrearForo extends Command {
    private final ForoId foroId;

    public CrearForo(ForoId foroId) {
        this.foroId = foroId;
    }

    public ForoId getForoId() {
        return foroId;
    }
}
