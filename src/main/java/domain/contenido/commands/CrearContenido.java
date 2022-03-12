package domain.contenido.commands;

import co.com.sofka.domain.generic.Command;
import domain.contenido.values.ContenidoId;

public class CrearContenido extends Command {
    private final ContenidoId contenidoId;

    public CrearContenido(ContenidoId contenidoId) {
        this.contenidoId = contenidoId;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }
}
