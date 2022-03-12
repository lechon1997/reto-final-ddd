package domain.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class Telefono implements ValueObject<String> {
    private final String celular;

    public Telefono(String celular) {
        this.celular = celular;
    }

    @Override
    public String value() {
        return celular;
    }
}
