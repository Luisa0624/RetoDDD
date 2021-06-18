package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Estado;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarEstadoDeAeropuerto implements Command {

    private final VueloId vueloid;
    private final Estado estado;

    public CambiarEstadoDeAeropuerto(VueloId vueloid, Estado estado) {
        this.vueloid = vueloid;
        this.estado = estado;
    }

    public VueloId getVueloid() {
        return vueloid;
    }

    public Estado getEstado() {
        return estado;
    }
}
