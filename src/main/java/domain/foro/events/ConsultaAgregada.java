package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.values.ConsultaId;
import domain.values.Texto;

public class ConsultaAgregada extends DomainEvent {
    private final ConsultaId consultaId;
    private final Texto texto;

    public ConsultaAgregada(ConsultaId consultaId, Texto texto) {
        super("empresa.foro.consultaagregada");
        this.consultaId = consultaId;
        this.texto = texto;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
