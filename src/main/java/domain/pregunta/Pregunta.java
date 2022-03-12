package domain.pregunta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.evaluacion.events.PreguntaEliminada;
import domain.pregunta.events.CorrectaRespuestaActualizada;
import domain.pregunta.events.PreguntaCreada;
import domain.pregunta.events.RespuestaCreada;
import domain.pregunta.events.RespuestaEliminada;
import domain.pregunta.values.Correcta;
import domain.pregunta.values.PreguntaId;
import domain.pregunta.values.RespuestaId;
import domain.values.Texto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Pregunta extends AggregateEvent<PreguntaId> {
    protected Texto texto;
    protected Set<Respuesta> respuestas;

    public Pregunta(PreguntaId entityId, Texto texto) {
        super(entityId);
        appendChange(new PreguntaCreada(texto)).apply();
    }

    private Pregunta(PreguntaId preguntaId){
        super(preguntaId);
        subscribe(new PreguntaChange(this));
    }

    public static Pregunta from(PreguntaId preguntaId, List<DomainEvent> events){
        var pregunta = new Pregunta(preguntaId);
        events.forEach(pregunta::applyEvent);
        return pregunta;
    }

    public void crearRespuesta(RespuestaId respuestaId, Correcta correcta, Texto texto){
        appendChange(new RespuestaCreada(respuestaId,correcta,texto)).apply();
    }

    public void eliminarRespuesta(RespuestaId respuestaId){
        appendChange(new RespuestaEliminada(respuestaId)).apply();
    }

    public Set listarRespuestas(){
        return respuestas;
    }

    public void actualizarCorrectaRespuesta(RespuestaId respuestaId,Correcta correcta){
        appendChange(new CorrectaRespuestaActualizada(respuestaId,correcta)).apply();
    }

    public void actualizarTextoRespuesta(RespuestaId respuestaId,Texto texto){

    }

    public Optional<Respuesta> getRespuestaPorId(RespuestaId respuestaId){
        return respuestas
                .stream()
                .filter(respuesta -> respuesta.equals(respuestaId))
                .findFirst();
    }

    public Texto getTexto() {
        return texto;
    }

    public Set<Respuesta> getRespuestas() {
        return respuestas;
    }
}
