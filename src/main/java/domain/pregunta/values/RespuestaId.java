package domain.pregunta.values;

import co.com.sofka.domain.generic.Identity;
import domain.values.Texto;

import java.util.Objects;

public class RespuestaId extends Identity {
    public RespuestaId(String uuid) {
        super(uuid);
    }

    public RespuestaId() {
        super();
    }

    public static RespuestaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new RespuestaId(uuid);
    }
}
