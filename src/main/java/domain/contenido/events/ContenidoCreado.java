package domain.contenido.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.evaluacion.values.EvaluacionId;
import domain.values.Descripcion;

public class ContenidoCreado extends DomainEvent {
    private final Descripcion descripcion;
    private final EvaluacionId evaluacionId;

    public ContenidoCreado(Descripcion descripcion, EvaluacionId evaluacionId) {
        super("empresa.contenido.contenidocreado");
        this.descripcion = descripcion;
        this.evaluacionId = evaluacionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }
}
