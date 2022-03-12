package domain.modulo;

import co.com.sofka.domain.generic.EventChange;
import domain.modulo.events.*;

import java.util.HashSet;

public class ModuloChange extends EventChange {
    public ModuloChange(Modulo modulo) {
        apply((ModuloCreado event) -> {
            modulo.nombre = event.nombre();
            modulo.descripcion = event.descripcion();
            modulo.contenidoId = event.ContenidoId();
            modulo.foroId = event.ForoId();
            modulo.bibliografias = new HashSet<>();
            modulo.sugerencias = new HashSet<>();
        });

        apply((SugerenciaAgregada event) -> {
            modulo.sugerencias.add(new Sugerencia(event.getSugerenciaId(), event.getTexto()));
        });

        apply((SugerenciaEliminada event) -> {
            var sugerencia = modulo.getSugerenciaPorId(event.getSugerenciaId()).orElseThrow();
            modulo.sugerencias.remove(sugerencia);
        });

        apply((BibliografiaAgregada event) -> {
            modulo.bibliografias.add(event.getBibliografiaId());
        });

        apply((BibliografiaEliminada event) -> {
            modulo.bibliografias.remove(event.getBibliografiaId());
        });

        apply((NombreActualizado event) -> {
            modulo.nombre = event.getNombre();
        });

        apply((DescripcionActualizada event) ->{
            modulo.descripcion = event.getDescripcion();
        });

        apply((TextoSugerenciaActualizado event) -> {
            var sugerencia = modulo.getSugerenciaPorId(event.getSugerenciaId()).orElseThrow();
            sugerencia.actualizarTexto(event.getTexto());
        });
    }
}