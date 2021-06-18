package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.CambiarEstadoDeTiquete;
import ventatiquetes.domain.pasajero.command.ModificarNombre;

public class CambiarEstadoDeTiqueteUseCase extends UseCase<RequestCommand<CambiarEstadoDeTiquete>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarEstadoDeTiquete> cambiarEstadoDeTiqueteRequestCommand) {
        var command = cambiarEstadoDeTiqueteRequestCommand.getCommand();
        var estado = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        estado.cambiarEstadoDeTiquete(command.getEstado());
        emit().onResponse(new ResponseEvents(estado.getUncommittedChanges()));
    }
}
