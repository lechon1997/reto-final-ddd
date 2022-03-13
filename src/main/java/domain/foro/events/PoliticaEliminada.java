package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.values.PoliticaId;

public class PoliticaEliminada extends DomainEvent {
    private final PoliticaId politicaId;

    public PoliticaEliminada(PoliticaId politicaId) {
        super("empresa.foro.politicaeliminada");
        this.politicaId = politicaId;
    }

    public PoliticaId getPoliticaId() {
        return politicaId;
    }
}
