package domain.bibliografia;

import co.com.sofka.domain.generic.EventChange;
import domain.bibliografia.events.BibliografiaCreada;
import domain.bibliografia.events.ReferenciaAgregada;
import domain.bibliografia.events.ReferenciaEliminada;
import domain.bibliografia.events.TextoReferenciaActualizado;

import java.util.HashSet;

public class BibliografiaChange extends EventChange {
    public BibliografiaChange(Bibliografia bibliografia) {
        apply((BibliografiaCreada event) -> {
            bibliografia.descripcion = event.getDescripcion();
            bibliografia.referencias = new HashSet<>();
        });

        apply((ReferenciaAgregada event) -> {
            bibliografia.referencias.add( new Referencia(event.getReferenciaId(), event.getTexto()));
        });

        apply((ReferenciaEliminada event) -> {
            var referencia = bibliografia.getReferenciaPorId(event.getReferenciaId()).orElseThrow();
            bibliografia.referencias.remove(referencia);
        });

        apply((TextoReferenciaActualizado event) -> {
            var referencia = bibliografia.getReferenciaPorId(event.getReferenciaId()).orElseThrow();
            referencia.actulizarReferencia(event.getTexto());
        });
    }
}
