package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Estado;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarEstadoDeAeropuerto implements Command {

    private final VueloId vueloId;
    private final Estado estado;

    public CambiarEstadoDeAeropuerto(VueloId vueloId, Estado estado) {
        this.vueloId = vueloId;
        this.estado = estado;
    }

    public VueloId getvueloId() {
        return vueloId;
    }

    public Estado getEstado() {
        return estado;
    }
}
