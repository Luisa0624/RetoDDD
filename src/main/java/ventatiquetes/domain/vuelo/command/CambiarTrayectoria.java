package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Trayectoria;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarTrayectoria implements Command {

    private final VueloId vueloid;
    private final Trayectoria trayecto;

    public CambiarTrayectoria(VueloId vueloid, Trayectoria trayecto) {
        this.vueloid = vueloid;
        this.trayecto = trayecto;
    }

    public VueloId getVueloid() {
        return vueloid;
    }

    public Trayectoria getTrayecto() {
        return trayecto;
    }
}
