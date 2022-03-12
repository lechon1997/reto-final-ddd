package domain.contenido.commands;

import co.com.sofka.domain.generic.Command;
import domain.contenido.values.ContenidoId;
import domain.contenido.values.MaterialId;

public class eliminarMaterial extends Command {
    private final ContenidoId contenidoId;
    private final MaterialId materialId;

    public eliminarMaterial(ContenidoId contenidoId, MaterialId materialId) {
        this.contenidoId = contenidoId;
        this.materialId = materialId;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }
}
