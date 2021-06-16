package AtencionMesa.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Salario implements ValueObject<String> {
    private final String value;

    public Salario(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("El campo no puede estar vacio");
        }
        if(!value.matches("[0-9]*")){
            throw new IllegalArgumentException("EL campo solo puede contener numeros");
        }

    }


    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salario that = (Salario) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
