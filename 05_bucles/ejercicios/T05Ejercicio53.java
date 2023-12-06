/*
 * Realiza un programa que pinte un triángulo relleno tal como se muestra
 * en los ejemplos. El usuario debe introducir la altura de la figura. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio53 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int anchura = 0;

    System.out.println("Introduzca la altura:");
    altura = s.nextInt();
    s.close();
    anchura = altura;
    for (int i = 0; i <= altura; i++) {

      for (int j = anchura; j > 0; j--) {
        System.out.print("*");

      }
      anchura = anchura - 1;
      System.out.println();
    }
  }
}
