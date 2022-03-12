package domain.values;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<Descripcion.Properties> {
    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public Properties value() {
        return new Properties() {

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    public interface Properties{
        String descripcion();
    }
}
