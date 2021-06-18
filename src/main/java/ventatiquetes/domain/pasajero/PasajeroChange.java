package ventatiquetes.domain.pasajero;

import co.com.sofka.domain.generic.EventChange;
import ventatiquetes.domain.pasajero.event.*;

public class PasajeroChange extends EventChange {

    public PasajeroChange(Pasajero pasajero) {

        apply((PasajeroRegistrado event) ->{
            pasajero.nombrecompleto=event.getNombrecompleto();
        });
        apply((NombreModificado event) ->{
            pasajero.nombrecompleto=event.getNombre();
        });

        apply((TelefonoModificado event) ->{
           pasajero.datos.cambiartelefono(event.getTelefono());
        });

        apply((OrigenModificado event) ->{
            pasajero.tiquete.modificarorigen(event.getOrigen());
        });

        apply((DestinoModificado event) ->{
            pasajero.tiquete.modificardestino(event.getDestino());
        });

        apply((EstadoCambiado event) ->{
            pasajero.tiquete.cambiarestado(event.getEstado());
        });

        apply((TipoDePagoModificado event) ->{
            pasajero.pago.modificartipodepago(event.getMetododepago());
        });



    }
}
