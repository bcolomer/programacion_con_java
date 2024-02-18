package Ejercicios.FraccionEjercicio4;

public class Fraccion {
    // ATRIBUTOS /////
    int numerador;
    int denominador;

    // CONSTRUCTOR ////

    public Fraccion() {

    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    // GETTERS /////

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }
    // SETTERS ////

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    // METODOS /////
    public void invierte() {
        int auxiliar;
        auxiliar = this.denominador;
        this.denominador = this.numerador;
        this.numerador = auxiliar;
    }

    public void multiplica(int multiplicador) {

        this.denominador *= multiplicador;
        this.numerador *= multiplicador;
    }

    public void divide(int divisor) {
        this.denominador /= divisor;
        this.numerador /= divisor;
    }

    public void simplifica() {

        int mcd = mcd(this.numerador, this.denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }

    private int mcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
