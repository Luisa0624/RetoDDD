package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Destino;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class modificardestinodetiquete implements Command {

    private final PasajeroId pasajeroid;
    private final Destino destino;

    public modificardestinodetiquete(PasajeroId pasajeroid, Destino destino) {
        this.pasajeroid = pasajeroid;
        this.destino = destino;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public Destino getDestino() {
        return destino;
    }
}
