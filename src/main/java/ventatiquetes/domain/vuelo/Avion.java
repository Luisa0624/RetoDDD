package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.Entity;
import ventatiquetes.domain.vuelo.values.*;

import java.util.Objects;

public class Avion extends Entity<AvionId> {

    private final Tipo tipo;
    private final Capacidad capacidad;
    private  Ruta ruta;
    private final Aerolinea aerolinea;

    public Avion(AvionId entityId, Tipo tipo, Capacidad capacidad, Ruta ruta, Aerolinea aerolinea) {
        super(entityId);
        this.tipo=tipo;
        this.capacidad=capacidad;
        this.ruta=ruta;
        this.aerolinea=aerolinea;
    }

    //comportamientos
    public void cambiarruta(Ruta ruta){
        this.ruta= Objects.requireNonNull(ruta);
    }


    //propiedades
    public Tipo Tipo() {
        return tipo;
    }

    public Capacidad Capacidad() {
        return capacidad;
    }

    public Ruta Ruta() {
        return ruta;
    }

    public Aerolinea Aerolinea() {
        return aerolinea;
    }
}
