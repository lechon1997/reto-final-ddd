package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.bibliografia.values.BibliografiaId;

public class AgregarBibliografia extends Command {
    private final BibliografiaId bibliografiaId;

    public AgregarBibliografia(BibliografiaId bibliografiaId) {
        this.bibliografiaId = bibliografiaId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }
}
