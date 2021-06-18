package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarEstadoDeAeropuerto;

public class CambiarEstadoDeAeropuertoUseCase extends UseCase<RequestCommand<CambiarEstadoDeAeropuerto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarEstadoDeAeropuerto> cambiarEstadoDeAeropuertoRequestCommand) {
        var command = cambiarEstadoDeAeropuertoRequestCommand.getCommand();
        var estado = Vuelo.from(command.getvueloId(),retrieveEvents(command.getvueloId().value()));
        estado.cambiarEstadoDeAeropuerto(command.getEstado());
        emit().onResponse(new ResponseEvents(estado.getUncommittedChanges()));
    }
}
