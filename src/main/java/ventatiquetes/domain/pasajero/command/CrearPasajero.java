package ventatiquetes.domain.pasajero.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.pasajero.Datos;
import ventatiquetes.domain.pasajero.Pago;
import ventatiquetes.domain.pasajero.Tiquete;
import ventatiquetes.domain.pasajero.values.NombreCompleto;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class CrearPasajero implements Command {

    private final NombreCompleto nombrecompleto;
    private final Pago pago;
    private final Datos datos;
    private final Tiquete tiquete;

    public CrearPasajero(PasajeroId pasajeroId, NombreCompleto nombrecompleto, Datos datos, Pago pago, Tiquete tiquete) {
        this.nombrecompleto=nombrecompleto;
        this.pago=pago;
        this.datos=datos;
        this.tiquete=tiquete;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public Pago getPago() {
        return pago;
    }

    public Datos getDatos() {
        return datos;
    }

    public NombreCompleto getNombrecompleto() {
        return nombrecompleto;
    }
}
