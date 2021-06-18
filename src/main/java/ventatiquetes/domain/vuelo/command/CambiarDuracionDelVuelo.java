package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Duracion;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarDuracionDelVuelo implements Command {

    private final VueloId vueloId;
    private final Duracion duracion;

    public CambiarDuracionDelVuelo(VueloId vueloId, Duracion duracion) {
        this.vueloId = vueloId;
        this.duracion = duracion;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public VueloId getVueloId() {
        return vueloId;
    }
}
