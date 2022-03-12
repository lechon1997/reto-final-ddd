package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.bibliografia.values.BibliografiaId;
import domain.modulo.values.ModuloId;

public class EliminarBibliografia extends Command {
    private final ModuloId moduloId;
    private final BibliografiaId bibliografiaId;

    public EliminarBibliografia(ModuloId moduloId, BibliografiaId bibliografiaId) {
        this.moduloId = moduloId;
        this.bibliografiaId = bibliografiaId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }
}
