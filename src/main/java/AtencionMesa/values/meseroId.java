package AtencionMesa.values;

import co.com.sofka.domain.generic.Identity;

public class meseroId extends Identity {

    public meseroId(){

    }

    private meseroId(String id){
        super(id);
    }



    public static meseroId of(String id){
        return new  meseroId(id);
    }
}
