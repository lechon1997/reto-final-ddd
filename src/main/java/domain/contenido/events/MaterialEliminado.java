package domain.contenido.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.values.MaterialId;

public class MaterialEliminado extends DomainEvent {
    private final MaterialId materialId;

    public MaterialEliminado(MaterialId materialId) {
        super("empresa.contenido.materialeliminado");
        this.materialId = materialId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}
