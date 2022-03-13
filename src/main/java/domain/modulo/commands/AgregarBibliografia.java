package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.bibliografia.values.BibliografiaId;
import domain.modulo.values.ModuloId;

public class AgregarBibliografia extends Command {
    private final ModuloId moduloId;
    private final BibliografiaId bibliografiaId;

    public AgregarBibliografia(ModuloId moduloId, BibliografiaId bibliografiaId) {
        this.moduloId = moduloId;
        this.bibliografiaId = bibliografiaId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }
}
