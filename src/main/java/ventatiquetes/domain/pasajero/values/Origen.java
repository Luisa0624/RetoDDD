package ventatiquetes.domain.pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Origen implements ValueObject<String> {

    private final String value;

    public Origen(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre de la aerolinea esta vacia");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Origen origen = (Origen) o;
        return Objects.equals(value, origen.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
