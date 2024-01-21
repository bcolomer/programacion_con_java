/*
 * Escribe un programa que pida 10 números por teclado y que luego muestre los
números introducidos junto con las palabras “máximo” y “mínimo” al lado del
máximo y del mínimo respectivamente. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T07Ejercicio05 {
    public static void main(String[] args) {

        int[] numeros;
        numeros = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner s = new Scanner(System.in);
        System.out.println("introduzca 10 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        s.close();
        System.out.println("Los numeros intoducidos son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == min) {
                System.out.print(" minimo");
            }
            if (numeros[i] == max) {
                System.out.print(" maximo");
            }
            System.out.println();
        }
    }
}
/*
 * public static void main(String[] args) {
 * 
 * int numero[];
 * int auxMenor = 0;
 * int auxMayor = 0;
 * Scanner s = new Scanner(System.in);
 * 
 * numero = new int[10];
 * 
 * System.out.println("introduzca 10 numeros seguidos por enter");
 * 
 * for (int i = 0; i < numero.length; i++) {
 * 
 * numero[i] = s.nextInt();
 * 
 * if (numero[i] > auxMayor) {
 * auxMayor = numero[i];
 * 
 * }
 * if (numero[i] > auxMayor) {
 * auxMayor = numero[i];
 * }
 * }
 * s.close();
 * auxMenor = numero[0];
 * /*
 * hago otro bucle for ,
 * porque si declaro aux menor a cualquier numero antes de que el usuario de sus
 * numero, o no se cual sera el numero
 * maximo que puede poner el usuario para partir desde ahi y si lo declaro
 * dentro cambia el valor en cada vuelta para ser de nuevo el mismo
 * 
 * for (int i = 0; i < numero.length; i++) {
 * if (auxMenor > numero[i]) {
 * auxMenor = numero[i];
 * }
 * }
 * 
 * System.out.println("Los numeros ingresados son: ");
 * for (int i = 0; i < numero.length; i++) {
 * System.out.printf(numero[i] + " ");
 * if (numero[i] == auxMayor) {
 * System.out.print("Máximo");
 * }
 * if (numero[i] == auxMenor) {
 * System.out.print("Mínimo");
 * }
 * System.out.println();
 * }
 * 
 * }
 * 
 * }
 */