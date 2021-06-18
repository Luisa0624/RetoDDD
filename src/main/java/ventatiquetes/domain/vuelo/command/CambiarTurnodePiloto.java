package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Turno;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarTurnodePiloto implements Command {

    private final VueloId vueloid;
    private final Turno turno;

    public CambiarTurnodePiloto(VueloId vueloid, Turno turno) {
        this.vueloid = vueloid;
        this.turno = turno;
    }

    public VueloId getVueloid() {
        return vueloid;
    }

    public Turno getTurno() {
        return turno;
    }
}
