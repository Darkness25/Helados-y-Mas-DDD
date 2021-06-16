package Facturacion;

import Facturacion.values.facturaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Facturacion extends AggregateEvent<facturaId> {
    public Facturacion(facturaId entityId) {
        super(entityId);
    }
}
