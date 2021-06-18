package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Duracion;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarDuracion implements Command {

    private final VueloId vueloid;
    private final Duracion duracion;

    public CambiarDuracion(VueloId vueloid, Duracion duracion) {
        this.vueloid = vueloid;
        this.duracion = duracion;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public VueloId getVueloid() {
        return vueloid;
    }
}
