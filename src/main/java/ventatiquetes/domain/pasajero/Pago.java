package ventatiquetes.domain.pasajero;

import co.com.sofka.domain.generic.Entity;
import ventatiquetes.domain.pasajero.values.MetododePago;
import ventatiquetes.domain.pasajero.values.PagoId;

import java.util.Objects;

public class Pago extends Entity<PagoId> {

    private MetododePago metododepago;

    public Pago(PagoId entityId, MetododePago metododepago) {
        super(entityId);
        this.metododepago=metododepago;
    }

    //comportamientos
    public void modificartipodepago(MetododePago metododepago){
        this.metododepago= Objects.requireNonNull(metododepago);
    }
    //propiedades
    public MetododePago Metododepago() {
        return metododepago;
    }
}
