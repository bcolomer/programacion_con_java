package Ejercicio08R0910Terminal;

public class Movil extends Terminal {
    private String tarifa;
    private double tarificacion = 0;

    public Movil() {
        super();
    }

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void llama(Movil nuevoMovil, int tiempo) {
        this.tiempo += tiempo;
        switch (this.tarifa) {
            case "rata":
                this.tarificacion += (tiempo * 0.06) / 60;
                break;
            case "mono":
                this.tarificacion += (tiempo * 0.12) / 60;

                break;
            case "bisonte":
                this.tarificacion += (tiempo * 0.30) / 60;
                break;

        }
        nuevoMovil.tiempo += tiempo;

    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - tarificados %.2f euros", this.tarificacion);
    }

}