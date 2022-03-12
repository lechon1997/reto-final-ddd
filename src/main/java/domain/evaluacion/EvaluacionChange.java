package domain.evaluacion;

import co.com.sofka.domain.generic.EventChange;
import domain.evaluacion.events.EvaluacionCreada;
import domain.evaluacion.events.PreguntaAgregada;
import domain.evaluacion.events.PreguntaEliminada;

import java.util.HashSet;

public class EvaluacionChange extends EventChange {
    public EvaluacionChange(Evaluacion evaluacion) {
        apply((EvaluacionCreada event) -> {
            evaluacion.descripcion = event.getDescripcion();
            evaluacion.promedioMinimo = event.getPromedioMinimo();
            evaluacion.preguntas = new HashSet<>();
        });

        apply((PreguntaAgregada event) -> {
            evaluacion.preguntas.add(event.getPreguntaId());
        });

        apply((PreguntaEliminada event) -> {
            evaluacion.preguntas.remove(event.getPreguntaId());
        });
    }
}
