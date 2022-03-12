package domain.bibliografia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.values.ReferenciaId;
import domain.values.Texto;

public class ReferenciaAgregada extends DomainEvent {
    private final ReferenciaId referenciaId;
    private final Texto texto;

    public ReferenciaAgregada(ReferenciaId referenciaId, Texto texto) {
        super("empresa.bibliografia.referenciaagregada");
        this.referenciaId = referenciaId;
        this.texto = texto;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
