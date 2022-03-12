package domain.pregunta.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

public class TextoRespuestaActualizado extends DomainEvent {
    private final RespuestaId respuestaId;
    private final Texto texto;

    public TextoRespuestaActualizado(RespuestaId respuestaId, Texto texto) {
        super("empresa.pregunta.textorespuestaactualizado");
        this.respuestaId = respuestaId;
        this.texto = texto;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
