package domain.evaluacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.evaluacion.events.EvaluacionCreada;
import domain.evaluacion.events.PreguntaAgregada;
import domain.evaluacion.events.PreguntaEliminada;
import domain.evaluacion.values.EvaluacionId;
import domain.evaluacion.values.PromedioMinimo;
import domain.pregunta.Pregunta;
import domain.pregunta.values.PreguntaId;
import domain.values.Descripcion;
import domain.values.Texto;

import java.util.List;
import java.util.Set;

public class Evaluacion extends AggregateEvent<EvaluacionId> {
    protected Descripcion descripcion;
    protected PromedioMinimo promedioMinimo;
    protected Set<PreguntaId> preguntas;

    public Evaluacion(EvaluacionId entityId, Descripcion descripcion, PromedioMinimo promedioMinimo) {
        super(entityId);
        appendChange(new EvaluacionCreada(descripcion,promedioMinimo)).apply();
    }

    private Evaluacion(EvaluacionId evaluacionId){
        super(evaluacionId);
        subscribe(new EvaluacionChange(this));
    }

    public static Evaluacion from(EvaluacionId evaluacionId, List<DomainEvent> events){
        var evaluacion = new Evaluacion(evaluacionId);
        events.forEach(evaluacion::applyEvent);
        return evaluacion;
    }

    public void agregarPregunta(PreguntaId preguntaId){
        appendChange(new PreguntaAgregada(preguntaId)).apply();
    }

    public void eliminarPregunta(PreguntaId preguntaId){
        appendChange(new PreguntaEliminada(preguntaId)).apply();
    }

    public Set listarPreguntas(){
        return preguntas;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
