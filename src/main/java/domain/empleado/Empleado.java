package domain.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.events.EmpleadoCreado;
import domain.empleado.values.Contacto;
import domain.empleado.values.Direccion;
import domain.empleado.values.EmpleadoId;
import domain.empleado.values.NombreEmpleado;

import java.util.List;

public class Empleado extends AggregateEvent<EmpleadoId> {
    protected NombreEmpleado nombreEmpleado;
    protected Contacto contacto;
    protected Direccion direccion;

    public Empleado(EmpleadoId entityId, NombreEmpleado nombreEmpleado, Contacto contacto, Direccion direccion) {
        super(entityId);
        appendChange(new EmpleadoCreado(nombreEmpleado,contacto,direccion)).apply();
    }

    private Empleado(EmpleadoId empleadoId){
        super(empleadoId);
        subscribe(new EmpleadoChange(this));
    }

    public static Empleado from(EmpleadoId empleadoId, List<DomainEvent> events){
        var empleado = new Empleado(empleadoId);
        events.forEach(empleado::applyEvent);
        return empleado;
    }

    public NombreEmpleado getNombreEmpleado() {
        return nombreEmpleado;
    }

    public Contacto getContacto() {
        return contacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
