package Ejercicio10Ameba;

public class Ameba {
    // ATRIBUTOS STATIC DE CLASE ////

    // ATRIBUTOS DE INSTANCIA ////

    int peso;

    // CONSTRUCTORES ////

    public Ameba() {
        this.peso = 3;
    }

    // GETTERS ////
    public int getPeso() {
        return peso;
    }

    // SETTERS ////
    public void setPeso(int peso) {
        this.peso = peso;
    }

    // METODOS ////
    // ameba come ameba
    public void come(Ameba otraAmeba) {
        this.peso += (otraAmeba.getPeso() - 1);
        otraAmeba.setPeso(0);
    }

    // ameba come comida
    public void come(int comida) {
        this.peso += (comida - 1);
    }

    @Override
    public String toString() {
        return "Soy una ameba y peso " + this.peso + " microgramos.";
    }

}
