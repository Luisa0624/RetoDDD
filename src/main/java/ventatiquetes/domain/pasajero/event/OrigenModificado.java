package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.Origen;
import ventatiquetes.domain.pasajero.values.TiqueteId;

public class OrigenModificado extends DomainEvent {

    private final Origen origen;

    public OrigenModificado(TiqueteId tiqueteid, Origen origen) {
        super("aerolinea.ventatiquetes.domain.pasajero.origencambiado");
        this.origen=origen;
    }

    public Origen getOrigen() {
        return origen;
    }
}
