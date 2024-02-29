package Ejercicio17Piramide;

public class Rectangulo {
    // ATRIBUTOS STATIC DE CLASE ////
    static int rectangulosCreados = 0;

    // ATRIBUTOS DE INSTANCIA ////
    private int base;
    private int altura;

    // CONSTRUCTORES ////
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    // GETTERS ////
    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }
    // SETTERS ////
    // METODOS ////

    @Override
    public String toString() {
        String imprimirRectangulo = "";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                imprimirRectangulo += "*";
            }
            imprimirRectangulo += "\n";
        }

        return imprimirRectangulo;
    }

}
