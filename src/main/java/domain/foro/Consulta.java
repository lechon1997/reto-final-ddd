package domain.foro;

import co.com.sofka.domain.generic.Entity;
import domain.foro.values.ComentarioMentor;
import domain.foro.values.ConsultaId;
import domain.values.Texto;

public class Consulta extends Entity<ConsultaId> {
    private Texto texto;
    private ComentarioMentor comentarioMentor;

    public Consulta(ConsultaId entityId, Texto texto) {
        super(entityId);
        this.texto = texto;
        this.comentarioMentor = null;
    }

    public ComentarioMentor getComentarioMentor() {
        return comentarioMentor;
    }

    public Texto getTexto() {
        return texto;
    }

    public void actualizarTexto(Texto texto) {
        this.texto = texto;
    }

    public void actualizarComentarioMentor(ComentarioMentor comentarioMentor) {
        this.comentarioMentor = comentarioMentor;
    }
}
