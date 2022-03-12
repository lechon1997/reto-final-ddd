package domain.bibliografia;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.bibliografia.events.BibliografiaCreada;
import domain.bibliografia.events.ReferenciaAgregada;
import domain.bibliografia.events.ReferenciaEliminada;
import domain.bibliografia.events.TextoReferenciaActualizado;
import domain.bibliografia.values.BibliografiaId;
import domain.bibliografia.values.ReferenciaId;
import domain.modulo.Sugerencia;
import domain.modulo.values.SugerenciaId;
import domain.values.Descripcion;
import domain.values.Texto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Bibliografia extends AggregateEvent<BibliografiaId> {
    protected Set<Referencia> referencias;
    protected Descripcion descripcion;

    public Bibliografia(BibliografiaId entityId, Descripcion descripcion) {
        super(entityId);
        appendChange(new BibliografiaCreada(descripcion)).apply();
    }

    private Bibliografia(BibliografiaId bibliografiaId){
        super(bibliografiaId);
        subscribe(new BibliografiaChange(this));
    }

    public static Bibliografia from(BibliografiaId bibliografiaId, List<DomainEvent> events){
        var bibliografia = new Bibliografia(bibliografiaId);
        events.forEach(bibliografia::applyEvent);
        return bibliografia;
    }

    public void agregarReferencia(ReferenciaId referenciaId, Texto texto){
        appendChange(new ReferenciaAgregada(referenciaId,texto)).apply();
    }

    public void eliminarReferencia(ReferenciaId referenciaId){
        appendChange(new ReferenciaEliminada(referenciaId)).apply();
    }

    public Set listarReferencias(){
        return referencias;
    }

    public void actualizarTextoReferencia(ReferenciaId referenciaId, Texto texto){
        appendChange(new TextoReferenciaActualizado(referenciaId,texto)).apply();
    }

    public Optional<Referencia> getReferenciaPorId(ReferenciaId referenciaId){
        return referencias
                .stream()
                .filter( referencia -> referencia.identity().equals(referenciaId))
                .findFirst();
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
