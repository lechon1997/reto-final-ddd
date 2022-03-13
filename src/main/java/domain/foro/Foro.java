package domain.foro;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.foro.events.*;
import domain.foro.values.ConsultaId;
import domain.foro.values.ForoId;
import domain.foro.values.PoliticaId;
import domain.values.Descripcion;
import domain.values.Texto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Foro extends AggregateEvent<ForoId> {
    protected Descripcion descripcion;
    protected Set<Politica> politicas;
    protected Set<Consulta> consultas;

    public Foro(ForoId entityId, Descripcion descripcion) {
        super(entityId);
        appendChange(new ForoCreado(descripcion)).apply();
    }

    private Foro(ForoId foroId){
        super(foroId);
        subscribe(new ForoChange(this));
    }

    public static Foro from(ForoId foroId, List<DomainEvent> events){
        var foro = new Foro(foroId);
        events.forEach(foro::applyEvent);
        return foro;
    }

    public void agregarConsulta(ConsultaId consultaId, Texto texto){
        appendChange(new ConsultaAgregada(consultaId,texto)).apply();
    }

    public void eliminarConsulta(ConsultaId consultaId){
        appendChange(new ConsultaEliminada(consultaId)).apply();
    }

    public Set listarConsultas(){
        return consultas;
    }

    public void agregarPolitica(PoliticaId politicaId, Texto texto){
        appendChange(new PoliticaAgregada(politicaId, texto)).apply();
    }

    public void eliminarPolitica(PoliticaId politicaId){
        appendChange(new PoliticaEliminada(politicaId)).apply();
    }

    public void actualizarTextoConsulta(ConsultaId consultaId, Texto texto){
        appendChange(new TextoConsultaActualizado(consultaId,texto)).apply();
    }

    public void actualizarComentarioMentorConsulta(ConsultaId consultaId, Texto texto){

    }
    public Optional<Consulta> getConsultaPorId(ConsultaId consultaId){
        return consultas
                .stream()
                .filter( consulta -> consulta.equals(consultaId))
                .findFirst();
    }

    public Optional<Politica> getPoliticaPorId(PoliticaId politicaId){
        return politicas
                .stream()
                .filter(politica -> politica.equals(politicaId))
                .findFirst();
    }
}
