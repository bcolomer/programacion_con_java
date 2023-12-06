/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio57 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int altura = 0;
    int anchuraEspacios = 0;
    int anchuraAsteriscos = 0;

    System.out.println("introduzca la altura para el triangulo");
    altura = s.nextInt();
    s.close();

    anchuraAsteriscos = altura;

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchuraEspacios; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < anchuraAsteriscos; j++) {
        if (((i != 0) && (i < altura - 2)) && ((j != 0) && (j < anchuraAsteriscos - 1))) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

      }
      anchuraEspacios++;
      anchuraAsteriscos--;
      System.out.println();
    }

  }
}
