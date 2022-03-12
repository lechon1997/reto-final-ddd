package domain.pregunta.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Texto;

public class PreguntaCreada extends DomainEvent {
    private final Texto texto;

    public PreguntaCreada(Texto texto) {
        super("empresa.pregunta.preguntacreada");
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }
}
