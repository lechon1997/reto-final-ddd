package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ForoId;
import domain.foro.values.PoliticaId;
import domain.values.Texto;

public class AgregarPolitica extends Command {
    private final ForoId foroId;
    private final PoliticaId politicaId;
    private final Texto texto;

    public AgregarPolitica(ForoId foroId, PoliticaId politicaId, Texto texto) {
        this.foroId = foroId;
        this.politicaId = politicaId;
        this.texto = texto;
    }

    public ForoId getForoId() {
        return foroId;
    }

    public PoliticaId getPoliticaId() {
        return politicaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
