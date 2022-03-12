package domain.evaluacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pregunta.values.PreguntaId;
import domain.values.Texto;

public class PreguntaAgregada extends DomainEvent {
    private final PreguntaId preguntaId;

    public PreguntaAgregada(PreguntaId preguntaId) {
        super("empresa.evaluacion.preguntaagregada");
        this.preguntaId = preguntaId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }
}
