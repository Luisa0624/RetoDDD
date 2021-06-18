package ventatiquetes.domain.pasajero;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import ventatiquetes.domain.pasajero.event.*;
import ventatiquetes.domain.pasajero.values.*;

import java.util.List;
import java.util.Objects;

public class Pasajero extends AggregateEvent <PasajeroId> {

    protected NombreCompleto nombrecompleto;
    protected Pago pago;
    protected Datos datos;
    protected Tiquete tiquete;

    public Pasajero(PasajeroId entityId, NombreCompleto nombrecompleto) {
        super(entityId);
        appendChange(new PasajeroRegistrado(nombrecompleto)).apply();
    }

    private  Pasajero(PasajeroId entityId){
        super(entityId);
        subscribe(new PasajeroChange(this));
    }

    //factoria que permite crear el agregado
    public static Pasajero from(PasajeroId pasajeroId, List<DomainEvent> events){
        var pasajero=new Pasajero(pasajeroId);
        events.forEach(pasajero::applyEvent);
        return pasajero;
    }

//comportamientos
    public void modificarnombre(NombreCompleto nombrecompleto){
        Objects.requireNonNull(nombrecompleto);
        appendChange(new NombreModificado(nombrecompleto)).apply();
    }

    public void modificartelefono(DatosId datosid, Telefono telefono){
        Objects.requireNonNull(telefono);
        appendChange(new TelefonoModificado(datosid, telefono)).apply();
    }
    public void modificarorigendetiquete(TiqueteId tiqueteid, Origen origen){
        Objects.requireNonNull(origen);
        appendChange(new OrigenModificado(tiqueteid, origen)).apply();
    }
    public void modificardestinodetiquete(TiqueteId tiqueteid, Destino destino){
        Objects.requireNonNull(destino);
        appendChange(new DestinoModificado(tiqueteid, destino)).apply();
    }

    public void cambiarestadodetiquete(TiqueteId tiqueteid, Estado estado){
        Objects.requireNonNull(estado);
        appendChange(new EstadoCambiado(tiqueteid, estado)).apply();
    }
    public void modificarmetododepago(MetododePago metododepago){
        Objects.requireNonNull(metododepago);
        appendChange(new TipoDePagoModificado(metododepago)).apply();
    }

    //propiedades
    public NombreCompleto Nombrecompleto() {
        return nombrecompleto;
    }

    public Pago Pago() {
        return pago;
    }

    public Datos Datos() {
        return datos;
    }

    public Tiquete Tiquete() {
        return tiquete;
    }

}
