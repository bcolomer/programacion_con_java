package Ejercicio08R0910Terminal;

public class Terminal {
    private String numero;
    protected int tiempo = 0;

    public Terminal() {

    }

    public Terminal(String numero) {
        this.numero = numero;
    }

    public void llama(Terminal nuevoTerminal, int tiempo) {
        this.tiempo = tiempo;
        nuevoTerminal.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Nro " + this.numero + " - " + this.tiempo + "s de conversacion.";
    }
}
