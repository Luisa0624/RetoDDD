package ventatiquetes.usecase.vuelo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import ventatiquetes.domain.vuelo.Aeropuerto;
import ventatiquetes.domain.vuelo.Avion;
import ventatiquetes.domain.vuelo.Piloto;
import ventatiquetes.domain.vuelo.Vuelo;
import ventatiquetes.domain.vuelo.command.CambiarDuracionDelVuelo;
import ventatiquetes.domain.vuelo.event.DuracionCambiada;
import ventatiquetes.domain.vuelo.event.TrayectoriaCambiada;
import ventatiquetes.domain.vuelo.event.VueloCreado;
import ventatiquetes.domain.vuelo.values.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CambiarDuracionDelVueloUseCaseTest {

    private CambiarDuracionDelVueloUseCase cambiarDuracionDelVueloUseCase;
    @Mock
    private DomainEventRepository repository;

    @BeforeEach
    public void setup(){
        cambiarDuracionDelVueloUseCase= new CambiarDuracionDelVueloUseCase();
        repository=mock(DomainEventRepository.class);
        cambiarDuracionDelVueloUseCase.addRepository(repository);
    }

    @Test
    void cambiarDuracionhappyPath(){
        //arrage
        var command = new CambiarDuracionDelVuelo(
                VueloId.of("xxx-xxx"),
                new Duracion("50 min")
        );

        when(repository.getEventsBy(any())).thenReturn(events());


        //Act
        var response= UseCaseHandler.getInstance().
                setIdentifyExecutor("xxx-xxx").syncExecutor(
                cambiarDuracionDelVueloUseCase, new RequestCommand<>(command)
        ).orElseThrow();

        var event=(DuracionCambiada)response.getDomainEvents().get(0);

        //Asserts:
        Assertions.assertEquals("50 min", event.getDuracion().value());

    }

    private List<DomainEvent> events() {
        return List.of(new VueloCreado(
                        new VueloId("xxx-xxx1"),
                        new NombreVuelo("Vuelo1"),
                        new Trayectoria("Larga"),
                        new Duracion("30min"),
                        new FechaHora("20/06/2021 13:00"),
                new Aeropuerto(new AeropuertoId("xxx-xxx1"),
                                new NombreAeropuerto("El Dorado"),
                                new Ciudad("Bogota"),
                                new Estado("Abierto")),
                new Avion(new AvionId("xxx-xxx1"),
                                new Tipo("Comercial"),
                                new Capacidad("100"),
                                new Ruta("Oceano Pacifico"),
                                new Aerolinea("Avianca")),
                new Piloto(new PilotoId("xxx-xxx1"),
                                new NombrePiloto("Juan Garcia"),
                                new Turno("Tarde"))

                ));
    }
}