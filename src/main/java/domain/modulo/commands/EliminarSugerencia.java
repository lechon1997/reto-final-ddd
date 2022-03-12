package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.modulo.values.ModuloId;
import domain.modulo.values.SugerenciaId;

public class EliminarSugerencia extends Command {
    private final ModuloId moduloId;
    private final SugerenciaId sugerenciaId;

    public EliminarSugerencia(ModuloId moduloId, SugerenciaId sugerenciaId) {
        this.moduloId = moduloId;
        this.sugerenciaId = sugerenciaId;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public SugerenciaId getSugerenciaId() {
        return sugerenciaId;
    }
}
