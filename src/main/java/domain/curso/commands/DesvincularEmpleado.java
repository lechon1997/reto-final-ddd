package domain.curso.commands;

import co.com.sofka.domain.generic.Command;
import domain.curso.values.CursoId;
import domain.empleado.values.EmpleadoId;

public class DesvincularEmpleado extends Command {
    private final CursoId cursoId;
    private final EmpleadoId empleadoId;

    public DesvincularEmpleado(CursoId cursoId, EmpleadoId empleadoId) {
        this.cursoId = cursoId;
        this.empleadoId = empleadoId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }
}
