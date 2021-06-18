package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.FechaHora;

public class FechayHoraCambiada extends DomainEvent {
    
    private final FechaHora fechahora;

    public FechayHoraCambiada(FechaHora fechahora) {
        super("aerolinea.ventatiquetes.domain.vuelo.fechayhoracambiada");
        this.fechahora=fechahora;
    }

    public FechaHora getFechahora() {
        return fechahora;
    }
}
