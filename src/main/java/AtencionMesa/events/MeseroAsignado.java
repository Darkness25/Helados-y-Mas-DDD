package AtencionMesa.events;

import AtencionMesa.values.meseroId;
import co.com.sofka.domain.generic.DomainEvent;

public class MeseroAsignado extends DomainEvent {

    private final meseroId mesero;

    public MeseroAsignado(meseroId mesero) {
        super("sofka.atencionmesa.meseroasignado");
        this.mesero = mesero;
    }

    public meseroId getMeseroId(){
        return mesero;
    }
}
