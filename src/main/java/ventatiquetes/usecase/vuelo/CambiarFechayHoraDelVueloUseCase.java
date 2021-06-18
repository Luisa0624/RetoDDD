package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarFechayHora;
import ventatiquetes.domain.vuelo.command.CambiarTrayectoriadelVuelo;

public class CambiarFechayHoraDelVueloUseCase extends UseCase<RequestCommand<CambiarFechayHora>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarFechayHora> cambiarFechayHoraRequestCommand) {
        var command = cambiarFechayHoraRequestCommand.getCommand();
        var fechaHora = Vuelo.from(command.getvueloId(),retrieveEvents(command.getvueloId().value()));
        fechaHora.cambiarFechayHoraDelVuelo(command.getFechahora());
        emit().onResponse(new ResponseEvents(fechaHora.getUncommittedChanges()));
    }
}
