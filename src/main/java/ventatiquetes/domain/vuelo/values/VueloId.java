package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.Identity;

public class VueloId extends Identity {

    public VueloId(){
    }

    public VueloId(String id){
        super(id);
    }

    public static VueloId of(String id){
        return new VueloId(id);
    }
}
