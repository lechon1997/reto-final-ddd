package domain.modulo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.values.BibliografiaId;
import domain.contenido.values.ContenidoId;
import domain.foro.values.ForoId;
import domain.modulo.events.*;
import domain.modulo.values.ModuloId;
import domain.modulo.values.SugerenciaId;
import domain.values.Descripcion;
import domain.values.Nombre;
import domain.values.Texto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Modulo extends AggregateEvent<ModuloId> {
    protected Nombre nombre;
    protected Descripcion descripcion;
    protected Set<BibliografiaId> bibliografias;
    protected Set<Sugerencia> sugerencias;
    protected ContenidoId contenidoId;
    protected ForoId foroId;

    public Modulo(ModuloId entityId, Nombre nombre, Descripcion descripcion, ContenidoId contenidoId, ForoId foroId) {
        super(entityId);
        appendChange(new ModuloCreado(nombre,descripcion, contenidoId, foroId)).apply();
    }

    private Modulo(ModuloId moduloId){
        super(moduloId);
        subscribe(new ModuloChange(this));
    }

    public static Modulo from(ModuloId moduloId, List<DomainEvent> events){
        var modulo = new Modulo(moduloId);
        events.forEach(modulo::applyEvent);
        return modulo;
    }

    public void agregarSugerencia(SugerenciaId sugerenciaId, Texto texto){
        appendChange(new SugerenciaAgregada(sugerenciaId,texto)).apply();
    }

    public void eliminarSugerencia(SugerenciaId sugerenciaId){
        appendChange(new SugerenciaEliminada(sugerenciaId)).apply();
    }

    public Optional<Sugerencia> getSugerenciaPorId(SugerenciaId sugerenciaId){
        return sugerencias
                .stream()
                .filter( sugerencia -> sugerencia.identity().equals(sugerenciaId))
                .findFirst();
    }

    public Set listarSugerencias(){
        return sugerencias;
    }

    public void agregarBibliografia(BibliografiaId bibliografiaId){
        appendChange(new BibliografiaAgregada(bibliografiaId)).apply();
    }

    public void eliminarBibliografia(BibliografiaId bibliografiaId){
        appendChange(new BibliografiaEliminada(bibliografiaId)).apply();
    }

    public void actualizarNombre(Nombre nombre) {
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public void actualizarDescripcion(Descripcion descripcion) {
        appendChange(new DescripcionActualizada(descripcion)).apply();
    }

    public void actualizarTextoSugerencia(SugerenciaId sugerenciaId,Texto texo){
        appendChange(new TextoSugerenciaActualizado(sugerenciaId,texo)).apply();
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Set<BibliografiaId> getBibliografias() {
        return bibliografias;
    }

    public Set<Sugerencia> getSugerencias() {
        return sugerencias;
    }

    public ContenidoId getContenidoId() {
        return contenidoId;
    }

    public ForoId getForoId() {
        return foroId;
    }
}
