package domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.values.EmpleadoId;

public class EmpleadoDesvinculado extends DomainEvent {
    private final EmpleadoId empleadoId;

    public EmpleadoDesvinculado(EmpleadoId empleadoId) {
        super("empresa.curso.empleadodesvinculado");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }
}
