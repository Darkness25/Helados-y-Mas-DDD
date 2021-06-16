package AtencionMesa.events;

import AtencionMesa.values.clienteId;
import AtencionMesa.values.correoCliente;
import AtencionMesa.values.nombreCliente;
import co.com.sofka.domain.generic.DomainEvent;

public class ClienteAgregado extends DomainEvent {
    private clienteId entityId;
    private nombreCliente nombrecliente;
    private correoCliente correocliente;

    public clienteId entityId() {
        return entityId;
    }

    public nombreCliente nombrecliente() {
        return nombrecliente;
    }

    public correoCliente correocliente() {
        return correocliente;
    }

    public ClienteAgregado(clienteId entityId, nombreCliente nombrecliente, correoCliente correocliente) {
        super("sofka.atencionmesa.clienteagregado");
        this.entityId = entityId;
        this.nombrecliente = nombrecliente;
        this.correocliente = correocliente;
    }

}
