package domain.contenido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.events.ContenidoCreado;
import domain.contenido.values.ContenidoId;
import domain.values.Descripcion;

import java.util.List;

public class Contenido extends AggregateEvent<ContenidoId> {
    protected Descripcion descripcion;

    public Contenido(ContenidoId entityId, Descripcion descripcion) {
        super(entityId);
        appendChange(new ContenidoCreado(descripcion)).apply();
    }

    private Contenido(ContenidoId contenidoId){
        super(contenidoId);
        subscribe(new ContenidoChange(this));
    }

    public static Contenido from(ContenidoId contenidoId, List<DomainEvent> events){
        var contenido = new Contenido(contenidoId);
        events.forEach(contenido::applyEvent);
        return contenido;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
