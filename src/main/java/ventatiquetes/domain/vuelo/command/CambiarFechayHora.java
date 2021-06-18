package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.FechaHora;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarFechayHora implements Command {

    private final VueloId vueloid;
    private final FechaHora fechahora;

    public CambiarFechayHora(VueloId vueloid, FechaHora fechahora) {
        this.vueloid = vueloid;
        this.fechahora = fechahora;
    }

    public VueloId getVueloid() {
        return vueloid;
    }

    public FechaHora getFechahora() {
        return fechahora;
    }
}
