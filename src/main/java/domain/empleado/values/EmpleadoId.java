package domain.empleado.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class EmpleadoId extends Identity {
    public EmpleadoId(String uuid) {
        super(uuid);
    }

    public EmpleadoId() {
        super();
    }

    public static EmpleadoId of(String uuid){
        Objects.requireNonNull(uuid, "Id requerido");
        return new EmpleadoId(uuid);
    }
}
