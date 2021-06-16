package AtencionMesa;

import AtencionMesa.events.AtencionMesaCreada;
import co.com.sofka.domain.generic.EventChange;

public class AtencionMesaChange extends EventChange {
    public AtencionMesaChange(AtencionMesa atencionMesa) {

        apply((AtencionMesaCreada event) ->{
            atencionMesa.mesero = event.getMesero();

        });

    }
}
