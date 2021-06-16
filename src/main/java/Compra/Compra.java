package Compra;

import Compra.values.compraId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Compra extends AggregateEvent<compraId> {
    public Compra(compraId entityId) {
        super(entityId);
    }
}
