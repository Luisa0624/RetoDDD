package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Origen;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class ModificarOrigenDeTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final Origen origen;

    public ModificarOrigenDeTiquete(PasajeroId pasajeroId, Origen origen) {
        this.pasajeroId = pasajeroId;
        this.origen = origen;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }

    public Origen getOrigen() {
        return origen;
    }
}
