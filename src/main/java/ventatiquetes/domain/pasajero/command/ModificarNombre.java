package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.NombreCompleto;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class ModificarNombre implements Command {

    private final PasajeroId pasajeroId;
    private final NombreCompleto nombrecompleto;


    public ModificarNombre(PasajeroId pasajeroId, NombreCompleto nombrecompleto) {
        this.pasajeroId = pasajeroId;
        this.nombrecompleto = nombrecompleto;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }

    public NombreCompleto getNombrecompleto() {
        return nombrecompleto;
    }
}
