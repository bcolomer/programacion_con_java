/*
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio43TrianRell2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("introduce la altura");
        altura = s.nextInt();
        s.close();

        System.out.println(lineaSuperior(altura));
        System.out.println(lineaMedio(altura));

    }

    /**
     * funcion para imprimir linea superior segun altura
     * 
     * @param altura
     * @return
     */
    public static String lineaSuperior(int altura) {
        String lineaSuperior = "";

        for (int i = 0; i < altura; i++) {
            lineaSuperior += "*";
        }

        return lineaSuperior;
    }

    /**
     * funcion para imprimir espacios por linea
     * 
     * @param fila
     * @return
     */
    public static String espacios(int fila) {
        String espacios = "";
        for (int i = 0; i < fila; i++) {
            espacios += " ";
        }
        return espacios;
    }

    /**
     * funcion para imprimir estrellas por linea
     * 
     * @param altura
     * @param fila
     * @return
     */
    public static String estrellas(int altura, int fila) {
        String estrellas = "";
        for (int i = 0; i < altura - fila; i++) {
            estrellas += "*";
        }
        return estrellas;
    }

    /**
     * funcion para imprimir lineas de espacios y estrellas
     * 
     * @param altura
     * @return
     */
    public static String lineaMedio(int altura) {
        String lineaMedio = "";
        for (int fila = 1; fila < altura; fila++) {
            lineaMedio += espacios(fila) + estrellas(altura, fila) + "\n";
        }
        return lineaMedio;
    }
}
