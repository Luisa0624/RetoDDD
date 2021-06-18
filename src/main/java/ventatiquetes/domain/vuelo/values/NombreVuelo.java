package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreVuelo implements ValueObject {

    private final String value;

    public NombreVuelo(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El nombre de la aerolinea esta vacia");
        }
        if (this.value.length()>= 100){
            throw new IllegalArgumentException("El nombre debe tener menos de 100 caracteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NombreVuelo that = (NombreVuelo) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
