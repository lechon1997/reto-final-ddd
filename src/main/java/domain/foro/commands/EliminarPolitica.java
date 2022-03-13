package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ForoId;
import domain.foro.values.PoliticaId;

public class EliminarPolitica extends Command {
    private final ForoId foroId;
    private final PoliticaId politicaId;

    public EliminarPolitica(ForoId foroId, PoliticaId politicaId) {
        this.foroId = foroId;
        this.politicaId = politicaId;
    }

    public ForoId getForoId() {
        return foroId;
    }

    public PoliticaId getPoliticaId() {
        return politicaId;
    }
}
