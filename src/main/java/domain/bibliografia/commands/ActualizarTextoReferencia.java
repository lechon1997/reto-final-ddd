package domain.bibliografia.commands;

import co.com.sofka.domain.generic.Command;
import domain.bibliografia.values.BibliografiaId;
import domain.bibliografia.values.ReferenciaId;
import domain.values.Texto;

public class ActualizarTextoReferencia extends Command {
    private final BibliografiaId bibliografiaId;
    private final ReferenciaId referenciaId;
    private final Texto texto;

    public ActualizarTextoReferencia(BibliografiaId bibliografiaId, ReferenciaId referenciaId, Texto texto) {
        this.bibliografiaId = bibliografiaId;
        this.referenciaId = referenciaId;
        this.texto = texto;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
