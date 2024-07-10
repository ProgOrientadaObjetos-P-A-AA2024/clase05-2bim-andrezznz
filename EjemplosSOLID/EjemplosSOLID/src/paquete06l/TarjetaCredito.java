package paquete06l;

public class TarjetaCredito {
    
    private String nombre;
    private String numero;

    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerNumero(String n) {
        numero = n;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerNumero() {
        return numero;
    }
}
