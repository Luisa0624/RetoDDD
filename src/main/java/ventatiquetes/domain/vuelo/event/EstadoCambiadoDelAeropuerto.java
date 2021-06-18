package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Estado;

public class EstadoCambiadoDelAeropuerto extends DomainEvent {

    private final Estado estado;

    public EstadoCambiadoDelAeropuerto(Estado estado) {
        super("ventatiquetes.vuelo.estadocambiado");
        this.estado=estado;
    }


    public Estado getEstado() {
        return estado;
    }
}
