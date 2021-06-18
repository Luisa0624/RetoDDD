package ventatiquetes.domain.pasajero;

import co.com.sofka.domain.generic.Entity;
import ventatiquetes.domain.pasajero.values.DatosId;
import ventatiquetes.domain.pasajero.values.FechadeNacimiento;
import ventatiquetes.domain.pasajero.values.Telefono;

import java.util.Objects;

public class Datos extends Entity<DatosId> {

    private final FechadeNacimiento fechanacimiento;
    private  Telefono telefono;

    public Datos(DatosId entityId, FechadeNacimiento fechanacimiento, Telefono telefono ) {
        super(entityId);
        this.fechanacimiento=fechanacimiento;
        this.telefono=telefono;
    }

    //comportamiento
    public void cambiartelefono(Telefono telefono){
        this.telefono= Objects.requireNonNull(telefono);
    }

    //propiedades
    public Telefono telefono() {
        return telefono;
    }

    public FechadeNacimiento fechanacimiento() {
        return fechanacimiento;
    }
}
