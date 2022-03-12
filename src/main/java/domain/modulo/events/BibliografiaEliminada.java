package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.values.BibliografiaId;

public class BibliografiaEliminada extends DomainEvent {
    private final BibliografiaId bibliografiaId;

    public BibliografiaEliminada(BibliografiaId bibliografiaId) {
        super("empresa.modulo.bibliografiaeliminada");
        this.bibliografiaId = bibliografiaId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }
}
