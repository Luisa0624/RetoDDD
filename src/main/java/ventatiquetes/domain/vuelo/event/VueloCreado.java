package ventatiquetes.domain.vuelo.event;

import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.Aeropuerto;
import ventatiquetes.domain.vuelo.Avion;
import ventatiquetes.domain.vuelo.Piloto;
import ventatiquetes.domain.vuelo.values.*;

public class VueloCreado extends DomainEvent {

    private final VueloId vueloId;
    private final NombreVuelo nombrevuelo;
    private final Trayectoria trayecto;
    private final Duracion duracion;
    private final FechaHora fechahora;
    private final Aeropuerto aeropuerto;
    private final Avion avion;
    private final Piloto piloto;


    public VueloCreado(VueloId vueloId, NombreVuelo nombrevuelo, Trayectoria trayecto, Duracion duracion, FechaHora fechahora, Aeropuerto aeropuerto, Avion avion, Piloto piloto) {
        super("ventatiquetes.vuelo.vuelocreado");
        this.vueloId=vueloId;
        this.nombrevuelo=nombrevuelo;
        this.trayecto=trayecto;
        this.duracion=duracion;
        this.fechahora=fechahora;
        this.aeropuerto=aeropuerto;
        this.avion=avion;
        this.piloto=piloto;

    }

    public VueloId getVueloId() {
        return vueloId;
    }

    public NombreVuelo getNombrevuelo() {
        return nombrevuelo;
    }

    public Trayectoria getTrayecto() {
        return trayecto;
    }

    public FechaHora getFechahora() {
        return fechahora;
    }

    public Duracion getDuracion() {
        return duracion;
    }

    public Aeropuerto getAeropuerto() {
        return aeropuerto;
    }

    public Avion getAvion() {
        return avion;
    }

    public Piloto getPiloto() {
        return piloto;
    }
}
