package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.values.Estado;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class cambiarestadodetiquete implements Command {

    private PasajeroId pasajeroid;
    private final Estado estado;

    public cambiarestadodetiquete(PasajeroId pasajeroid, Estado estado) {
        this.pasajeroid = pasajeroid;
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }
}
