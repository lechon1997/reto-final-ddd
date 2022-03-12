package domain.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Texto implements ValueObject<Texto.Properties>{
    private final String texto;

    public Texto(String texto) {
        this.texto = Objects.requireNonNull(texto,"Texto obligatorio");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String texto() {
                return texto;
            }
        };
    }

    public interface Properties{
        String texto();
    }
}
