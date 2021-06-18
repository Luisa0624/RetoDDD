package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.NombreCompleto;

public class NombreModificado extends DomainEvent {

    private final NombreCompleto nombre;
    public NombreModificado(NombreCompleto nombre) {
        super("aerolinea.ventatiquetes.domain.pasajero.nombrecambiado");
        this.nombre=nombre;
    }

    public NombreCompleto getNombre() {
        return nombre;
    }
}
