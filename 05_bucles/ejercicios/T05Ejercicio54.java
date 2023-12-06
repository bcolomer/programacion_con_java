/*
 * Realiza un programa que pinte un triángulo hueco tal como se muestra en
 * los ejemplos. El usuario debe introducir la altura de la figura. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio54 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int anchura = 0;

    System.out.println("Introduzca la altura para el dibujar el triangulo hueco");
    altura = s.nextInt();
    s.close();
    anchura = altura;

    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < anchura; j++) {

        if (((i != 0) && (i < altura - 2)) && ((j < anchura - 1) && (j != 0))) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      anchura = anchura - 1;
      System.out.println();
    }
  }
}
