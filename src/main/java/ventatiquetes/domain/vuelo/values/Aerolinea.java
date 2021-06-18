package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Aerolinea implements ValueObject<String> {

    private final String value;

    public Aerolinea(String value) {
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
        Aerolinea aerolinea = (Aerolinea) o;
        return Objects.equals(value, aerolinea.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
