/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {
    public static void main(String[] args) {
        
        SubscripcionDisneyPlus subsD = new SubscripcionDisneyPlus();
        subsD.establecerApiKey("147147");
        
        GeneradorPeliculas gp1 = new GeneradorPeliculas();
        gp1.establecerLlave(subsD);
        gp1.establecerUrl("http://api.movie?api=");
        System.out.println(gp1.obtenerUrl());
        
        System.out.println("---------------------------");
        
        SubscripcionDGO subsGO = new SubscripcionDGO();
        subsGO.establecerApiKey("159159");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(subsGO);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp3.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api2);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        
    }
}
