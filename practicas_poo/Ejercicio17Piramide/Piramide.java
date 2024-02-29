package Ejercicio17Piramide;

public class Piramide {
    // ATRIBUTOS STATIC DE CLASE ////
    static int piramidesCreadas = 0;

    // ATRIBUTOS DE INSTANCIA ////
    private int altura;
    // CONSTRUCTORES ////

    public Piramide(int altura) {
        this.altura = altura;
        piramidesCreadas++;
    }

    // GETTERS ////
    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    // SETTERS ////
    // METODOS ////
    @Override
    public String toString() {
        String impresionPiramide = "";
        for (int i = 0; i < altura; i++) {
            for (int j = altura - i; j > 0; j--) {
                impresionPiramide += " ";
            }
            for (int j = 0; j < ((i * 2) + 1); j++) {
                impresionPiramide += "*";
            }
            impresionPiramide += "\n";
        }
        return impresionPiramide;
    }
}