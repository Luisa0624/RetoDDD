package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.*;

public class CambiarTrayectoriadelVuelo implements Command {

    private final VueloId vueloId;
    private final Trayectoria trayecto;

    public CambiarTrayectoriadelVuelo(VueloId vueloId, Trayectoria trayecto) {
        this.vueloId = vueloId;
        this.trayecto = trayecto;
    }

    public VueloId getVueloId() {
        return vueloId;
    }

    public Trayectoria getTrayecto() {
        return trayecto;
    }

}
