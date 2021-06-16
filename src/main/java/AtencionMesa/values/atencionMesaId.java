package AtencionMesa.values;

import co.com.sofka.domain.generic.Identity;

public class atencionMesaId extends Identity {
    public atencionMesaId(){

    }

    private atencionMesaId(String id){
        super(id);
    }



    public static atencionMesaId of(String id){
        return new  atencionMesaId(id);
    }

}
