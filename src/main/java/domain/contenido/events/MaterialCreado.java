package domain.contenido.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.values.MaterialId;
import domain.values.Texto;

public class MaterialCreado extends DomainEvent {
    private final MaterialId materialId;
    private final Texto texto;

    public MaterialCreado(MaterialId materialId, Texto texto) {
        super("empresa.contenido.materialcreado");
        this.materialId = materialId;
        this.texto = texto;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

    public Texto getTexto() {
        return texto;
    }
}
