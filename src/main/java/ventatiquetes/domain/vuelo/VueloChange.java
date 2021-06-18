package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.EventChange;
import ventatiquetes.domain.vuelo.event.*;

public class VueloChange extends EventChange {

    public VueloChange(Vuelo vuelo) {

        apply((VueloCreado event)->{
            vuelo.nombrevuelo=event.getNombrevuelo();
            vuelo.trayecto=event.getTrayecto();
            vuelo.duracion=event.getDuracion();
            vuelo.fechahora=event.getFechahora();
            vuelo.aeropuerto=event.getAeropuerto();
            vuelo.avion=event.getAvion();
            vuelo.piloto=event.getPiloto();
        });
        apply((TrayectoriaCambiada event) ->{
           vuelo.trayecto=event.getTrayecto();
        });

        apply((DuracionCambiada event) ->{
            vuelo.duracion=event.getDuracion();
        });

        apply((FechayHoraCambiada event) ->{
            vuelo.fechahora=event.getFechahora();
        });

        apply((EstadoCambiadoDelAeropuerto event) ->{
            vuelo.aeropuerto.cambiarestado(event.getEstado());
        });

        apply((RutaCambiada event) ->{
            vuelo.avion.cambiarruta(event.getRuta());
        });

        apply((TurnoCambiado event) ->{
            vuelo.piloto.cambiarturno(event.getTurno());
        });

        apply((NombrePilotoCambiado event) ->{
            vuelo.piloto.cambiarnormbrepiloto(event.getPiloto());
        });

    }
}
