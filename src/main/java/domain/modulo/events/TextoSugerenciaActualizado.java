package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.modulo.values.SugerenciaId;
import domain.values.Texto;

public class TextoSugerenciaActualizado extends DomainEvent {
    private final SugerenciaId sugerenciaId;
    private final Texto texto;

    public TextoSugerenciaActualizado(SugerenciaId sugerenciaId, Texto texto) {
        super("empresa.modulo.textosugerenciaactualizado");
        this.sugerenciaId = sugerenciaId;
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }

    public SugerenciaId getSugerenciaId() {
        return sugerenciaId;
    }
}
