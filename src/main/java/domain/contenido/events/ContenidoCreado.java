package domain.contenido.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Descripcion;

public class ContenidoCreado extends DomainEvent {
    private final Descripcion descripcion;

    public ContenidoCreado(Descripcion descripcion) {
        super("empresa.contenido.contenidocreado");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
