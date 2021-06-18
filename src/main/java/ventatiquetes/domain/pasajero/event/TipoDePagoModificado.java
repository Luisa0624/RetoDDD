package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.MetododePago;

public class TipoDePagoModificado extends DomainEvent {

    private final MetododePago metododepago;
    public TipoDePagoModificado(MetododePago metododepago) {
        super("aerolinea.ventatiquetes.domain.pasajero.tipodepagomodificado");
        this.metododepago=metododepago;
    }

    public MetododePago getMetododepago() {
        return metododepago;
    }
}
