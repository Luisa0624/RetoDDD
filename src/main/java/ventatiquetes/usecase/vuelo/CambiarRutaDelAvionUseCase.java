package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarFechayHora;
import ventatiquetes.domain.vuelo.command.CambiarRutaDelAvion;

public class CambiarRutaDelAvionUseCase extends UseCase<RequestCommand<CambiarRutaDelAvion>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarRutaDelAvion> cambiarRutaDelAvionRequestCommand) {
        var command = cambiarRutaDelAvionRequestCommand.getCommand();
        var ruta = Vuelo.from(command.getVueloId(),retrieveEvents(command.getVueloId().value()));
        ruta.cambiarRutaDelAvion(command.getRuta());
        emit().onResponse(new ResponseEvents(ruta.getUncommittedChanges()));
    }
}
