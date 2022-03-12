package domain.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class Celular implements ValueObject<String> {
    private final String celular;

    public Celular(String celular) {
        this.celular = celular;
    }

    @Override
    public String value() {
        return celular;
    }
}
