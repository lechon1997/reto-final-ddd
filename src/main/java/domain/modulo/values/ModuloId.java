package domain.modulo.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ModuloId extends Identity {

    public ModuloId() {
        super();
    }

    public ModuloId(String uuid) {
        super(uuid);
    }

    public static ModuloId of(String uuid){
        Objects.requireNonNull(uuid,"El ID es obligatorio");
        return new ModuloId(uuid);
    }

}
