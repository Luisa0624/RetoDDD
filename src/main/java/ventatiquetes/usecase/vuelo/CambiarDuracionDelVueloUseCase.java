package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarDuracionDelVuelo;

public class CambiarDuracionDelVueloUseCase extends UseCase<RequestCommand<CambiarDuracionDelVuelo>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CambiarDuracionDelVuelo> cambiarDuracionDelVueloRequestCommand) {
        var command = cambiarDuracionDelVueloRequestCommand.getCommand();
        var duracion = Vuelo.from(command.getVueloId(),retrieveEvents(command.getVueloId().value()));
        duracion.cambiarDuracionDelVuelo(command.getDuracion());
        emit().onResponse(new ResponseEvents(duracion.getUncommittedChanges()));
    }
}
