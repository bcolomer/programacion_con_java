/*
 * Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T08Ejercicio41TriangRell {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("introduzca la altura para el triangulo");
        altura = s.nextInt();
        s.close();

        fila(altura);
    }

    /**
     * funcion para imprimir 1 linea con n(altura) cantidad de *
     * 
     * @param altura
     * @return
     */
    public static String linea(int altura) {
        String linea = "";
        for (int i = 0; i < altura; i++) {
            linea += "*";
        }
        return linea;
    }

    /**
     * funcion para imprimir un triangulo basado en una altura dada
     * 
     */
    public static void fila(int altura) {

        int estrellas = altura;

        for (int i = 0; i < altura; i++) {
            System.out.println(linea(estrellas));
            estrellas = estrellas - 1;
        }
    }
}
