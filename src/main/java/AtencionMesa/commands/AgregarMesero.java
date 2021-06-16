package AtencionMesa.commands;

import AtencionMesa.values.*;
import co.com.sofka.domain.generic.Command;

public class AgregarMesero implements Command {

    private atencionMesaId atencionmesaId;
    private meseroId entityId;
    private nombreMesero nombremesero;
    private correoMesero correomesero;
    private Propina propina;
    private Salario salario;

    public meseroId getEntityId() {
        return entityId;
    }

    public nombreMesero getNombremesero() {
        return nombremesero;
    }

    public correoMesero getCorreomesero() {
        return correomesero;
    }

    public Propina getPropina() {
        return propina;
    }

    public Salario getSalario() {
        return salario;
    }

    public atencionMesaId getAtencionmesaId() {
        return atencionmesaId;
    }

    public AgregarMesero (atencionMesaId atencionmesaId, meseroId entityId, nombreMesero nombremesero, correoMesero correomesero, Propina propina, Salario salario){
        this.atencionmesaId = atencionmesaId;
        this.entityId = entityId;
        this.nombremesero = nombremesero;
        this.correomesero = correomesero;
        this.propina = propina;
        this.salario = salario;
    }

}
