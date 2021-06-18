package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.Entity;
import ventatiquetes.domain.vuelo.values.AeropuertoId;
import ventatiquetes.domain.vuelo.values.Estado;
import ventatiquetes.domain.vuelo.values.NombreAeropuerto;
import ventatiquetes.domain.vuelo.values.Ciudad;

import java.util.Objects;

public class Aeropuerto extends Entity<AeropuertoId> {

    private final NombreAeropuerto aeropuerto;
    private final Ciudad ciudad;
    private Estado estado;

    public Aeropuerto(AeropuertoId entityId, NombreAeropuerto aeropuerto, Ciudad ciudad, Estado estado) {
        super(entityId);
        this.aeropuerto=aeropuerto;
        this.ciudad=ciudad;
        this.estado=estado;
    }

    //comportamientos
    public void cambiarestado(Estado estado){
        this.estado= estado;
    }
    //propiedades

    public Estado Estado() {
        return estado;
    }

    public NombreAeropuerto Aeropuerto() {
        return aeropuerto;
    }

    public Ciudad Ciudad() {
        return ciudad;
    }
}
