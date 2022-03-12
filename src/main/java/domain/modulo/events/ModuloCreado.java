package domain.modulo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.values.ContenidoId;
import domain.foro.values.ForoId;
import domain.values.Descripcion;
import domain.values.Nombre;

public class ModuloCreado extends DomainEvent {
    private final Nombre nombre;
    private final Descripcion descripcion;
    private final ContenidoId contenidoId;
    private final ForoId foroId;

    public ModuloCreado(Nombre nombre, Descripcion descripcion, ContenidoId contenidoId, ForoId foroId) {
        super("empresa.modulo.modulocreado");
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.contenidoId = contenidoId;
        this.foroId = foroId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public ContenidoId ContenidoId() {
        return contenidoId;
    }

    public ForoId ForoId() {
        return foroId;
    }
}
