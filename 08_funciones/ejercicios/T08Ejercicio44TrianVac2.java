/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio44TrianVac2 {
    public static void main(String[] args) {

        int altura = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("introduce la altura");
        altura = s.nextInt();
        s.close();

        System.out.println(lineaSuperior(altura));
        System.out.print(lineasMedio(altura));
        System.out.println(lineaInferior(altura));
    }

    /**
     * funcion para imprimir la linea superior
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
     * funcion para imprimir la ultima linea
     * 
     * @param altura
     * @return
     */
    public static String lineaInferior(int altura) {
        String lineaInferior = "";
        for (int i = 0; i < altura - 1; i++) {
            lineaInferior += " ";
        }
        lineaInferior += "*";
        return lineaInferior;
    }

    /**
     * funcion para imprimir las lineas intermedias
     * 
     * @param altura
     * @return
     */
    public static String lineasMedio(int altura) {
        String lineasMedio = "";

        for (int fila = altura - 1; fila > 1; fila--) {
            lineasMedio += espaciosAntes(altura, fila);
            lineasMedio += "*";
            lineasMedio += espaciosDentro(fila);
            lineasMedio += "*";
            lineasMedio += "\n";
        }

        return lineasMedio;

    }

    /**
     * funcion para imprimir los espacios de la izquierda
     * 
     * @param altura
     * @param fila
     * @return
     */
    public static String espaciosAntes(int altura, int fila) {
        String espaciosAntes = "";
        for (int espacios = 0; espacios < altura - fila; espacios++) {
            espaciosAntes += " ";
        }
        return espaciosAntes;
    }

    /**
     * funcion para imprimir los espacios de dentro
     * 
     * @param fila
     * @return
     */
    public static String espaciosDentro(int fila) {
        String espaciosDentro = "";
        for (int espacios = fila - 2; espacios > 0; espacios--) {
            espaciosDentro += " ";

        }
        return espaciosDentro;
    }
}