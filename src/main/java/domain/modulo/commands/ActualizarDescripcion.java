package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.values.Descripcion;

public class ActualizarDescripcion extends Command {
    private final Descripcion descripcion;

    public ActualizarDescripcion(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
