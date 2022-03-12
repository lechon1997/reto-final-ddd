package domain.pregunta.commands;

import co.com.sofka.domain.generic.Command;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.PreguntaId;
import domain.pregunta.values.RespuestaId;

public class ActualizarCorrectaRespuesta extends Command {
    private final PreguntaId preguntaId;
    private final RespuestaId respuestaId;
    private final Correcta correcta;

    public ActualizarCorrectaRespuesta(PreguntaId preguntaId, RespuestaId respuestaId, Correcta correcta) {
        this.preguntaId = preguntaId;
        this.respuestaId = respuestaId;
        this.correcta = correcta;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public RespuestaId getRespuestaId() {
        return respuestaId;
    }

    public Correcta getCorrecta() {
        return correcta;
    }
}
