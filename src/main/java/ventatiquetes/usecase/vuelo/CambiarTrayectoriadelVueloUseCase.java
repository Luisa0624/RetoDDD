package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarTrayectoriadelVuelo;

public class CambiarTrayectoriadelVueloUseCase extends UseCase<RequestCommand<CambiarTrayectoriadelVuelo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarTrayectoriadelVuelo> cambiarTrayectoriaRequestCommand) {
        var command = cambiarTrayectoriaRequestCommand.getCommand();
        var trayecto = Vuelo.from(command.getVueloId(),retrieveEvents(command.getVueloId().value()));
        trayecto.cambiarTrayectoriaDelVuelo(command.getTrayecto());
        emit().onResponse(new ResponseEvents(trayecto.getUncommittedChanges()));
    }
}
