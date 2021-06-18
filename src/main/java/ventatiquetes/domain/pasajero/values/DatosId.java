package ventatiquetes.domain.pasajero.values;

import co.com.sofka.domain.generic.Identity;

public class DatosId extends Identity {

    public DatosId(){

    }

    private DatosId(String id){
        super(id);
    }

    public static DatosId of(String id){
        return new DatosId(id);
    }
}
