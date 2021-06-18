package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.NombrePiloto;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarNombrePiloto implements Command {

    private final NombrePiloto nombrepiloto;
    private final VueloId vueloid;

    public CambiarNombrePiloto(NombrePiloto nombrepiloto, VueloId vueloid) {
        this.nombrepiloto = nombrepiloto;
        this.vueloid = vueloid;
    }

    public VueloId getVueloid() {
        return vueloid;
    }

    public NombrePiloto getNombrepiloto() {
        return nombrepiloto;
    }
}
