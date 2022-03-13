package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.values.ConsultaId;

public class ConsultaEliminada extends DomainEvent {
    private final ConsultaId consultaId;

    public ConsultaEliminada(ConsultaId consultaId) {
        super("empresa.foro.consultaeliminada");
        this.consultaId = consultaId;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }
}
