package domain.empleado;

import co.com.sofka.domain.generic.EventChange;
import domain.empleado.events.EmpleadoCreado;

public class EmpleadoChange extends EventChange {
    public EmpleadoChange(Empleado empleado){
        apply((EmpleadoCreado event) -> {
            empleado.nombreEmpleado = event.nombreEmpleado();
            empleado.contacto = event.contacto();
            empleado.direccion = event.direccion();
        });
    }
}
