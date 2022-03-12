package domain.contenido;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.contenido.events.ContenidoCreado;
import domain.contenido.events.MaterialCreado;
import domain.contenido.events.MaterialEliminado;
import domain.contenido.events.TextoMaterialActualizado;
import domain.contenido.values.ContenidoId;
import domain.contenido.values.MaterialId;
import domain.evaluacion.values.EvaluacionId;
import domain.values.Descripcion;
import domain.values.Texto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Contenido extends AggregateEvent<ContenidoId> {
    protected Descripcion descripcion;
    protected Set<Material> materiales;
    protected EvaluacionId evaluacionId;

    public Contenido(ContenidoId entityId, Descripcion descripcion, EvaluacionId evaluacionId) {
        super(entityId);
        appendChange(new ContenidoCreado(descripcion,evaluacionId)).apply();
    }

    private Contenido(ContenidoId contenidoId){
        super(contenidoId);
        subscribe(new ContenidoChange(this));
    }

    public static Contenido from(ContenidoId contenidoId, List<DomainEvent> events){
        var contenido = new Contenido(contenidoId);
        events.forEach(contenido::applyEvent);
        return contenido;
    }

    public void crearMaterial(MaterialId materialId, Texto texto){
        appendChange(new MaterialCreado(materialId,texto)).apply();
    }

    public void eliminarMaterial(MaterialId materialId){
        appendChange(new MaterialEliminado(materialId)).apply();
    }

    public Set listarMateriales(){
        return materiales;
    }

    public void actualizarTextoMaterial(MaterialId materialId, Texto texto){
        appendChange(new TextoMaterialActualizado(materialId,texto)).apply();
    }

    public Optional<Material> getMaterialPorId(MaterialId materialId){
        return materiales
                .stream()
                .filter(material -> material.identity().equals(materialId))
                .findFirst();
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Set<Material> getMateriales() {
        return materiales;
    }

    public EvaluacionId getEvaluacionId() {
        return evaluacionId;
    }
}
