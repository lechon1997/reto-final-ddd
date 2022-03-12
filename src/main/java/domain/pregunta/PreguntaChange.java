package domain.pregunta;

import co.com.sofka.domain.generic.EventChange;
import domain.pregunta.events.*;

import java.util.HashSet;

public class PreguntaChange extends EventChange {
    public PreguntaChange(Pregunta pregunta) {
        apply((PreguntaCreada event) -> {
            pregunta.texto = event.getTexto();
            pregunta.respuestas = new HashSet<>();
        });

        apply((RespuestaCreada event) -> {
            pregunta.respuestas.add(new Respuesta(event.getRespuestaId(),event.getCorrecta(),event.getTexto()));
        });

        apply((RespuestaEliminada event) -> {
            var respuesta = pregunta.getRespuestaPorId(event.getRespuestaId()).orElseThrow();
            pregunta.respuestas.remove(respuesta);
        });

        apply((CorrectaRespuestaActualizada event) -> {
            var respuesta = pregunta.getRespuestaPorId(event.getRespuestaId()).orElseThrow();
            respuesta.actualizarCorrecta(event.getCorrecta());
        });

        apply((TextoRespuestaActualizado event) -> {
            var respuesta = pregunta.getRespuestaPorId(event.getRespuestaId()).orElseThrow();
            respuesta.actualizarTexto(event.getTexto());
        });
    }
}
