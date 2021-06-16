package AtencionMesa;

import AtencionMesa.values.clienteId;
import AtencionMesa.values.correoCliente;
import AtencionMesa.values.nombreCliente;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cliente extends Entity<clienteId> {

    private nombreCliente nombrecliente;
    private  correoCliente correocliente;

    public Cliente(clienteId entityId, nombreCliente nombrecliente, correoCliente correocliente ) {
        super(entityId);
        this.nombrecliente = nombrecliente;
        this.correocliente = correocliente;
    }

    public void actualizarNombreCliente(nombreCliente nombrecliente){
        this.nombrecliente = Objects.requireNonNull(nombrecliente);
    }

    public void actualizarCorreoCliente(correoCliente correocliente){
        this.correocliente = Objects.requireNonNull(correocliente);
    }

    public nombreCliente nombrecliente(){
        return nombrecliente;
    }

    public correoCliente correocliente(){
        return correocliente;
    }

}
