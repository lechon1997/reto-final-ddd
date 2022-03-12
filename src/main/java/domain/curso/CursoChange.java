package domain.curso;

import co.com.sofka.domain.generic.EventChange;
import domain.curso.events.*;

import java.util.HashSet;

public class CursoChange extends EventChange {
    public CursoChange(Curso curso){
        apply((CursoCreado event) -> {
            curso.nombre = event.getNombre();
            curso.descripcion = event.getDescripcion();
            curso.empleados = new HashSet<>();
            curso.modulos = new HashSet<>();
        });

        apply((ModuloAgregado event) -> {
            curso.modulos.add(event.moduloId());
        });

        apply((ModuloEliminado event) -> {
            curso.modulos.remove(event.moduloId());
        });

        apply((EmpleadoInscripto event) -> {
            curso.empleados.add(event.empleadoId());
        });

        apply((EmpleadoDesvinculado event) -> {
            curso.empleados.remove(event.empleadoId());
        });

    }
}
