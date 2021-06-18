package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Ruta;

public class RutaCambiada extends DomainEvent  {

    private final Ruta ruta;

    public RutaCambiada(Ruta ruta) {
        super("aerolinea.ventatiquetes.domain.vuelo.rutacambiada");
        this.ruta=ruta;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
