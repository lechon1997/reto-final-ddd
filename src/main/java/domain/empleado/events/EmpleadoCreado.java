package domain.empleado.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.values.Contacto;
import domain.empleado.values.Direccion;
import domain.empleado.values.NombreEmpleado;

public class EmpleadoCreado extends DomainEvent {
    private final NombreEmpleado nombreEmpleado;
    private final Contacto contacto;
    private final Direccion direccion;

    public EmpleadoCreado(NombreEmpleado nombreEmpleado, Contacto contacto, Direccion direccion) {
        super("empresa.empleado.empleadocreado");
        this.nombreEmpleado = nombreEmpleado;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    public NombreEmpleado nombreEmpleado() {
        return nombreEmpleado;
    }

    public Contacto contacto() {
        return contacto;
    }

    public Direccion direccion() {
        return direccion;
    }
}
