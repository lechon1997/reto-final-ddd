package domain.foro;

import co.com.sofka.domain.generic.EventChange;
import domain.foro.events.*;

import java.util.HashSet;

public class ForoChange extends EventChange {
    public ForoChange(Foro foro){
        apply((ForoCreado event) -> {
            foro.descripcion = event.getDescripcion();
            foro.consultas = new HashSet<>();
            foro.politicas = new HashSet<>();
        });

        apply((ConsultaAgregada event) ->{
            foro.consultas.add(new Consulta(event.getConsultaId(),event.getTexto()));
        });

        apply((ConsultaEliminada event)->{
            var consulta = foro.getConsultaPorId(event.getConsultaId()).orElseThrow();
            foro.consultas.remove(consulta);
        });

        apply((PoliticaAgregada event) -> {
            foro.politicas.add(new Politica(event.getPoliticaId(), event.getTexto()));
        });

        apply((PoliticaEliminada event) -> {
            var politica = foro.getPoliticaPorId(event.getPoliticaId()).orElseThrow();
            foro.politicas.remove(politica);
        });

        apply((TextoConsultaActualizado event) -> {
            var consulta = foro.getConsultaPorId(event.getConsultaId()).orElseThrow();
            consulta.actualizarTexto(event.getTexto());
        });

        apply((ComentarioMentorConsultaActualizado event) -> {
            var consulta = foro.getConsultaPorId(event.getConsultaId()).orElseThrow();
            consulta.actualizarComentarioMentor(event.getComentarioMentor());
        });
    }
}
