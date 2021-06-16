package AtencionMesa;

import AtencionMesa.events.AtencionMesaCreada;
import AtencionMesa.events.ClienteAgregado;
import AtencionMesa.events.MeseroAgregado;
import AtencionMesa.events.MeseroAsignado;
import AtencionMesa.values.*;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;


public class AtencionMesa extends AggregateEvent<atencionMesaId> {


    protected clienteId cliente;
    protected meseroId mesero;
    protected Set<Cliente> clientes;
    protected Set<Mesero> meseros;


    public AtencionMesa(atencionMesaId entityId, meseroId mesero) {
        super(entityId);

        appendChange(new AtencionMesaCreada(entityId)).apply();
    }

    private AtencionMesa(atencionMesaId entityId){
        super(entityId);
        subscribe(new AtencionMesaChange(this));

    }


    public void agregarCLiente(clienteId entityId, nombreCliente nombrecliente, correoCliente correocliente ){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombrecliente);
        Objects.requireNonNull(correocliente);


        appendChange(new ClienteAgregado(entityId, nombrecliente, correocliente)).apply();
    }

    public void agregarMesero(meseroId entityId, nombreMesero nombremesero, correoMesero correomesero, Propina propina, Salario salario ){

        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombremesero);
        Objects.requireNonNull(correomesero);
        Objects.requireNonNull(propina);
        Objects.requireNonNull(salario);


        appendChange(new MeseroAgregado(entityId, nombremesero, correomesero,propina,salario)).apply();
    }

    public void asignarMesero(meseroId entityId){
        Objects.requireNonNull(entityId);
        appendChange(new MeseroAsignado(entityId)).apply();
    }


    public Optional<Cliente> getClientePorId( clienteId entityId){
        return clientes()
                .stream()
                .filter(cliente -> cliente.identity().equals(entityId))
                .findFirst();
    }

    public Optional<Mesero> getMeseroPorId( meseroId entityId){
        return meseros()
                .stream()
                .filter(mesero -> mesero.identity().equals(entityId))
                .findFirst();
    }

    public clienteId cliente(){
        return cliente;
    }

    public meseroId mesero(){
        return mesero;
    }
    public Set<Cliente> clientes(){
        return clientes;
    }

    public Set<Mesero> meseros(){
        return meseros;
    }

}
