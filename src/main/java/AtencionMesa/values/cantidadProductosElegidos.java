package AtencionMesa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class cantidadProductosElegidos implements ValueObject<String> {
    private final String value;

    public cantidadProductosElegidos(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El campo no puede estar vacio");
        }
        if(this.value.length() < 1){
            throw new IllegalArgumentException("Debe tener por lo menos un producto");
        }

    }


    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cantidadProductosElegidos that = (cantidadProductosElegidos) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
