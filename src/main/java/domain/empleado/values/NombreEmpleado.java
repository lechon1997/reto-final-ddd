package domain.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreEmpleado implements ValueObject<NombreEmpleado.Properties> {
    private final String nombre;
    private final String apellido;

    public NombreEmpleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String apellido() {
                return apellido;
            }
        };
    }

    public interface Properties{
        String nombre();
        String apellido();
    }

}
