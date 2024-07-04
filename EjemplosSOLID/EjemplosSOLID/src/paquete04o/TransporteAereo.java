package paquete04o;

public class TransporteAereo extends Transporte {

    private String cooperativaAereo;

    public void establecerCooperativaAereo(String n) {
        cooperativaAereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 120 + (12 * 0.5);
    }

    public String obtenerCooperativaAereo() {
        return cooperativaAereo;
    }

}
