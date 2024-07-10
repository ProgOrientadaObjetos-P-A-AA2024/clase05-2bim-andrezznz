package paquete06l;

public class TarjetaCredito {
    
    private String nombre;
    private String numero;
    private Banco banco;

    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerNumero(String n) {
        numero = n;
    }

    public void establecerBanco(Banco b) {
        banco = b;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerNumero() {
        return numero;
    }
    
    public Banco obtenerBanco() {
        return banco;
    }
}
