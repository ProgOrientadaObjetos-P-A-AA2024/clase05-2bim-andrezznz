package paquete04o;

public class TransporteMaritimo extends Transporte{
    
    private String cooperativaMaritimo;

    public void establecerCooperativaMaritima(String n) {
        cooperativaMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 250 + (120 * 0.15);
    }

    public String obtenerCooperativaMaritima() {
        return cooperativaMaritimo;
    } 
}
