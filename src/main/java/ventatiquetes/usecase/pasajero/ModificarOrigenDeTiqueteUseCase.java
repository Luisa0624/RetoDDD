package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.ModificarOrigenDeTiquete;

public class ModificarOrigenDeTiqueteUseCase extends UseCase<RequestCommand<ModificarOrigenDeTiquete>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarOrigenDeTiquete> modificarOrigenDeTiqueteRequestCommand) {
        var command = modificarOrigenDeTiqueteRequestCommand.getCommand();
        var origen = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        origen.modificarOrigenDeTiquete(command.getOrigen());
        emit().onResponse(new ResponseEvents(origen.getUncommittedChanges()));
    }
}
