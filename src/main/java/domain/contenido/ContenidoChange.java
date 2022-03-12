package domain.contenido;

import co.com.sofka.domain.generic.EventChange;
import domain.contenido.events.ContenidoCreado;

public class ContenidoChange extends EventChange {
    public ContenidoChange(Contenido contenido) {
        apply((ContenidoCreado event) -> {
            contenido.descripcion = event.getDescripcion();
        });
    }
}
