package AtencionMesa.values;

import co.com.sofka.domain.generic.Identity;

public class clienteId extends Identity {

    public clienteId(){

    }

    private clienteId(String id){
        super(id);
    }



    public static clienteId of(String id){
        return new clienteId(id);
    }

}
