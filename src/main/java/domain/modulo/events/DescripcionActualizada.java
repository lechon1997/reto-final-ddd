package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Descripcion;

public class DescripcionActualizada extends DomainEvent {
    private final Descripcion descripcion;

    public DescripcionActualizada(Descripcion descripcion) {
        super("empresa.modulo.descripcionactualizada");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
