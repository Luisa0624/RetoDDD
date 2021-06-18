package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.Datos;
import ventatiquetes.domain.pasajero.Pago;
import ventatiquetes.domain.pasajero.Tiquete;
import ventatiquetes.domain.pasajero.values.NombreCompleto;
import ventatiquetes.domain.pasajero.values.PasajeroId;

public class PasajeroRegistrado extends DomainEvent {

    private final PasajeroId pasajeroId;
    private final NombreCompleto nombrecompleto;
    private final Datos datos;
    private final Pago pago;
    private final Tiquete tiquete;

    public PasajeroRegistrado(PasajeroId pasajeroId, NombreCompleto nombrecompleto, Datos datos, Pago pago, Tiquete tiquete) {
        super("ventatiquetes.pasajero.pasajeroregistrado");
        this.pasajeroId=pasajeroId;
        this.nombrecompleto=nombrecompleto;
        this.datos=datos;
        this.pago=pago;
        this.tiquete=tiquete;
    }

    public PasajeroId getPasajeroId() {
        return pasajeroId;
    }

    public NombreCompleto getNombrecompleto() {
        return nombrecompleto;
    }

    public Datos getDatos() {
        return datos;
    }

    public Pago getPago() {
        return pago;
    }

    public Tiquete getTiquete() {
        return tiquete;
    }
}
