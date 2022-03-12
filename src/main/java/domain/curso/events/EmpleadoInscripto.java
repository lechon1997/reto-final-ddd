package domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.values.EmpleadoId;

public class EmpleadoInscripto extends DomainEvent {
    private final EmpleadoId empleadoId;

    public EmpleadoInscripto(EmpleadoId empleadoId) {
        super("empresa.curso.empleadoinscripto");
        this.empleadoId = empleadoId;
    }

    public EmpleadoId empleadoId() {
        return empleadoId;
    }
}
