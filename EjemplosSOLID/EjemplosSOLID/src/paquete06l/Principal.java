/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        Banco b1 = new Banco();
        b1.establecerNombre("Banco del Austro");
        
        TarjetaCredito t1 = new TarjetaCredito();
        t1.establecerNombre("Visa");
        t1.establecerNumero("1145239823");
        t1.establecerBanco(b1);
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        
        System.out.printf("Nombre:%s - Banco: %s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().
                        obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());
        
    }
}
