package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.MetododePago;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class modificarmetododepago implements Command {

    private final PasajeroId pasajeroid;
    private final MetododePago metododepago;


    public modificarmetododepago(PasajeroId pasajeroid, MetododePago metododepago) {
        this.pasajeroid = pasajeroid;
        this.metododepago = metododepago;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public MetododePago getMetododepago() {
        return metododepago;
    }
}
