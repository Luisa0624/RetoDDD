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
import ventatiquetes.domain.pasajero.command.ModificarNombre;
import ventatiquetes.domain.pasajero.event.NombreModificado;
import ventatiquetes.domain.pasajero.event.PasajeroRegistrado;
import ventatiquetes.domain.pasajero.values.*;
import ventatiquetes.domain.pasajero.values.Estado;
import ventatiquetes.domain.vuelo.Aeropuerto;
import ventatiquetes.domain.vuelo.Avion;
import ventatiquetes.domain.vuelo.Piloto;
import ventatiquetes.domain.vuelo.command.CambiarDuracionDelVuelo;
import ventatiquetes.domain.vuelo.event.DuracionCambiada;
import ventatiquetes.domain.vuelo.event.VueloCreado;
import ventatiquetes.domain.vuelo.values.*;
import ventatiquetes.usecase.vuelo.CambiarDuracionDelVueloUseCase;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ModificarNombrePasajeroUseCaseTest {

    private ModificarNombrePasajeroUseCase modificarNombrePasajeroUseCase;
    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        modificarNombrePasajeroUseCase= new ModificarNombrePasajeroUseCase();
        repository=mock(DomainEventRepository.class);
        modificarNombrePasajeroUseCase.addRepository(repository);
    }

    @Test
    void modificarNombreHappyPath(){
        //arrage
        var command = new ModificarNombre(
                PasajeroId.of("xxx-xxx"),
                new NombreCompleto("Luisa Maria Gil Garcia")
        );

        when(repository.getEventsBy(any())).thenReturn(events());


        //Act
        var response= UseCaseHandler.getInstance().
                setIdentifyExecutor("xxx-xxx").syncExecutor(
                modificarNombrePasajeroUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var event=(NombreModificado)response.getDomainEvents().get(0);

        //Asserts:
        Assertions.assertEquals("Luisa Maria Gil Garcia", event.getNombre().value());

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