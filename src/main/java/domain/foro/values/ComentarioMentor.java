package domain.foro.values;

import co.com.sofka.domain.generic.ValueObject;

public class ComentarioMentor implements ValueObject<String> {
    private final String comentarioMentor;

    public ComentarioMentor(String comentarioMentor) {
        this.comentarioMentor = comentarioMentor;
    }


    @Override
    public String value() {
        return comentarioMentor;
    }
}
