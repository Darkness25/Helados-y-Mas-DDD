package AtencionMesa;

import AtencionMesa.events.AtencionMesaCreada;
import AtencionMesa.events.ClienteAgregado;
import AtencionMesa.events.MeseroAgregado;
import AtencionMesa.events.MeseroAsignado;
import AtencionMesa.values.clienteId;
import AtencionMesa.values.meseroId;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;
import java.util.Set;

public class AtencionMesaChange extends EventChange {
    public AtencionMesaChange(AtencionMesa atencionMesa) {

        apply((AtencionMesaCreada event) ->{
            atencionMesa.atencionmesaId = event.getAtencionMesaId();


        });

        apply((MeseroAsignado event) -> {
            atencionMesa.mesero = event.getMeseroId();
        });

        apply((ClienteAgregado event) ->{
            var numClientes = atencionMesa.clientes().size();
            if(numClientes >= 100){
                throw new IllegalArgumentException("No se pueden agregar mas clientes");
            }
            atencionMesa.clientes.add(new Cliente(
                    event.entityId(),
                    event.nombrecliente(),
                    event.correocliente()
            ));

        });

        apply((MeseroAgregado event) ->{
            var numMeseros = atencionMesa.meseros.size();
            if(numMeseros >= 100){
                throw new IllegalArgumentException("No se pueden agregar mas Meseros");
            }
            atencionMesa.meseros().add(new Mesero(
                    event.entityId(),
                    event.nombremesero(),
                    event.correomesero(),
                    event.propina(),
                    event.salario()

            ));

        });

    }
}
