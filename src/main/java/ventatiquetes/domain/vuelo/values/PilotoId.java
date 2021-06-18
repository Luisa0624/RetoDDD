package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.Identity;

public class PilotoId extends Identity {

    public PilotoId(){

    }

    private PilotoId(String id){
        super(id);
    }

    public static PilotoId of(String id){
        return new PilotoId(id);
    }
}
