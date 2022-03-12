package domain.pregunta.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.RespuestaId;

public class CorrectaRespuestaActualizada extends DomainEvent {
    private final RespuestaId respuestaId;
    private final Correcta correcta;

    public CorrectaRespuestaActualizada(RespuestaId respuestaId, Correcta correcta) {
        super("empresa.pregunta.correctarespuestaactualizada");
        this.respuestaId = respuestaId;
        this.correcta = correcta;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }

    public Correcta getCorrecta() {
        return correcta;
    }
}
