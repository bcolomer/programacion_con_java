/*
 * Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio46MValleVac {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("introduce la altura");
        altura = s.nextInt();
        s.close();

        System.out.println(lineaSuperior(altura));
        System.out.print(imprimirValleHueco(altura));
        System.out.println(lineaInferior(altura));
    }

    /**
     * funcion para imprimir linea superior
     * 
     * @param altura
     * @return
     */
    public static String lineaSuperior(int altura) {
        String lineaSuperior = "";
        lineaSuperior += "*";
        for (int espacio = 1; espacio < (altura * 2) - 2; espacio++) {
            lineaSuperior += " ";
        }
        lineaSuperior += "*";
        return lineaSuperior;
    }

    /**
     * funcion para imprimir linea inferior
     * 
     * @param altura
     * @return
     */
    public static String lineaInferior(int altura) {
        String lineaInferior = "";

        for (int estrella = 0; estrella < (altura * 2) - 1; estrella++) {
            lineaInferior += "*";
        }
        return lineaInferior;
    }

    /**
     * funcion para imprimir las lineas intermedias
     * 
     * @param altura
     * @return
     */
    public static String imprimirValleHueco(int altura) {
        String valle = "";
        for (int fila = 1; fila < altura - 1; fila++) {
            valle += "*";
            valle += espacioInterno(fila);
            valle += "*";
            valle += espacioCentroA(fila, altura);
            valle += espacioCentroB(fila, altura);
            valle += "*";
            valle += espacioInterno(fila);
            valle += "*";
            valle += "\n";
        }
        return valle;
    }

    /**
     * funcion para imprimir los espacios dentro de los triangulos externos
     * 
     * @param fila
     * @return
     */
    public static String espacioInterno(int fila) {
        String valle = "";
        for (int espaciosInt = 0; espaciosInt < fila - 1; espaciosInt++) {
            valle += " ";
        }
        return valle;
    }

    /**
     * funcion para imprimir la mitad a del espacio central
     * 
     * @param fila
     * @param altura
     * @return
     */
    public static String espacioCentroA(int fila, int altura) {
        String valle = "";
        for (int espacioCentro = altura - fila - 1; espacioCentro > 0; espacioCentro--) {
            valle += " ";
        }
        return valle;
    }

    /**
     * funcion para imprimir la mitad b del espacio central
     * 
     * @param fila
     * @param altura
     * @return
     */
    public static String espacioCentroB(int fila, int altura) {
        String valle = "";
        for (int espacioCentro = altura - fila - 1; espacioCentro > 1; espacioCentro--) {
            valle += " ";
        }
        return valle;
    }

}
