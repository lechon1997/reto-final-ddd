package domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.modulo.values.ModuloId;

public class ModuloEliminado extends DomainEvent {
    private final ModuloId moduloId;

    public ModuloEliminado(ModuloId moduloId) {
        super("empresa.curso.moduloeliminado");
        this.moduloId = moduloId;
    }

    public ModuloId moduloId() {
        return moduloId;
    }
}
