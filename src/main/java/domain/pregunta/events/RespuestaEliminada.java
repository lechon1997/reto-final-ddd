package domain.pregunta.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.EventChange;
import domain.pregunta.values.RespuestaId;

public class RespuestaEliminada extends DomainEvent {
    private final RespuestaId respuestaId;

    public RespuestaEliminada(RespuestaId respuestaId) {
        super("empresa.pregunta.respuestaeliminada");
        this.respuestaId = respuestaId;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }
}
