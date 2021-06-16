package AtencionMesa;

import AtencionMesa.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Mesero extends Entity<meseroId> {

    private nombreMesero nombremesero;
    private correoMesero correomesero;
    private Propina propina;
    private Salario salario;

    public Mesero(meseroId entityId, nombreMesero nombremesero, correoMesero correomesero, Propina propina, Salario salario ) {
        super(entityId);
        this.nombremesero = nombremesero;
        this.correomesero = correomesero;
        this.propina = propina;
        this.salario = salario;
    }

    public void actualizarNombreMesero(nombreMesero nombremesero){
        this.nombremesero = Objects.requireNonNull(nombremesero);
    }

    public void actualizarCorreoMesero(correoMesero correomesero){
        this.correomesero = Objects.requireNonNull(correomesero);
    }

    public void actualizarPropina(Propina propina){
        this.propina = Objects.requireNonNull(propina);
    }

    public void actualizarSalario(Salario salario){
        this.salario = Objects.requireNonNull(salario);
    }

    public nombreMesero nombremesero(){
        return nombremesero;
    }

    public correoMesero correomesero(){
        return correomesero;
    }

    public Propina propina(){
        return propina;
    }

    public Salario salario(){
        return salario;
    }


}
