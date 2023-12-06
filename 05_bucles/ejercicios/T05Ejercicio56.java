/*
 * Realiza un programa que pinte un triángulo relleno tal como se 
 * muestra en los ejemplos. El usuario debe introducir la altura de 
 * la figura. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio56 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int altura = 0;
    int anchura = 0;
    int anchuraAsteriscos = 0;

    System.out.println("introduzca la altura para su triangulo");
    altura = s.nextInt();
    s.close();
    anchuraAsteriscos = altura;

    for (int i = 0; i < altura; i++) { // esto controla solo las filas
      for (int j = 0; j < anchura + 1; j++) {
        System.out.print(" ");

      }
      for (int j = 0; j < anchuraAsteriscos; j++) {
        System.out.print("*");
      }
      System.out.println();
      anchura++;
      anchuraAsteriscos--;
    }

    System.out.println();
  }
}
