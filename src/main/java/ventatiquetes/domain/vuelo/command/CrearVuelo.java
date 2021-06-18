package ventatiquetes.domain.vuelo.command;

import co.com.sofka.domain.generic.Command;
import ventatiquetes.domain.vuelo.Aeropuerto;
import ventatiquetes.domain.vuelo.Avion;
import ventatiquetes.domain.vuelo.Piloto;
import ventatiquetes.domain.vuelo.values.*;

public class CrearVuelo implements Command {

    protected final VueloId vueloId;
    protected final NombreVuelo nombrevuelo;
    protected final Trayectoria trayecto;
    protected final Duracion duracion;
    protected final FechaHora fechahora;
    private final Aeropuerto aeropuerto;
    private final Avion avion;
    private final Piloto piloto;

    public CrearVuelo(VueloId vueloId, NombreVuelo nombrevuelo, Trayectoria trayecto, Duracion duracion, FechaHora fechahora, Aeropuerto aeropuerto, Avion avion, Piloto piloto) {
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

    public Duracion getDuracion() {
        return duracion;
    }

    public FechaHora getFechahora() {
        return fechahora;
    }

    public NombreVuelo getNombrevuelo() {
        return nombrevuelo;
    }

    public Trayectoria getTrayecto() {
        return trayecto;
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
