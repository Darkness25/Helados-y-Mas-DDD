package AtencionMesa.commands;

import AtencionMesa.values.atencionMesaId;
import co.com.sofka.domain.generic.Command;

public class CrearAtencionMesa implements Command {

    private atencionMesaId entityId;

    public atencionMesaId getEntityId() {
        return entityId;
    }

    public CrearAtencionMesa(atencionMesaId entityId){

        this.entityId = entityId;
    }

}
