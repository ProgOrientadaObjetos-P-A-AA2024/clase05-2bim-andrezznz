/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete03o;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia t1 = new TransporteTransvia();
        t1.establecerCooperativaTransvia("Ruutas Loja");
        t1.establecerTarifa();
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransporteBus(bus);
        tipos.establecerTransporteTaxi(taxi);
        tipos.establecerTransporteTransvia(t1);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}
