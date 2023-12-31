/*
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio45MValleRell {
    public static void main(String[] args) {

        int altura = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura mayor a 3");
        altura = s.nextInt();
        s.close();

        System.out.print(valle(altura));
        System.out.println(lineaInferior(altura));
    }

    /**
     * funcion para imprimir la ultima linea
     * 
     * @param altura
     * @return
     */
    public static String lineaInferior(int altura) {
        String lineaInferior = "";

        for (int i = 0; i < (altura * 2) - 1; i++) {
            lineaInferior += "*";

        }

        return lineaInferior;
    }

    public static String estrellas(int fila) {
        String estrellas = "";

        for (int estrellafuera = 0; estrellafuera < fila; estrellafuera++) {
            estrellas += "*";

        }
        return estrellas;
    }

    public static String espacios(int fila, int altura) {
        String espacios = "";

        for (int espaciosDentro = 0; espaciosDentro < altura - fila - 1; espaciosDentro++) {
            espacios += " ";

        }
        return espacios;
    }

    public static String valle(int altura) {
        String valle = "";
        for (int fila = 1; fila < altura; fila++) {
            valle += estrellas(fila);
            valle += espacios(fila, altura);
            valle += " ";
            valle += espacios(fila, altura);
            valle += estrellas(fila);
            valle += "\n";
        }
        return valle;
    }
}