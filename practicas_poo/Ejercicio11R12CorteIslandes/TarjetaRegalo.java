package Ejercicio11R12CorteIslandes;

public class TarjetaRegalo {

    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private double saldo;
    private int numero;

    // CONSTRUCTORES ////
    public TarjetaRegalo() {
    }

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.numero = (int) (Math.random() * 100000 + 1);
    }

    // GETTERS ////
    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    // SETTERS ////
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numero = (int) (Math.random() * 100000 + 1);
    }

    // METODOS ////

    public void gasta(double numero) {
        if (this.saldo < numero) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f €.\n", numero);
        } else {
            this.saldo -= numero;
        }

    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjetaRegalo) {
        TarjetaRegalo nueva = new TarjetaRegalo();
        nueva.numero = (int) (Math.random() * 100000 + 1);
        nueva.saldo = this.saldo + otraTarjetaRegalo.saldo;
        this.setSaldo(0);
        otraTarjetaRegalo.setSaldo(0);
        return nueva;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta nro %d - Saldo %.2f €", this.numero, this.saldo);
    }

}
