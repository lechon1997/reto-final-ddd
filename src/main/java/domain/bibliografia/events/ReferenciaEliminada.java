package domain.bibliografia.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.values.ReferenciaId;

public class ReferenciaEliminada extends DomainEvent {
    private final ReferenciaId referenciaId;

    public ReferenciaEliminada(ReferenciaId referenciaId) {
        super("empresa.bibliografia.referenciaeliminada");
        this.referenciaId = referenciaId;
    }

    public ReferenciaId getReferenciaId() {
        return referenciaId;
    }
}
