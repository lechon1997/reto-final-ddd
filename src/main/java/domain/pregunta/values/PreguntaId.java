package domain.pregunta.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class PreguntaId extends Identity {

    public PreguntaId(String uuid) {
        super(uuid);
    }

    public PreguntaId() {
        super();
    }

    public static PreguntaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new PreguntaId(uuid);
    }
}
