package domain.evaluacion.values;

import co.com.sofka.domain.generic.ValueObject;

public class PromedioMinimo implements ValueObject<String> {
    private final Integer promedioMinimo;

    public PromedioMinimo(Integer promedioMinimo) {
        this.promedioMinimo = promedioMinimo;
    }

    public Integer getPromedioMinimo() {
        return promedioMinimo;
    }

    @Override
    public String value() {
        return promedioMinimo.toString();
    }
}
