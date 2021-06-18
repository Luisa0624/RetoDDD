package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.pasajero.Pasajero;
import ventatiquetes.domain.pasajero.command.ModificarNombre;
import ventatiquetes.domain.pasajero.command.ModificarTelefono;

public class ModificarTelefonoPasajeroUseCase extends UseCase<RequestCommand<ModificarTelefono>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<ModificarTelefono> modificarTelefonoRequestCommand) {
        var command = modificarTelefonoRequestCommand.getCommand();
        var telefono = Pasajero.from(command.getpasajeroId(),retrieveEvents(command.getpasajeroId().value()));
        telefono.modificarTelefonoPasajero(command.getTelefono());
        emit().onResponse(new ResponseEvents(telefono.getUncommittedChanges()));
    }
}
