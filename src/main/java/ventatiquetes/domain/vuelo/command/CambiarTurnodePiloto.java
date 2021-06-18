package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.values.Turno;
import ventatiquetes.domain.vuelo.values.VueloId;

public class CambiarTurnodePiloto implements Command {

    private final VueloId vueloId;
    private final Turno turno;

    public CambiarTurnodePiloto(VueloId vueloId, Turno turno) {
        this.vueloId = vueloId;
        this.turno = turno;
    }

    public VueloId getvueloId() {
        return vueloId;
    }

    public Turno getTurno() {
        return turno;
    }
}
