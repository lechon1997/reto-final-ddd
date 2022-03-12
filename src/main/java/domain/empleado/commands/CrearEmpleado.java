package domain.empleado.commands;

import co.com.sofka.domain.generic.Command;
import domain.empleado.values.EmpleadoId;

public class CrearEmpleado extends Command {
    private final EmpleadoId empleadoId;

    public CrearEmpleado(EmpleadoId empleadoId) {
        this.empleadoId = empleadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
