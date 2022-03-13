package domain.foro.commands;

import co.com.sofka.domain.generic.Command;
import domain.foro.values.ComentarioMentor;
import domain.foro.values.ConsultaId;
import domain.foro.values.ForoId;
import domain.values.Texto;

public class ActualizarComentarioMentorConsulta extends Command {
    private final ForoId foroId;
    private final ConsultaId consultaId;
    private final ComentarioMentor comentarioMentor;

    public ActualizarComentarioMentorConsulta(ForoId foroId, ConsultaId consultaId, ComentarioMentor comentarioMentor) {
        this.foroId = foroId;
        this.consultaId = consultaId;
        this.comentarioMentor = comentarioMentor;
    }

    public ForoId getForoId() {
        return foroId;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public ComentarioMentor getComentarioMentor() {
        return comentarioMentor;
    }
}
