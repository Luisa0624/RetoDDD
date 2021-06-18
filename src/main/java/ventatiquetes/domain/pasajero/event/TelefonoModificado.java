package ventatiquetes.domain.pasajero.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.values.DatosId;
import ventatiquetes.domain.pasajero.values.Telefono;

public class TelefonoModificado extends DomainEvent {

    private final Telefono telefono;

    public TelefonoModificado(DatosId datosid, Telefono telefono) {
        super("aerolinea.ventatiquetes.domain.pasajero.telefonomodificado");
        this.telefono=telefono;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
