package domain.evaluacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.pregunta.values.PreguntaId;

public class PreguntaEliminada extends DomainEvent {
    private final PreguntaId preguntaId;

    public PreguntaEliminada(PreguntaId preguntaId) {
        super("empresa.pregunta.preguntaeliminada");
        this.preguntaId = preguntaId;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }
}
