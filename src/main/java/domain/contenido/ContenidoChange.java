package domain.contenido;

import co.com.sofka.domain.generic.EventChange;
import domain.contenido.events.ContenidoCreado;
import domain.contenido.events.MaterialCreado;
import domain.contenido.events.MaterialEliminado;
import domain.contenido.events.TextoMaterialActualizado;

import java.util.HashSet;

public class ContenidoChange extends EventChange {
    public ContenidoChange(Contenido contenido) {
        apply((ContenidoCreado event) -> {
            contenido.descripcion = event.getDescripcion();
            contenido.materiales = new HashSet<>();
            contenido.evaluacionId = event.getEvaluacionId();
        });

        apply((MaterialCreado event) -> {
            contenido.materiales.add(new Material(event.getMaterialId(),event.getTexto()));
        });

        apply((MaterialEliminado event) -> {
            var material = contenido.getMaterialPorId(event.getMaterialId()).orElseThrow();
            contenido.materiales.remove(material);
        });

        apply((TextoMaterialActualizado event) -> {
            var material = contenido.getMaterialPorId(event.getMaterialId()).orElseThrow();
            material.actualizarTexto(event.getTexto());
        });
    }
}
