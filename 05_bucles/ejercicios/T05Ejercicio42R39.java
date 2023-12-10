/*
 * Escribe un programa que pida un número entero positivo por teclado y que
muestre a continuación los 5 números consecutivos a partir del número
introducido. Al lado de cada número se debe indicar si se trata de un primo
o no. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio42R39 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int numero = 0;
    int numeroFinal = 0;

    System.out.println("Introduzca un numero");
    numero = s.nextInt();
    s.close();
    numeroFinal = numero + 5;
    do {
      System.out.println(numero + (EsPrimo(numero)));
      numero++;
    } while (numero < numeroFinal);

    // primo = EsPrimo(numero);
    // System.out.println(primo);

  }

  public static String EsPrimo(int numero) {
    int i = 2;
    String primo = "";

    while ((i <= (numero / 2)) && (numero % i != 0)) {
      i++;
    }
    if ((i > (numero / 2))) {
      primo = " es primo";
    } else {
      primo = " no es primo";
    }
    return primo;
  }
}
