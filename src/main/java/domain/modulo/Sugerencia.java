package domain.modulo;

import co.com.sofka.domain.generic.Entity;
import domain.modulo.values.SugerenciaId;
import domain.values.Texto;

public class Sugerencia extends Entity<SugerenciaId> {
    private Texto texto;

    public Sugerencia(SugerenciaId entityId, Texto texto) {
        super(entityId);
        this.texto = texto;
    }

    public Texto getTexto() {
        return texto;
    }

    public void actualizarTexto(Texto texto){
        this.texto = texto;
    }

}
