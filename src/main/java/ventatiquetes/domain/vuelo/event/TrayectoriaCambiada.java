package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Trayectoria;
import ventatiquetes.domain.vuelo.values.VueloId;

public class TrayectoriaCambiada extends DomainEvent {

    private final Trayectoria trayectoria;

    public TrayectoriaCambiada(VueloId vueloid, Trayectoria trayectoria) {
        super("aerolinea.ventatiquetes.domain.vuelo.trayectoriacambiada");
        this.trayectoria=trayectoria;
    }

    public Trayectoria getTrayectoria() {
        return trayectoria;
    }
}
