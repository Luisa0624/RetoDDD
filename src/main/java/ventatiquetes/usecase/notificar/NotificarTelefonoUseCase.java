package ventatiquetes.usecase.notificar;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import ventatiquetes.domain.pasajero.event.TipoDePagoModificado;

public class NotificarTelefonoUseCase extends UseCase<TriggeredEvent<TipoDePagoModificado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<TipoDePagoModificado> tipoDePagoModificadoTriggeredEvent) {
        var event = tipoDePagoModificadoTriggeredEvent.getDomainEvent();
        var pasajeroService = getService(PasajeroService.class).orElseThrow();
        var sender = getService(SenderEmailService.class).orElseThrow();


        var email = pasajeroService.getEmailByPasajero("admin");
        sender.sendEmail(email, "Nuevo pago cambiado");

    }


}
