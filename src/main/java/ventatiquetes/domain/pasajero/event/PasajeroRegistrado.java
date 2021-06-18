package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.NombreCompleto;

public class PasajeroRegistrado extends DomainEvent {

    private final NombreCompleto nombrecompleto;

    public PasajeroRegistrado( NombreCompleto nombrecompleto) {
        super("aerolinea.ventatiquetes.domain.pasajero.pasajeroregistrado");
        this.nombrecompleto=nombrecompleto;
    }

    public NombreCompleto getNombrecompleto() {
        return nombrecompleto;
    }
}
