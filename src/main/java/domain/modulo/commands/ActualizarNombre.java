package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.modulo.events.NombreActualizado;
import domain.modulo.values.ModuloId;
import domain.values.Nombre;

public class ActualizarNombre extends Command {
    private final ModuloId moduloId;
    private final Nombre nombre;

    public ActualizarNombre(ModuloId moduloId, Nombre nombre) {
        this.moduloId = moduloId;
        this.nombre = nombre;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
