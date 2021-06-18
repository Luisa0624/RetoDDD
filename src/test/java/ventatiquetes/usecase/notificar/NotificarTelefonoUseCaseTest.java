package ventatiquetes.usecase.notificar;

import co.com.sofka.business.generic.ServiceBuilder;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.TriggeredEvent;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ventatiquetes.domain.pasajero.event.TipoDePagoModificado;
import ventatiquetes.domain.pasajero.values.MetododePago;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class NotificarTelefonoUseCaseTest {

    private NotificarTelefonoUseCase notificarTelefonoUseCase;

    private PasajeroService pasajeroService;
    private SenderEmailService senderEmailService;

    @BeforeEach
    public void setup(){
        notificarTelefonoUseCase = new NotificarTelefonoUseCase();
        pasajeroService = mock(PasajeroService.class);
        senderEmailService = mock(SenderEmailService.class);

        ServiceBuilder builder = new ServiceBuilder();
        builder.addService(pasajeroService);
        builder.addService(senderEmailService);

        notificarTelefonoUseCase.addServiceBuilder(builder);
    }

    @Test
    void notificarTipodePadoHappyPath(){
        var event = new TipoDePagoModificado(
                new MetododePago("PSE")
        );
        when(pasajeroService.getEmailByPasajero(any())).thenReturn("pasajero@gmail.com");
        doNothing().when(senderEmailService).sendEmail(any(),anyString());

        UseCaseHandler.getInstance()
                .syncExecutor(
                        notificarTelefonoUseCase,
                        new TriggeredEvent<>(event)
                );

        verify(pasajeroService).getEmailByPasajero(any());
        verify(senderEmailService).sendEmail(any(),anyString());
    }

}