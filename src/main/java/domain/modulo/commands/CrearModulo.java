package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.contenido.values.ContenidoId;
import domain.foro.values.ForoId;
import domain.values.Descripcion;
import domain.values.Nombre;

public class CrearModulo extends Command {
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final ContenidoId contenidoId;
    private final ForoId foroId;

    public CrearModulo(Nombre nombre, Descripcion descripcion, ContenidoId contenidoId, ForoId foroId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenidoId = contenidoId;
        this.foroId = foroId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }

    public ForoId getForoId() {
        return foroId;
    }
}
