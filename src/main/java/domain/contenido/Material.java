package domain.contenido;

import co.com.sofka.domain.generic.Entity;
import domain.contenido.values.MaterialId;
import domain.values.Texto;

public class Material extends Entity<MaterialId> {
    private Texto texto;

    public Material(MaterialId entityId, Texto texto) {
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
