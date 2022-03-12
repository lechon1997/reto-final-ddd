package domain.evaluacion.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class EvaluacionId extends Identity {
    public EvaluacionId(String uuid) {
        super(uuid);
    }

    public EvaluacionId() {
        super();
    }

    public static EvaluacionId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new EvaluacionId(uuid);
    }
}
