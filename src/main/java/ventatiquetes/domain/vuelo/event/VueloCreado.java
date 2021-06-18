package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.values.NombreVuelo;

public class VueloCreado extends DomainEvent {
    private final NombreVuelo nombrevuelo;

    public VueloCreado(NombreVuelo nombrevuelo) {
        super("aerolinea.ventatiquetes.domain.vuelo.vuelocreado");
        this.nombrevuelo=nombrevuelo;
    }

    public NombreVuelo getNombrevuelo() {
        return nombrevuelo;
    }
}
