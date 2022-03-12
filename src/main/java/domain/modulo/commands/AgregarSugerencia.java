package domain.modulo.commands;

import co.com.sofka.domain.generic.Command;
import domain.modulo.values.ModuloId;
import domain.modulo.values.SugerenciaId;
import domain.values.Texto;

public class AgregarSugerencia extends Command {
    private final ModuloId moduloId;
    private final SugerenciaId sugerenciaId;
    private final Texto texto;

    public AgregarSugerencia(ModuloId moduloId, SugerenciaId sugerenciaId, Texto texto) {
        this.moduloId = moduloId;
        this.sugerenciaId = sugerenciaId;
        this.texto = texto;
    }

    public ModuloId getModuloId() {
        return moduloId;
    }

    public SugerenciaId getSugerenciaId() {
        return sugerenciaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
