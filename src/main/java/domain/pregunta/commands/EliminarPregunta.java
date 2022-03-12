package domain.pregunta.commands;

import co.com.sofka.domain.generic.Command;
import domain.pregunta.values.PreguntaId;
import domain.pregunta.values.RespuestaId;

public class EliminarPregunta extends Command {
    private final PreguntaId preguntaId;
    private final RespuestaId respuestaId;

    public EliminarPregunta(PreguntaId preguntaId, RespuestaId respuestaId) {
        this.preguntaId = preguntaId;
        this.respuestaId = respuestaId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }
}
