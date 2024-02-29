package Ejercicio13CuentaCorriente;

public class CuentaCorriente {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private long numero;
    private int saldo;

    // CONSTRUCTORES ////

    public CuentaCorriente() {
        this.numero = (long) (Math.random() * 100000000000L);
        this.saldo = 0;
    }

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.numero = (long) (Math.random() * 100000000000L);

    }

    // GETTERS ////
    // SETTERS ////
    // METODOS ////
    public void ingreso(int numero) {
        this.saldo += numero;
    }

    public void cargo(int numero) {
        this.saldo -= numero;
    }

    public void transferencia(CuentaCorriente otraCuenta, int numero) {
        this.saldo -= numero;
        otraCuenta.saldo += numero;
    }

    @Override
    public String toString() {
        return String.format("Numero de cta: %d Saldo: %.2f", this.numero, (float) (this.saldo));

    }

}
