package domain.contenido.commands;

import co.com.sofka.domain.generic.Command;
import domain.contenido.Material;
import domain.contenido.values.ContenidoId;
import domain.contenido.values.MaterialId;
import domain.values.Texto;

public class CrearMaterial extends Command {
    private final ContenidoId contenidoId;
    private final MaterialId materialId;
    private final Texto texto;

    public CrearMaterial(ContenidoId contenidoId, MaterialId materialId, Texto texto) {
        this.contenidoId = contenidoId;
        this.materialId = materialId;
        this.texto = texto;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }

    public MaterialId getMaterialId() {
        return materialId;
    }

    public Texto getTexto() {
        return texto;
    }
}
