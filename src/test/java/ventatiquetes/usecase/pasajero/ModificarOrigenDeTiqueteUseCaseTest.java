package ventatiquetes.usecase.pasajero;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ventatiquetes.domain.pasajero.Datos;
import ventatiquetes.domain.pasajero.Pago;
import ventatiquetes.domain.pasajero.Tiquete;
import ventatiquetes.domain.pasajero.command.CambiarEstadoDeTiquete;
import ventatiquetes.domain.pasajero.command.ModificarOrigenDeTiquete;
import ventatiquetes.domain.pasajero.event.EstadoCambiado;
import ventatiquetes.domain.pasajero.event.OrigenModificado;
import ventatiquetes.domain.pasajero.event.PasajeroRegistrado;
import ventatiquetes.domain.pasajero.values.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ModificarOrigenDeTiqueteUseCaseTest {
    private ModificarOrigenDeTiqueteUseCase modificarOrigenDeTiqueteUseCase;
    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarOrigenDeTiqueteUseCase= new ModificarOrigenDeTiqueteUseCase();
        repository=mock(DomainEventRepository.class);
        modificarOrigenDeTiqueteUseCase.addRepository(repository);
    }

    @Test
    void modificarOrigenHappyPath(){
        //arrage
        var command = new ModificarOrigenDeTiquete(
                PasajeroId.of("xxx-xxx"),
                new Origen("Medellin")
        );

        when(repository.getEventsBy(any())).thenReturn(events());


        //Act
        var response= UseCaseHandler.getInstance().
                setIdentifyExecutor("xxx-xxx").syncExecutor(
                modificarOrigenDeTiqueteUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var event=(OrigenModificado)response.getDomainEvents().get(0);

        //Asserts:
        Assertions.assertEquals("Medellin", event.getOrigen().value());

    }

    private List<DomainEvent> events() {
        return List.of(new PasajeroRegistrado(
                new PasajeroId("xxx-xxx1"),
                new NombreCompleto("Natalia Garcia Delgado"),
                new Datos(new DatosId("xxx-xxx1"),
                        new FechadeNacimiento("24/06/1992"),
                        new Telefono("3184225830")),
                new Pago(new PagoId("xxx-xxx1"),
                        new MetododePago("Efectivo")),
                new Tiquete(new TiqueteId("xxx-xxx1"),
                        new Origen("Bogota"),
                        new Asiento("A001"),
                        new Destino("Santa Marta"),
                        new Estado("Vigente"))

        ));
    }

}