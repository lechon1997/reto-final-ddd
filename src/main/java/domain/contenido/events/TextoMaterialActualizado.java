package domain.contenido.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.values.MaterialId;
import domain.values.Texto;

public class TextoMaterialActualizado extends DomainEvent {
    private final MaterialId materialId;
    private final Texto texto;

    public TextoMaterialActualizado(MaterialId materialId, Texto texto) {
        super("empresa.contenido.textomaterialactulizado");
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
