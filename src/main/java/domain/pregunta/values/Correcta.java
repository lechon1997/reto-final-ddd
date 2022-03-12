package domain.pregunta.values;

import co.com.sofka.domain.generic.ValueObject;

public class Correcta implements ValueObject<String>{
    private final Boolean correcta;

    public Correcta(Boolean correcta) {
        this.correcta = correcta;
    }

    public Boolean getCorrecta() {
        return correcta;
    }

    @Override
    public String value() {
        return correcta.toString();
    }
}
