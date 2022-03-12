package domain.bibliografia.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ReferenciaId extends Identity {
    public ReferenciaId(String uuid) {
        super(uuid);
    }

    public ReferenciaId() {
        super();
    }

    public static ReferenciaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new ReferenciaId(uuid);
    }
}
