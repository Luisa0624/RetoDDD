package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Turno;

public class TurnoCambiado extends DomainEvent {

    private final Turno turno;

    public TurnoCambiado(Turno turno) {
        super("aerolinea.ventatiquetes.domain.vuelo.turnocambiado");
        this.turno=turno;
    }

    public Turno getTurno() {
        return turno;
    }
}
