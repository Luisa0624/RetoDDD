package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarTurnodePiloto;

public class CambiarTurnoDePilotoUseCase extends UseCase<RequestCommand<CambiarTurnodePiloto>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarTurnodePiloto> cambiarTurnodePilotoRequestCommand) {
        var command = cambiarTurnodePilotoRequestCommand.getCommand();
        var turno = Vuelo.from(command.getvueloId(),retrieveEvents(command.getvueloId().value()));
        turno.cambiarTurnoDePiloto(command.getTurno());
        emit().onResponse(new ResponseEvents(turno.getUncommittedChanges()));
    }
}
