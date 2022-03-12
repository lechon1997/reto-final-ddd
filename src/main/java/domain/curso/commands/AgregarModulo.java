package domain.curso.commands;

import co.com.sofka.domain.generic.Command;
import domain.curso.values.CursoId;
import domain.modulo.values.ModuloId;

public class AgregarModulo extends Command {
    private final CursoId cursoId;
    private final ModuloId moduloId;

    public AgregarModulo(CursoId cursoId, ModuloId moduloId) {
        this.cursoId = cursoId;
        this.moduloId = moduloId;
    }

    public CursoId getCursoId() {
        return cursoId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }
}
