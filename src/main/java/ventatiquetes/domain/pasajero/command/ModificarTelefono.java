package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.PasajeroId;
import ventatiquetes.domain.pasajero.values.Telefono;

public class ModificarTelefono implements Command {

    private final PasajeroId pasajeroId;
    private final Telefono telefono;

    public ModificarTelefono(PasajeroId pasajeroId, Telefono telefono) {
        this.pasajeroId = pasajeroId;
        this.telefono = telefono;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
