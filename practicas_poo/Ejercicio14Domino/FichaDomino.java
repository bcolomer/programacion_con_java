package Ejercicio14Domino;

public class FichaDomino {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////

    private int izq;
    private int der;

    // CONSTRUCTORES ////
    public FichaDomino() {

    }

    public FichaDomino(int izq, int der) {
        this.izq = izq;
        this.der = der;
    }

    // GETTERS ////
    public int getDer() {
        return der;
    }
    // SETTERS ////

    public void setIzq(int izq) {
        this.izq = izq;
    }

    public void setDer(int der) {
        this.der = der;
    }

    // METODOS ////
    public FichaDomino voltea() {
        int aux;
        aux = this.der;
        this.der = this.izq;
        this.izq = aux;
        return this;
    }

    public boolean encaja(FichaDomino otraFicha) {
        boolean encaja = true;
        if ((this.der != otraFicha.izq) &&
                (this.der != otraFicha.der) &&
                (this.izq != otraFicha.der) &&
                (this.izq != otraFicha.izq)) {
            encaja = false;
        }
        return encaja;
    }

    @Override
    public String toString() {
        return "[" + this.izq + "|" + this.der + "]";
    }
}
