package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Ruta;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarRutaDelAvion implements Command {

    private VueloId vueloId;
    private Ruta ruta;

    public CambiarRutaDelAvion(VueloId vueloId, Ruta ruta) {
        this.vueloId = vueloId;
        this.ruta = ruta;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public VueloId getVueloId() {
        return vueloId;
    }
}
