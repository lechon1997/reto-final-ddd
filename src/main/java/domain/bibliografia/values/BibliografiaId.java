package domain.bibliografia.values;

import co.com.sofka.domain.generic.Identity;

import java.util.Objects;

public class BibliografiaId extends Identity {
    public BibliografiaId(String uuid) {
        super(uuid);
    }

    public BibliografiaId() {
        super();
    }

    public static BibliografiaId of(String uuid){
        Objects.requireNonNull(uuid,"ID obligatorio");
        return new BibliografiaId(uuid);
    }
}
