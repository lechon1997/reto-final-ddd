package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.values.PoliticaId;
import domain.values.Texto;

public class PoliticaAgregada extends DomainEvent {
    private final PoliticaId politicaId;
    private final Texto texto;

    public PoliticaAgregada(PoliticaId politicaId, Texto texto) {
        super("empresa.foro.politicaagregada");
        this.politicaId = politicaId;
        this.texto = texto;
    }

    public PoliticaId getPoliticaId() {
        return politicaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
