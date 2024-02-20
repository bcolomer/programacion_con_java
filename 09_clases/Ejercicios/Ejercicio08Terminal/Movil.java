package Ejercicio08Terminal;

public class Movil extends Terminal {
    String tarifa;
    double tarificacion;

    Movil() {
        super();
    }

    public Movil(String numero) {
        super(numero);
    }

    public Movil(String numero, int tiempoConversacion) {
        super(numero, tiempoConversacion);

    }

    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.tarificacion = 0;
    }

    public void cobra(Terminal otroTerminal, int tiempoConversacion) {
        this.setTiempoConversacion(tiempoConversacion);
        otroTerminal.setTiempoConversacion(tiempoConversacion);
    }

    @Override
    public void llama(Terminal otroTerminal, int tiempoConversacion) {
        super.llama(otroTerminal, tiempoConversacion);
        switch (this.tarifa) {
            case "rata":
                this.tarificacion += (double) (tiempoConversacion / 60) * 0.06;
                break;
            case "mono":
                this.tarificacion += ((double) (tiempoConversacion / 60)) * 0.12;

                break;
            case "bisonte":
                this.tarificacion += ((double) (tiempoConversacion / 60)) * 0.30;

                break;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " -  tarificados " + this.tarificacion + " euros";
    }
}
