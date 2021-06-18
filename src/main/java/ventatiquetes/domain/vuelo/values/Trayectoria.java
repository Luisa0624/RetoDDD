package ventatiquetes.domain.vuelo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Trayectoria implements ValueObject<String> {

    private final String value;

    public Trayectoria(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La trayectoria esta vacia");
        }
    }

    public String value() {
        return value;
    }


}
