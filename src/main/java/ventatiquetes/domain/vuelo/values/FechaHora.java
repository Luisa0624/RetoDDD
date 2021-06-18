package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class FechaHora implements ValueObject<String> {
    private final String value;

    public FechaHora(String value) {
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
        FechaHora fechaHora = (FechaHora) o;
        return Objects.equals(value, fechaHora.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
