package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.vuelo.event.*;
import ventatiquetes.domain.vuelo.values.*;

import java.util.List;
import java.util.Objects;

public class Vuelo extends AggregateEvent <VueloId> {

    protected VueloId vueloId;
    protected NombreVuelo nombrevuelo;
    protected Trayectoria trayecto;
    protected Duracion duracion;
    protected FechaHora fechahora;
    protected Aeropuerto aeropuerto;
    protected Piloto piloto;
    protected Avion avion;

    public Vuelo(VueloId vueloId, NombreVuelo nombrevuelo, Trayectoria trayecto, Duracion duracion, FechaHora fechahora, Aeropuerto aeropuerto, Avion avion, Piloto piloto) {
        super(vueloId);
        appendChange(new VueloCreado(vueloId, nombrevuelo,trayecto,duracion,fechahora,aeropuerto,avion,piloto)).apply();
    }

    private  Vuelo(VueloId vueloId){
        super(vueloId);
        subscribe(new VueloChange(this));
    }

    //factoria que permite crear el agregado
    public static Vuelo from(VueloId entityId, List<DomainEvent> events){
        var vuelo = new Vuelo(entityId);
        events.forEach(vuelo::applyEvent);
        return vuelo;
    }

    //comportamientos

    public void cambiarTrayectoriaDelVuelo(Trayectoria trayecto){
        Objects.requireNonNull(trayecto);
        appendChange(new TrayectoriaCambiada(trayecto)).apply();
    }

    public void cambiarDuracionDelVuelo(Duracion duracion){
        Objects.requireNonNull(duracion);
        appendChange(new DuracionCambiada(duracion)).apply();
    }

    public void cambiarFechayHoraDelVuelo(FechaHora fechahora){
        Objects.requireNonNull(fechahora);
        appendChange(new FechayHoraCambiada(fechahora)).apply();
    }

    public void cambiarEstadoDeAeropuerto(Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoCambiadoDelAeropuerto(estado)).apply();
    }

    public void cambiarRutaDelAvion(Ruta ruta){
        Objects.requireNonNull(ruta);
        appendChange(new RutaCambiada(ruta)).apply();
    }

    public void cambiarTurnoDePiloto(Turno turno){
        Objects.requireNonNull(turno);
        appendChange(new TurnoCambiado(turno)).apply();
    }

    public void cambiarNombrePiloto(NombrePiloto nombrepiloto){
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
