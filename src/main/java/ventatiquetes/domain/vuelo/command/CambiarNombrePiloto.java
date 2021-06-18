package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.NombrePiloto;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarNombrePiloto implements Command {

    private final NombrePiloto nombrepiloto;
    private final VueloId vueloId;

    public CambiarNombrePiloto(NombrePiloto nombrepiloto, VueloId vueloId) {
        this.nombrepiloto = nombrepiloto;
        this.vueloId = vueloId;
    }

    public VueloId getvueloId() {
        return vueloId;
    }

    public NombrePiloto getNombrepiloto() {
        return nombrepiloto;
    }
}
