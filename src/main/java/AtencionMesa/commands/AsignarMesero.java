package AtencionMesa.commands;

import AtencionMesa.values.atencionMesaId;
import AtencionMesa.values.meseroId;
import co.com.sofka.domain.generic.Command;

public class AsignarMesero implements Command {

    private atencionMesaId atencionmesaId;
    private meseroId entityId;

    public meseroId getEntityId() {
        return entityId;
    }

    public atencionMesaId getAtencionmesaId() {
        return atencionmesaId;
    }

    public AsignarMesero(atencionMesaId atencionmesaId, meseroId entityId){
        this.atencionmesaId = atencionmesaId;
        this.entityId = entityId;
    }
}
