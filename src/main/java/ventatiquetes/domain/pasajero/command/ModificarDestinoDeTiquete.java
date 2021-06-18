package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Destino;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class ModificarDestinoDeTiquete implements Command {

    private final PasajeroId pasajeroId;
    private final Destino destino;

    public ModificarDestinoDeTiquete(PasajeroId pasajeroId, Destino destino) {
        this.pasajeroId = pasajeroId;
        this.destino = destino;
    }

    public PasajeroId getpasajeroId() {
        return pasajeroId;
    }

    public Destino getDestino() {
        return destino;
    }
}
