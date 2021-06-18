package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Estado;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class CambiarEstadoDeTiquete implements Command {

    private PasajeroId pasajeroId;
    private final Estado estado;

    public CambiarEstadoDeTiquete(PasajeroId pasajeroId, Estado estado) {
        this.pasajeroId = pasajeroId;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }
}
