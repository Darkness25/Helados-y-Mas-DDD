package AtencionMesa.events;

import AtencionMesa.values.atencionMesaId;
import co.com.sofka.domain.generic.DomainEvent;

public class AtencionMesaCreada extends DomainEvent {

    private atencionMesaId atencionmesaid;

    public AtencionMesaCreada(atencionMesaId atencionmesaid) {
        super("sofka.atencionmesa.atencionmesaasignada");

        this.atencionmesaid = atencionmesaid;
    }

    public atencionMesaId getAtencionMesaId(){
        return atencionmesaid;
    }

}
