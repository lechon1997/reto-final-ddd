package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.modulo.values.SugerenciaId;
import domain.values.Texto;

public class SugerenciaAgregada extends DomainEvent {
    private final SugerenciaId sugerenciaId;
    private final Texto texto;

    public SugerenciaAgregada(SugerenciaId sugerenciaId, Texto texto) {
        super("empresa.modulo.sugerenciaagregada");
        this.sugerenciaId = sugerenciaId;
        this.texto = texto;
    }

    public SugerenciaId getSugerenciaId() {
        return sugerenciaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
