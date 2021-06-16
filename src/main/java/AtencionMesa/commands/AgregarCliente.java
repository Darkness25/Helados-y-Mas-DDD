package AtencionMesa.commands;

import AtencionMesa.values.atencionMesaId;
import AtencionMesa.values.clienteId;
import AtencionMesa.values.correoCliente;
import AtencionMesa.values.nombreCliente;
import co.com.sofka.domain.generic.Command;

public class AgregarCliente implements Command {

    private atencionMesaId atencionmesaId;
    private clienteId entityId;
    private nombreCliente nombrecliente;
    private correoCliente correocliente;

    public clienteId getEntityId() {
        return entityId;
    }

    public nombreCliente getNombrecliente() {
        return nombrecliente;
    }

    public correoCliente getCorreocliente() {
        return correocliente;
    }

    public atencionMesaId getAtencionmesaId() {
        return atencionmesaId;
    }

    public AgregarCliente(atencionMesaId atencionmesaId, clienteId entityId, nombreCliente nombrecliente, correoCliente correocliente ){
        this.atencionmesaId = atencionmesaId;
        this.entityId = entityId;
        this.nombrecliente = nombrecliente;
        this.correocliente = correocliente;
    }


}
