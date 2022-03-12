package domain.foro;

import co.com.sofka.domain.generic.EventChange;
import domain.foro.events.ForoCreado;

public class ForoChange extends EventChange {
    public ForoChange(Foro foro){
        apply((ForoCreado event) -> {
            foro.descripcion = event.getDescripcion();
        });
    }
}
