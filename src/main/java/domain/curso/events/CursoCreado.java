package domain.curso.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.values.Descripcion;
import domain.values.Nombre;

public class CursoCreado extends DomainEvent {
    private final Nombre nombre;
    private final Descripcion descripcion;


    public CursoCreado(Nombre nombre,Descripcion descripcion) {
        super("empresa.curso.cursocreado");
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
