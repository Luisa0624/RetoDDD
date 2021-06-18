package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.NombrePiloto;

public class NombrePilotoCambiado extends DomainEvent {

    private final NombrePiloto piloto;

    public NombrePilotoCambiado(NombrePiloto piloto) {
        super("aerolinea.ventatiquetes.domain.vuelo.cambiarnombrepiloto");
        this.piloto=piloto;
    }

    public NombrePiloto getPiloto() {
        return piloto;
    }
}
