package AtencionMesa.events;

import co.com.sofka.domain.generic.DomainEvent;

public class MeseroAsignado extends DomainEvent {

    private final MeseroAsignado mesero;

    public MeseroAsignado(MeseroAsignado mesero) {
        super("sofka.atencionmesa.meseroasignado");
        this.mesero = mesero;
    }

    public MeseroAsignado getMesero(){
        return mesero;
    }
}
