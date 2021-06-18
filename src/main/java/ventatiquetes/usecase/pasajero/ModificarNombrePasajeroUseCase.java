package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.ModificarNombre;

public class ModificarNombrePasajeroUseCase extends UseCase<RequestCommand<ModificarNombre>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarNombre> modificarNombreRequestCommand) {
        var command = modificarNombreRequestCommand.getCommand();
        var nombre = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        nombre.modificarNombrePasajero(command.getNombrecompleto());
        emit().onResponse(new ResponseEvents(nombre.getUncommittedChanges()));
    }
}
