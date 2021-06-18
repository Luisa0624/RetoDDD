package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarTrayectoria;
import ventatiquetes.domain.vuelo.values.Trayectoria;

public class CambiarTrayectoriaUseCase extends UseCase<RequestCommand<CambiarTrayectoria>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarTrayectoria> cambiarTrayectoriaRequestCommand) {
        var command = cambiarTrayectoriaRequestCommand.getCommand();
        var trayecto = Vuelo.from(command.getVueloid(), retrieveEvents(command.getTrayecto().value()));
        trayecto.cambiartrayectoria(command.getVueloid(), command.getTrayecto());
        emit().onResponse(new ResponseEvents((trayecto.getUncommittedChanges())));
    }
}
