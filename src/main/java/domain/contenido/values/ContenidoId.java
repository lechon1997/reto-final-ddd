package domain.contenido.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class ContenidoId extends Identity {
    public ContenidoId(String uuid) {
        super(uuid);
    }

    public ContenidoId() {
        super();
    }

    public static ContenidoId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new ContenidoId(uuid);
    }
}
