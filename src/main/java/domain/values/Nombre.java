package domain.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Nombre implements ValueObject<Nombre.Properties>{
    private final String nombre;

    public Nombre(String nombre) {
        this.nombre = Objects.requireNonNull(nombre,"El nombre es obligatorio");
    }

    @Override
    public Properties value() {
        return new Properties() {

            @Override
            public String nombre() {
                return nombre;
            }
        };
    }

    public interface Properties{
        String nombre();
    }
}
