/*
 * Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T07Ejercicio09 {
    public static void main(String[] args) {

        int[] numeros;
        Scanner s = new Scanner(System.in);

        numeros = new int[8];

        System.out.println("introduzca 8 numeros enteros separados por la tecla intro");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        s.close();

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] % 2 == 0) {
                System.out.print(" par");
            } else {
                System.out.print(" impar");
            }
            System.out.println();
        }
    }
}
