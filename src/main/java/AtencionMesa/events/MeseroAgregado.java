package AtencionMesa.events;

import AtencionMesa.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class MeseroAgregado extends DomainEvent {
    public meseroId getEntityId() {
        return entityId;
    }

    private meseroId entityId;
    private nombreMesero nombremesero;
    private correoMesero correomesero;
    private Propina propina;
    private Salario salario;



    public nombreMesero nombremesero() {
        return nombremesero;
    }

    public correoMesero correomesero() {
        return correomesero;
    }

    public Propina propina() {
        return propina;
    }

    public Salario salario() {
        return salario;
    }



    public MeseroAgregado(meseroId entityId, nombreMesero nombremesero, correoMesero correomesero, Propina propina, Salario salario) {
        super("sofka.atencionmesa.meseroagregado");
        this.entityId = entityId;
        this.nombremesero = nombremesero;
        this.correomesero = correomesero;
        this.propina = propina;
        this.salario = salario;
    }
}
