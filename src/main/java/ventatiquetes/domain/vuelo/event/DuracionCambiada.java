package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Duracion;

public class DuracionCambiada extends DomainEvent {

    private final Duracion duracion;

    public DuracionCambiada(Duracion duracion) {
        super("aerolinea.ventatiquetes.domain.vuelo.duracioncambiada");
        this.duracion=duracion;
    }

    public Duracion getDuracion() {
        return duracion;
    }
}
