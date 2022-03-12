package domain.bibliografia.commands;

import co.com.sofka.domain.generic.Command;
import domain.bibliografia.values.BibliografiaId;
import domain.bibliografia.values.ReferenciaId;

public class EliminarReferencia extends Command {
    private final BibliografiaId bibliografiaId;
    private final ReferenciaId referenciaId;

    public EliminarReferencia(BibliografiaId bibliografiaId, ReferenciaId referenciaId) {
        this.bibliografiaId = bibliografiaId;
        this.referenciaId = referenciaId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}
