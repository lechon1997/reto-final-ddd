package domain.foro.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.values.ComentarioMentor;
import domain.foro.values.ConsultaId;
import domain.values.Texto;

public class ComentarioMentorConsultaActualizado extends DomainEvent {
    private final ConsultaId consultaId;
    private final ComentarioMentor comentarioMentor;

    public ComentarioMentorConsultaActualizado(ConsultaId consultaId, ComentarioMentor comentarioMentor) {
        super("empresa.foro.comentariomentorconsultaacutalizado");
        this.consultaId = consultaId;
        this.comentarioMentor = comentarioMentor;
    }

    public ConsultaId getConsultaId() {
        return consultaId;
    }

    public ComentarioMentor getComentarioMentor() {
        return comentarioMentor;
    }
}
