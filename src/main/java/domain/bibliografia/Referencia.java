package domain.bibliografia;

import co.com.sofka.domain.generic.Entity;
import domain.bibliografia.values.ReferenciaId;
import domain.values.Texto;

public class Referencia extends Entity<ReferenciaId> {
    private Texto texto;

    public Referencia(ReferenciaId entityId, Texto texto) {
        super(entityId);
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }

    public void actulizarReferencia(Texto texto){
        this.texto = texto;
    }
}
