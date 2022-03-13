package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ConsultaId;
import domain.foro.values.ForoId;
import domain.values.Texto;

public class ActualizarTextoConsulta extends Command {
    private final ForoId foroId;
    private final ConsultaId consultaId;
    private final Texto texto;

    public ActualizarTextoConsulta(ForoId foroId, ConsultaId consultaId, Texto texto) {
        this.foroId = foroId;
        this.consultaId = consultaId;
        this.texto = texto;
    }

    public ForoId getForoId() {
        return foroId;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public Texto getTexto() {
        return texto;
    }
}
