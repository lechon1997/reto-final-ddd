package domain.foro.values;

import co.com.sofka.domain.generic.Identity;

public class PoliticaId extends Identity{
    public PoliticaId(String uuid) {
        super(uuid);
    }

    public PoliticaId() {
        super();
    }

    public static PoliticaId of(String uuid){
        return new PoliticaId(uuid);
    }
}
