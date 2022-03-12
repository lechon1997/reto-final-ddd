package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Descripcion;

public class ForoCreado extends DomainEvent {
    private final Descripcion descripcion;

    public ForoCreado(Descripcion descripcion) {
        super("empresa.foro.forocreado");
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
