package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Estado;

public class EstadoCambiado extends DomainEvent {

    private final Estado estado;

    public EstadoCambiado(Estado estado) {
        super("aerolinea.ventatiquetes.domain.vuelo.estadocambiado");
        this.estado=estado;
    }


    public Estado getEstado() {
        return estado;
    }
}
