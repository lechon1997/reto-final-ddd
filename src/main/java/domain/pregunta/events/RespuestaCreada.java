package domain.pregunta.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

public class RespuestaCreada extends DomainEvent {
    private final RespuestaId respuestaId;
    private final Texto texto;
    private final Correcta correcta;

    public RespuestaCreada(RespuestaId respuestaId, Correcta correcta, Texto texto) {
        super("empresa.pregunta.respuestacreada");
        this.respuestaId = respuestaId;
        this.texto = texto;
        this.correcta = correcta;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }

    public Texto getTexto() {
        return texto;
    }

    public Correcta getCorrecta() {
        return correcta;
    }
}
