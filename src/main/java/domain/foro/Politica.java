package domain.foro;

import co.com.sofka.domain.generic.Entity;
import domain.foro.values.PoliticaId;
import domain.values.Texto;

public class Politica extends Entity<PoliticaId> {
    private Texto texto;

    public Politica(PoliticaId entityId, Texto texto) {
        super(entityId);
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }

    public void actualizarTexto(Texto texto) {
        this.texto = texto;
    }
}
