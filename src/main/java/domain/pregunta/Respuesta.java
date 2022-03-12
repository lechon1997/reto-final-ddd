package domain.pregunta;

import co.com.sofka.domain.generic.Entity;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

public class Respuesta extends Entity<RespuestaId> {
    private Correcta correcta;
    private Texto texto;

    public Respuesta(RespuestaId entityId, Correcta correcta, Texto texto) {
        super(entityId);
        this.correcta = correcta;
        this.texto = texto;
    }

    public Correcta getCorrecta() {
        return correcta;
    }

    public Texto getTexto() {
        return texto;
    }

    public void actualizarCorrecta(Correcta correcta) {
        this.correcta = correcta;
    }

    public void actualizarTexto(Texto texto) {
        this.texto = texto;
    }
}
