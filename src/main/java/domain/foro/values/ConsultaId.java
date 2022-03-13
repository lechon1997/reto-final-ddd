package domain.foro.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ConsultaId extends Identity {
    public ConsultaId(String uuid) {
        super(uuid);
    }

    public ConsultaId() {
        super();
    }

    public static ConsultaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new ConsultaId(uuid);
    }
}
