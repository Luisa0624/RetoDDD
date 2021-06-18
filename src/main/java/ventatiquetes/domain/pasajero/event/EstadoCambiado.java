package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.Estado;
import ventatiquetes.domain.pasajero.values.TiqueteId;

public class EstadoCambiado extends DomainEvent {

    private final Estado estado;

    public EstadoCambiado(Estado estado) {
        super("aerolinea.ventatiquetes.domain.pasajero.estadocambiado");
        this.estado=estado;
    }

    public Estado getEstado() {
        return estado;
    }
}
