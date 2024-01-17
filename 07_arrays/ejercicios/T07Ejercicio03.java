/*
 * Escribe un programa que lea 10 números por teclado y que luego los muestre
en orden inverso, es decir, el primero que se introduce es el último en mostrarse
y viceversa. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T07Ejercicio03 {
    public static void main(String[] args) {

        int[] numeros;
        Scanner s = new Scanner(System.in);

        numeros = new int[10];

        System.out.println("Introduzca 10 numeros enteros, separados por enter");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        s.close();
        System.out.println("Los numeros introducidos al reves, son los siguientes: ");

        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");

        }
    }
}
