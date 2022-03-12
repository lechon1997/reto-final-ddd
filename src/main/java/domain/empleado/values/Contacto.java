package domain.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class Contacto implements ValueObject<Contacto.Properties> {
    private final Correo correo;
    private final Celular celular;
    private final Telefono telefono;

    public Contacto(Correo correo, Celular celular, Telefono telefono) {
        this.correo = correo;
        this.celular = celular;
        this.telefono = telefono;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Correo correo() {
                return correo;
            }

            @Override
            public Celular celular() {
                return celular;
            }

            @Override
            public Telefono telefono() {
                return telefono;
            }
        };
    }


    public interface Properties{
        Correo correo();
        Celular celular();
        Telefono telefono();
    }
}
