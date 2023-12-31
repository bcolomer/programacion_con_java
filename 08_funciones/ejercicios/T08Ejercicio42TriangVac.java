/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio42TriangVac {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("introduce la altura");
        altura = s.nextInt();
        s.close();

        System.out.println(lineaSuperior(altura));
        System.out.print(lineaMedio(altura));
        System.out.println("*");
    }

    /**
     * funcion para imprimir linea superior
     * 
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
     * funcion para imprimir espacios en las lineas centrales
     * 
     * @param fila
     * @return
     */
    public static String lineaMedioEspacios(int fila) {

        String lineaMedioEspacios = "";

        for (int i = 0; i < fila; i++) {
            lineaMedioEspacios += " ";
        }

        return lineaMedioEspacios;
    }

    /**
     * funcion para imprimir las lineas centrales
     * 
     * @param altura
     * @return
     */
    public static String lineaMedio(int altura) {
        String lineaMedio = "";
        for (int fila = altura - 3; fila >= 0; fila--) {
            System.out.print("*");
            System.out.print(lineaMedioEspacios(fila));
            System.out.println("*");
        }
        return lineaMedio;
    }
}
