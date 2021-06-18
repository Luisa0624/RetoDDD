package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.event.*;
import ventatiquetes.domain.vuelo.values.*;

import java.util.List;
import java.util.Objects;

public class Vuelo extends AggregateEvent <VueloId> {

    protected NombreVuelo nombrevuelo;
    protected Trayectoria trayecto;
    protected Duracion duracion;
    protected FechaHora fechahora;
    protected Aeropuerto aeropuerto;
    protected Piloto piloto;
    protected Avion avion;

    public Vuelo(VueloId entityId, NombreVuelo nombrevuelo, Trayectoria trayecto, Duracion duracion, FechaHora fechahora) {
        super(entityId);
        appendChange(new VueloCreado(nombrevuelo)).apply();
    }

    private  Vuelo(VueloId entityId){
        super(entityId);
        subscribe(new VueloChange(this));
    }

    //factoria que permite crear el agregado
    public static Vuelo from(VueloId vueloid, List<DomainEvent> events){
        var vuelo = new Vuelo(vueloid);
        events.forEach(vuelo::applyEvent);
        return vuelo;
    }

    //comportamientos
    public void cambiartrayectoria( VueloId vueloid, Trayectoria trayecto){
        Objects.requireNonNull(trayecto);
        appendChange(new TrayectoriaCambiada(vueloid, trayecto)).apply();
    }

    public void cambiarduracion(Duracion duracion){
        Objects.requireNonNull(duracion);
        appendChange(new DuracionCambiada(duracion)).apply();
    }

    public void cambiarfechayhora(FechaHora fechahora){
        Objects.requireNonNull(fechahora);
        appendChange(new FechayHoraCambiada(fechahora)).apply();
    }

    public void cambiarestadodeaeropuerto(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoCambiado(estado)).apply();
    }

    public void cambiarrutadelavion(Ruta ruta){
        Objects.requireNonNull(ruta);
        appendChange(new RutaCambiada(ruta)).apply();
    }

    public void cambiarturnodepiloto(Turno turno){
        Objects.requireNonNull(turno);
        appendChange(new TurnoCambiado(turno)).apply();
    }

    public void cambiarnombrepiloto(NombrePiloto nombrepiloto){
        Objects.requireNonNull(nombrepiloto);
        appendChange(new NombrePilotoCambiado(nombrepiloto)).apply();
    }

    //propiedades

    public NombreVuelo Nombrevuelo() {
        return nombrevuelo;
    }

    public FechaHora Fechahora() {
        return fechahora;
    }

    public Duracion Duracion() {
        return duracion;
    }

    public Trayectoria Trayecto() {
        return trayecto;
    }

    public Aeropuerto Aeropuerto() {
        return aeropuerto;
    }

    public Avion Avion() {
        return avion;
    }

    public Piloto Piloto() {
        return piloto;
    }



}
