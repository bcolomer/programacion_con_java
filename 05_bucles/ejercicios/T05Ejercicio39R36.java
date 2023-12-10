/*
 * Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los números desde el 1 al número introducido junto
con su factorial. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio39R36 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int numero = 0;

    System.out.println("introduzca un numero:");
    numero = s.nextInt();
    s.close();

    for (int i = 1; i <= numero; i++) {
      System.out.println(i + "! = " + factorialCrador(i));

    }

  }

  public static int factorialCrador(int numero) {
    int factorial = 1;

    for (int i = 1; i <= numero; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }
}
