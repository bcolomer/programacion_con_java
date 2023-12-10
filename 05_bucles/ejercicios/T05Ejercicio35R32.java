/*
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio35R32 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int altura = 0;
    int alturaA = 0;
    int auxiliar = 0;
    int alturaB = 0;

    System.out.println("Impresora de X, Introduzca la altura: ");
    do {
      altura = s.nextInt();
      if (((altura < 3) || (altura % 2 == 0))) {
        System.out.println("La altura debe ser un numero impar mayor o igual a 3. Introduzca la altura: ");

      }
    } while ((altura < 3) || (altura % 2 == 0));
    s.close();

    // 1era mitad es una piramide hueca invertida:
    alturaA = (altura / 2) + 1; // esto me resuelve la altura de la primera mitad
    auxiliar = altura;
    for (int i = 0; i < alturaA; i++) {// controlo las lineas
      for (int j = 0; j < i; j++) {// pinto espacios
        System.out.print(" ");
      }

      for (int j = 0; j < auxiliar; j++) {// pinto estrellas
        if ((j != 0) && (j != auxiliar - 1)) { //
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

      }
      auxiliar = auxiliar - 2;

      System.out.println();
    }
    alturaB = altura / 2;
    // 2da mitad de la piramide sin la base:
    for (int i = 0; i <= alturaB + 1; i++) { // esto controla las filas
      for (int j = 1; j < alturaB; j++) { // esto controla los espacios
        System.out.print(" ");
      }
      alturaB--;
      for (int j = 0; j < (i * 2) + 3; j++) {
        if ((j != 0) && (j != (i * 2) + 2)) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

      }
      System.out.println();
    }

  }
}
