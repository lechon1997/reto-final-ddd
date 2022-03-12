package domain.foro.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ForoId extends Identity {
    public ForoId(String uuid) {
        super(uuid);
    }

    public ForoId() {
        super();
    }

    public static ForoId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new ForoId(uuid);
    }
}
