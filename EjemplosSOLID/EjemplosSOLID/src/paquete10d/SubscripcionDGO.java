package paquete10d;

public class SubscripcionDGO implements APIMovie {
    
     private String subscripcion;
    
    @Override
    public void establecerApiKey(String ak){
        subscripcion = ak+147147;
    }
    
    @Override
    public String obtenerApiKey(){
        return subscripcion;
    }
}
