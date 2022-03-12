package domain.curso;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.curso.events.*;
import domain.curso.values.CursoId;
import domain.empleado.values.EmpleadoId;
import domain.modulo.values.ModuloId;
import domain.values.Descripcion;
import domain.values.Nombre;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Curso extends AggregateEvent<CursoId> {
    protected Set<EmpleadoId> empleados;
    protected Set<ModuloId> modulos;
    protected Descripcion descripcion;
    protected Nombre nombre;

    public Curso(CursoId entityId,Nombre nombre,Descripcion descripcion) {
        super(entityId);
        appendChange(new CursoCreado(nombre,descripcion)).apply();
    }

    private Curso(CursoId cursoId){
        super(cursoId);
        subscribe(new CursoChange(this));
    }

    public static Curso from(CursoId cursoId, List<DomainEvent> events){
        var curso = new Curso(cursoId);
        events.forEach(curso::applyEvent);
        return curso;
    }

    public void agregarModulo(ModuloId moduloId){
        Objects.requireNonNull(moduloId);
        appendChange(new ModuloAgregado(moduloId)).apply();
    }

    public Set listarModulos(){
        return this.modulos;
    }

    public void eliminarModulo(ModuloId moduloId){
        Objects.requireNonNull(moduloId);
        appendChange(new ModuloEliminado(moduloId)).apply();
    }

    public void inscribirEmpleado(EmpleadoId empleadoId){
        Objects.requireNonNull(empleadoId);
        appendChange(new EmpleadoInscripto(empleadoId)).apply();
    }

    public Set listarEmpleados(){
        return this.empleados();
    }

    public void desvincularEmpleado(EmpleadoId empleadoId){
        Objects.requireNonNull(empleadoId);
        appendChange(new EmpleadoDesvinculado(empleadoId)).apply();
    }

    public Set<EmpleadoId> empleados() {
        return empleados;
    }

    public Set<ModuloId> modulos() {
        return modulos;
    }

    public Descripcion descripcion() {
        return descripcion;
    }

    public Nombre nombre() {
        return nombre;
    }
}
