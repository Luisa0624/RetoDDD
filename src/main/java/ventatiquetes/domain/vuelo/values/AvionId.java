package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.Identity;

public class AvionId extends Identity {

    public AvionId(){

    }

    private AvionId(String id){
        super(id);
    }

    public static AvionId of(String id){
        return new AvionId(id);
    }
}
