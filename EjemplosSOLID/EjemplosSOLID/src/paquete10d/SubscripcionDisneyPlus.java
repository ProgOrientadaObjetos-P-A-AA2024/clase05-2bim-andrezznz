package paquete10d;


public class SubscripcionDisneyPlus implements APIMovie {
    
    private String subscripcion;
    
    @Override
    public void establecerApiKey(String ak){
        subscripcion = ak+123123;
    }
    
    @Override
    public String obtenerApiKey(){
        return subscripcion;
    }
    
}
