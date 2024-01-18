/*
 * Escribe un programa que lea 15 números por teclado y que los almacene en un
array. Rota los elementos de ese array, es decir, el elemento de la posición 0
debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
del array. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T07Ejercicio06 {
    public static void main(String[] args) {
        int[] numeros;
        int aux = 0;

        Scanner s = new Scanner(System.in);
        numeros = new int[5];

        System.out.println("introduzca 15 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        s.close();
        aux = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {

            numeros[i] = numeros[i + 1];
            // if (i >= numeros.length) {
            // numeros[numeros.length] = aux;
            // }
        }
        numeros[numeros.length - 1] = aux;
        System.out.println("los nuevos numeros del array son");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("En la posicion %d, el nuevo numero es %d\n", (i + 1), numeros[i]);
        }
    }
}
