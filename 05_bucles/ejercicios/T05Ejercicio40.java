/*
 * Realiza un programa que pinte por pantalla un rombo hueco hecho con
asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
mensaje de error.
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio40 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int mitadA = 0;
    int mitadB = 0;
    int mitadAespacios = 0;
    int lineaDerecha = 0;

    /** colocar la comprobacion de que sea mayor a 3 e impar */
    System.out.println("introduzca altura  para rombo, debe ser impar mayor a 3");
    do {
      altura = s.nextInt();
      if ((altura < 3) || (altura % 2 == 0)) {
        System.out.println("Introduce un numero impar mayor a 3:");
      }
    } while ((altura < 3) || (altura % 2 == 0));

    s.close();

    mitadA = altura / 2;
    mitadB = altura - 2;
    mitadAespacios = mitadA;

    for (int i = 0; i < mitadA + 1; i++) { // la mitad superior del rombo las la linea del medio
      for (int j = 0; j < mitadAespacios; j++) {// esto controla los espacios de la izquierda
        System.out.print(" ");
      }
      mitadAespacios--;
      lineaDerecha = (i * 2) + 1;
      for (int j = 0; j < lineaDerecha; j++) {// esto controla las estrellas de la primera mitad
        if (((i != 0) && (j != 0)) && ((i != 0) && (j < lineaDerecha - 1))) {
          System.out.print(" ");
        } else {
          System.out.print("*");
        }

      }
      System.out.println();
    }
    for (int i = 0; i < mitadA; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(" ");// esto controla los espacios de la iaquierda de la mitad inf
      }
      // lineaDerecha = (i * 2) + 1;
      for (int j = 0; j < mitadB; j++) {
        if (((i != mitadA) && (j != 0)) && ((i != mitadA) && (j < mitadB - 1))) {// cambiar esto que no funciona
          System.out.print(" ");
        } else {
          System.out.print("*");
        }
      }
      mitadB = mitadB - 2;
      System.out.println();
    }
  }
}