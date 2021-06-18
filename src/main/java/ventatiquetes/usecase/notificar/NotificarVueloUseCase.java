package ventatiquetes.usecase.notificar;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import ventatiquetes.domain.pasajero.event.TipoDePagoModificado;
import ventatiquetes.domain.vuelo.event.RutaCambiada;

public class NotificarVueloUseCase extends UseCase<TriggeredEvent<RutaCambiada>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<RutaCambiada> rutaCambiadaTriggeredEvent) {
        var event = rutaCambiadaTriggeredEvent.getDomainEvent();
        var pilotoService = getService(PilotoService.class).orElseThrow();
        var sender = getService(SenderEmailService.class).orElseThrow();


        var email = pilotoService.getEmailByPiloto("admin");
        sender.sendEmail(email, "Nuevo Ruta Asignada");

    }


}
