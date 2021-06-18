package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.FechaHora;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarFechayHora implements Command {

    private final VueloId vueloId;
    private final FechaHora fechahora;

    public CambiarFechayHora(VueloId vueloId, FechaHora fechahora) {
        this.vueloId = vueloId;
        this.fechahora = fechahora;
    }

    public VueloId getvueloId() {
        return vueloId;
    }

    public FechaHora getFechahora() {
        return fechahora;
    }
}
