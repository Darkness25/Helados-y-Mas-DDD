package AtencionMesa;

import co.com.sofka.domain.generic.AggregateEvent;
import AtencionMesa.values.atencionMesaId;


public class AtencionMesa extends AggregateEvent<atencionMesaId> {
    public AtencionMesa(atencionMesaId entityId) {
        super(entityId);
    }
}
