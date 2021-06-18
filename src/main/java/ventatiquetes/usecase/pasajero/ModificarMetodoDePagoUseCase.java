package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.ModificarMetodoDePago;

public class ModificarMetodoDePagoUseCase extends UseCase<RequestCommand<ModificarMetodoDePago>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarMetodoDePago> modificarMetodoDePagoRequestCommand) {
        var command = modificarMetodoDePagoRequestCommand.getCommand();
        var pago = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        pago.modificarMetodoDePago(command.getMetododepago());
        emit().onResponse(new ResponseEvents(pago.getUncommittedChanges()));
    }
}
