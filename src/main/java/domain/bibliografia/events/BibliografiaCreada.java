package domain.bibliografia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Descripcion;

public class BibliografiaCreada extends DomainEvent {
    private final Descripcion descripcion;

    public BibliografiaCreada(Descripcion descripcion) {
        super("empresa.bibliografia.bibliografiacreada");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
