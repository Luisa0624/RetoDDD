package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.ModificarDestinoDeTiquete;

public class ModificardestinodetiqueteUseCase extends UseCase<RequestCommand<ModificarDestinoDeTiquete>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarDestinoDeTiquete> modificarDestinoDeTiqueteRequestCommand) {
        var command = modificarDestinoDeTiqueteRequestCommand.getCommand();
        var destino = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        destino.modificardestinodetiquete(command.getDestino());
        emit().onResponse(new ResponseEvents(destino.getUncommittedChanges()));
    }
}
