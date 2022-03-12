package domain.evaluacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.evaluacion.values.PromedioMinimo;
import domain.values.Descripcion;

public class EvaluacionCreada extends DomainEvent {
    private final Descripcion descripcion;
    private final PromedioMinimo promedioMinimo;

    public EvaluacionCreada(Descripcion descripcion, PromedioMinimo promedioMinimo) {
        super("empresa.evaluacion.evaluacioncreada");
        this.descripcion = descripcion;
        this.promedioMinimo = promedioMinimo;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public PromedioMinimo getPromedioMinimo() {
        return promedioMinimo;
    }
}
