package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.Entity;
import ventatiquetes.domain.vuelo.values.NombrePiloto;
import ventatiquetes.domain.vuelo.values.PilotoId;
import ventatiquetes.domain.vuelo.values.Turno;

import java.util.Objects;

public class Piloto extends Entity<PilotoId> {

    private  NombrePiloto piloto;
    private  Turno turno;

    public Piloto(PilotoId entityId, NombrePiloto piloto, Turno turno ) {
        super(entityId);
        this.piloto=piloto;
        this.turno=turno;
    }

    //comportamientos
    public void cambiarnormbrepiloto(NombrePiloto piloto){
        this.piloto= Objects.requireNonNull(piloto);
    }

    public void cambiarturno(Turno turno){
        this.turno= Objects.requireNonNull(turno);
    }

    //propiedades
    public Turno Turno() {
        return turno;
    }

    public NombrePiloto Piloto() {
        return piloto;
    }
}
