package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.NombreCompleto;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class modificarnombre implements Command {

    private final PasajeroId pasajeroid;
    private final NombreCompleto nombrecompleto;


    public modificarnombre(PasajeroId pasajeroid, NombreCompleto nombrecompleto) {
        this.pasajeroid = pasajeroid;
        this.nombrecompleto = nombrecompleto;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public NombreCompleto getNombrecompleto() {
        return nombrecompleto;
    }
}
