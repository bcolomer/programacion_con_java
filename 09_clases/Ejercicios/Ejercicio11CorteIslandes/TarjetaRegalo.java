package Ejercicio11CorteIslandes;

public class TarjetaRegalo {

    // ATRIBUTOS STATIC DE CLASE ////

    // ATRIBUTOS DE INSTANCIA ////
    double saldo;
    int codigo;

    // CONSTRUCTORES ////

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.codigo = (int) (Math.random() * 99999);
    }

    // GETTERS ////

    public double getSaldo() {
        return saldo;
    }

    // SETTERS ////

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // METODOS ////
    public void gasta(double importe) {
        if (this.saldo < importe) {
            System.out.printf("No tiene suficiente saldo para gastar %.2f €\n", importe);
        } else {
            this.saldo = this.getSaldo() - importe;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjetaRegalo) {
        TarjetaRegalo nueva = new TarjetaRegalo(this.saldo + otraTarjetaRegalo.getSaldo());
        this.setSaldo(0);
        otraTarjetaRegalo.setSaldo(0);
        return nueva;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta nº %d – Saldo %.2f€", this.codigo, this.getSaldo());
    }
}
