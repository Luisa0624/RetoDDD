package ventatiquetes.domain.pasajero.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class MetododePago implements ValueObject<String> {

    private final String value;

    public MetododePago(String value) {
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
        MetododePago that = (MetododePago) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
