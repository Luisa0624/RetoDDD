package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.Identity;

public class AeropuertoId extends Identity {

    public AeropuertoId(){

    }

    public AeropuertoId(String id){
        super(id);
    }

    public static AeropuertoId of(String id){
        return new AeropuertoId(id);
    }
}
