package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.Trayectoria;
import ventatiquetes.domain.vuelo.values.VueloId;

public class TrayectoriaCambiada extends DomainEvent {

    private final Trayectoria trayecto;

    public TrayectoriaCambiada(Trayectoria trayecto) {
        super("ventatiquetes.vuelo.trayectoriacambiada");
        this.trayecto=trayecto;
    }

    public Trayectoria getTrayecto() {
        return trayecto;
    }
}
