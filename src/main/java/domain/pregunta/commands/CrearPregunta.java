package domain.pregunta.commands;

import co.com.sofka.domain.generic.Command;
import domain.pregunta.values.PreguntaId;
import domain.values.Texto;

public class CrearPregunta extends Command {
    private final PreguntaId preguntaId;
    private final Texto texto;

    public CrearPregunta(PreguntaId preguntaId, Texto texto) {
        this.preguntaId = preguntaId;
        this.texto = texto;
    }

    public PreguntaId getPreguntaId() {
        return preguntaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
