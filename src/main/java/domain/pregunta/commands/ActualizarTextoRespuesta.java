package domain.pregunta.commands;

import co.com.sofka.domain.generic.Command;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

public class ActualizarTextoRespuesta extends Command {
    private final RespuestaId respuestaId;
    private final Texto texto;

    public ActualizarTextoRespuesta(RespuestaId respuestaId, Texto texto) {
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
