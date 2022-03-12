package domain.evaluacion.commands;

import co.com.sofka.domain.generic.Command;
import domain.evaluacion.values.EvaluacionId;
import domain.evaluacion.values.PromedioMinimo;
import domain.values.Descripcion;

public class CrearEvaluacion extends Command {
    private final EvaluacionId evaluacionId;
    private final Descripcion descripcion;
    private final PromedioMinimo promedioMinimo;

    public CrearEvaluacion(EvaluacionId evaluacionId, Descripcion descripcion, PromedioMinimo promedioMinimo) {
        this.evaluacionId = evaluacionId;
        this.descripcion = descripcion;
        this.promedioMinimo = promedioMinimo;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public PromedioMinimo getPromedioMinimo() {
        return promedioMinimo;
    }
}
