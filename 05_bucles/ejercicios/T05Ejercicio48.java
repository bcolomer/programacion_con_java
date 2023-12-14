/*
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen 
 * en un número entero introducido por teclado. El orden es el que se muestra en 
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números 
 * largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio48 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long numero = 0;

    long numeroPorChequear = 0;
    int numeroSi = 0;
    int numeroNo = 0;

    System.out.println("introduzca un numero y se le indicara los numeros que apareces y los que no");
    numero = s.nextLong();
    s.close();

    for (int i = 0; i < 9; i++) {

      do {

        numeroPorChequear = numero % 10;

        if (i == numeroPorChequear) {
          numeroSi = i;
        } else {
          numeroNo = i;
        }
        numero = numero / 10;
      } while (numero > 0);

      System.out.println("numeros que estan:" + numeroSi);
      System.out.println("numeros que no estan:" + numeroNo);
    }
  }
}
