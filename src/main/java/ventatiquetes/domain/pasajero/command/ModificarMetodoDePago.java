package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.MetododePago;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class ModificarMetodoDePago implements Command {

    private final PasajeroId pasajeroId;
    private final MetododePago metododepago;


    public ModificarMetodoDePago(PasajeroId pasajeroId, MetododePago metododepago) {
        this.pasajeroId = pasajeroId;
        this.metododepago = metododepago;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }

    public MetododePago getMetododepago() {
        return metododepago;
    }
}
