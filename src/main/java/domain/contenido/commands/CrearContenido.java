package domain.contenido.commands;

import co.com.sofka.domain.generic.Command;
import domain.contenido.values.ContenidoId;
import domain.evaluacion.values.EvaluacionId;
import domain.values.Descripcion;

public class CrearContenido extends Command {
    private final ContenidoId contenidoId;
    private final Descripcion descripcion;
    private final EvaluacionId evaluacionId;

    public CrearContenido(ContenidoId contenidoId, Descripcion descripcion, EvaluacionId evaluacionId) {
        this.contenidoId = contenidoId;
        this.descripcion = descripcion;
        this.evaluacionId = evaluacionId;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }
}
