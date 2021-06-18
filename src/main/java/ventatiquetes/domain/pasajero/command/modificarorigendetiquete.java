package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Origen;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class modificarorigendetiquete implements Command {

    private final PasajeroId pasajeroid;
    private final Origen origen;

    public modificarorigendetiquete(PasajeroId pasajeroid, Origen origen) {
        this.pasajeroid = pasajeroid;
        this.origen = origen;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public Origen getOrigen() {
        return origen;
    }
}
