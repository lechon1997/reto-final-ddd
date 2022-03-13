package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ConsultaId;
import domain.foro.values.ForoId;

public class EliminarConsulta extends Command {
    private final ForoId foroId;
    private final ConsultaId consultaId;

    public EliminarConsulta(ForoId foroId, ConsultaId consultaId) {
        this.foroId = foroId;
        this.consultaId = consultaId;
    }

    public ForoId getForoId() {
        return foroId;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }
}
