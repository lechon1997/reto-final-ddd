package domain.bibliografia.commands;

import co.com.sofka.domain.generic.Command;
import domain.values.Descripcion;

public class CrearBibliografia extends Command {
    private final Descripcion descripcion;

    public CrearBibliografia(Descripcion descripcion) {
        this.descripcion = descripcion;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
