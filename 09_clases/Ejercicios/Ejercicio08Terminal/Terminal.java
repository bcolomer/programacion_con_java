package Ejercicio08Terminal;

public class Terminal {
    // ATRIBUTOS STATIC DE CLASE ////

    // ATRIBUTOS DE INSTANCIA ////
    String numero;
    int tiempoConversacion;

    // CONSTRUCTORES ////
    public Terminal() {

    }

    public Terminal(String numero) {
        this.numero = numero;
    }

    public Terminal(String numero, int tiempoConversacion) {
        this.numero = numero;
        this.tiempoConversacion = tiempoConversacion;
    }

    // GETTERS ////

    // SETTERS ////

    public void setTiempoConversacion(int tiempoConversacion) {
        this.tiempoConversacion += tiempoConversacion;
    }
    // METODOS ////

    public void llama(Terminal otroTerminal, int tiempoConversacion) {
        this.setTiempoConversacion(tiempoConversacion);
        otroTerminal.setTiempoConversacion(tiempoConversacion);
    }

    @Override
    public String toString() {
        return "Nº " + this.numero + " - " + this.tiempoConversacion + "s de conversación";
    }

}
