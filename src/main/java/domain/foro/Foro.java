package domain.foro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.events.ForoCreado;
import domain.foro.values.ForoId;
import domain.values.Descripcion;

import java.util.List;

public class Foro extends AggregateEvent<ForoId> {
    protected Descripcion descripcion;

    public Foro(ForoId entityId, Descripcion descripcion) {
        super(entityId);
        appendChange(new ForoCreado(descripcion)).apply();
    }

    private Foro(ForoId foroId){
        super(foroId);
        subscribe(new ForoChange(this));
    }

    public static Foro from(ForoId foroId, List<DomainEvent> events){
        var foro = new Foro(foroId);
        events.forEach(foro::applyEvent);
        return foro;
    }
}
