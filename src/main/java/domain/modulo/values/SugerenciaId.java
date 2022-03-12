package domain.modulo.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class SugerenciaId extends Identity {
    public SugerenciaId(String uuid) {
        super(uuid);
    }

    public SugerenciaId() {
        super();
    }

    public static SugerenciaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new SugerenciaId(uuid);
    }
}
