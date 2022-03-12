package domain.empleado.values;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<Direccion.Properties> {
    private final String ciudad;
    private final String calle1;
    private final String calle2;
    private final Integer numero;

    public Direccion(String ciudad, String calle1, String calle2, Integer numero) {
        this.ciudad = ciudad;
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.numero = numero;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String ciudad() {
                return ciudad;
            }

            @Override
            public String calle1() {
                return calle1;
            }

            @Override
            public String calle2() {
                return calle2;
            }

            @Override
            public Integer numero() {
                return numero;
            }
        };
    }

    public interface Properties{
        String ciudad();
        String calle1();
        String calle2();
        Integer numero();
    }
}
