package domain.curso.commands;

import co.com.sofka.domain.generic.Command;
import domain.curso.values.CursoId;
import domain.values.Descripcion;
import domain.values.Nombre;

public class CrearCurso extends Command {
    private final CursoId cursoId;
    private final Nombre nombre;
    private final Descripcion descripcion;

    public CrearCurso(CursoId cursoId, Nombre nombre, Descripcion descripcion) {
        this.cursoId = cursoId;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public CursoId getCursoId() {
        return cursoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
