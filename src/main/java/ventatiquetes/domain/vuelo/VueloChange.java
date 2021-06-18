package ventatiquetes.domain.vuelo;

import co.com.sofka.domain.generic.EventChange;
import ventatiquetes.domain.vuelo.event.*;

public class VueloChange extends EventChange {

    public VueloChange(Vuelo vuelo) {

        apply((TrayectoriaCambiada event) ->{
           vuelo.trayecto=event.getTrayectoria();
        });

        apply((DuracionCambiada event) ->{
            vuelo.duracion=event.getDuracion();
        });

        apply((FechayHoraCambiada event) ->{
            vuelo.fechahora=event.getFechahora();
        });

        apply((EstadoCambiado event) ->{
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
