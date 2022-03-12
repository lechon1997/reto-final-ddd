package domain.evaluacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.evaluacion.values.EvaluacionId;
import domain.pregunta.values.PreguntaId;
import domain.values.Texto;

public class AgregarPregunta extends Command {
    private final EvaluacionId evaluacionId;
    private final PreguntaId preguntaId;

    public AgregarPregunta(EvaluacionId evaluacionId, PreguntaId preguntaId) {
        this.evaluacionId = evaluacionId;
        this.preguntaId = preguntaId;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

}
