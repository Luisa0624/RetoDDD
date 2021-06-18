package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarNombrePiloto;

public class CambiarNombrePilotoUseCase extends UseCase<RequestCommand<CambiarNombrePiloto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarNombrePiloto> cambiarNombrePilotoRequestCommand) {
        var command = cambiarNombrePilotoRequestCommand.getCommand();
        var nombrePiloto = Vuelo.from(command.getvueloId(),retrieveEvents(command.getvueloId().value()));
        nombrePiloto.cambiarNombrePiloto(command.getNombrepiloto());
        emit().onResponse(new ResponseEvents(nombrePiloto.getUncommittedChanges()));
    }
}
