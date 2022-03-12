package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.modulo.values.SugerenciaId;

public class SugerenciaEliminada extends DomainEvent {
    private final SugerenciaId sugerenciaId;

    public SugerenciaEliminada(SugerenciaId sugerenciaId) {
        super("empresa.sugerencia.sugerenciaeliminada");
        this.sugerenciaId = sugerenciaId;
    }

    public SugerenciaId getSugerenciaId() {
        return sugerenciaId;
    }
}
