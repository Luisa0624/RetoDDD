package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.Destino;
import ventatiquetes.domain.pasajero.values.TiqueteId;

public class DestinoModificado extends DomainEvent {

    private final Destino destino;

    public DestinoModificado(Destino destino) {
        super("aerolinea.ventatiquetes.domain.pasajero.destinocambiado");
        this.destino=destino;
    }

    public Destino getDestino() {
        return destino;
    }
}
