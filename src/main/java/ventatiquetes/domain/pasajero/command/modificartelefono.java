package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.PasajeroId;
import ventatiquetes.domain.pasajero.values.Telefono;

public class modificartelefono implements Command {

    private final PasajeroId pasajeroid;
    private final Telefono telefono;

    public modificartelefono(PasajeroId pasajeroid, Telefono telefono) {
        this.pasajeroid = pasajeroid;
        this.telefono = telefono;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
