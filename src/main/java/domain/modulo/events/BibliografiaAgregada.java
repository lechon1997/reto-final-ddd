package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.values.BibliografiaId;

public class BibliografiaAgregada extends DomainEvent {
    private final BibliografiaId bibliografiaId;

    public BibliografiaAgregada(BibliografiaId bibliografiaId) {
        super("empresa.modulo.bibliografiaagregada");
        this.bibliografiaId = bibliografiaId;
    }

    public BibliografiaId getBibliografiaId() {
        return bibliografiaId;
    }
}
