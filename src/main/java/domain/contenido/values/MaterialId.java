package domain.contenido.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class MaterialId extends Identity {
    public MaterialId(String uuid) {
        super(uuid);
    }

    public MaterialId() {
        super();
    }

    public static MaterialId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new MaterialId(uuid);
    }
}
