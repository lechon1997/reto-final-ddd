package domain.curso.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class CursoId extends Identity {

    public CursoId() {
        super();
    }

    public CursoId(String uuid) {
        super(uuid);
    }

    public static CursoId of(String uuid){
        Objects.requireNonNull(uuid, "El ID del curso es requerido");
        return new CursoId(uuid);
    }

}
