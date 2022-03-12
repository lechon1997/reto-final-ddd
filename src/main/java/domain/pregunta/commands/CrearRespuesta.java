package domain.pregunta.commands;

import co.com.sofka.domain.generic.Command;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.PreguntaId;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

public class CrearRespuesta extends Command {
    private final PreguntaId preguntaId;
    private final RespuestaId respuestaId;
    private final Correcta correcta;
    private final Texto texto;

    public CrearRespuesta(PreguntaId preguntaId, RespuestaId respuestaId, Correcta correcta, Texto texto) {
        this.preguntaId = preguntaId;
        this.respuestaId = respuestaId;
        this.correcta = correcta;
        this.texto = texto;
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

    public Texto getTexto() {
        return texto;
    }
}
