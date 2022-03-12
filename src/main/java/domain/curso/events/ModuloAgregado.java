package domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.modulo.values.ModuloId;
import domain.values.Descripcion;
import domain.values.Nombre;

public class ModuloAgregado extends DomainEvent {
    private final ModuloId moduloId;

    public ModuloAgregado(ModuloId moduloId) {
        super("empresa.curso.moduloagregado");
        this.moduloId = moduloId;
    }

    public ModuloId moduloId() {
        return moduloId;
    }

}
