/*
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
programa debe pedir la altura. Se debe comprobar que la altura sea un número
impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio38R35 {
  public static void main(String[] args) {

    int altura = 0;
    int mitadA = 0;
    int estrellasA = 0;
    int mitadB = 0;
    int estrellasB = 0;

    Scanner s = new Scanner(System.in);

    System.out.println("Por favor introduzca la altura para el reloj de arena");

    do {
      altura = s.nextInt();
      if ((altura < 3) || (altura % 2 == 0)) {
        System.out.println("Debe introducir un numero impar mayor a tres");
      }
    } while ((altura < 3) || (altura % 2 == 0));
    s.close();

    mitadA = (altura / 2) + 1;
    estrellasA = altura;
    mitadB = (altura / 2);
    estrellasB = mitadB;

    for (int i = 0; i < mitadA; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("_");
      }
      for (int j = 0; j < estrellasA; j++) {
        System.out.print("*");

      }
      estrellasA = estrellasA - 2;
      System.out.println();
    }

    for (int i = 0; i < mitadB; i++) {
      for (int j = 0; j < mitadB - i - 1; j++) {
        System.out.print("_");
      }

      for (int j = 0; j < (mitadB * i) + 2; j++) {
        System.out.print("*");
      }

      estrellasB = estrellasB + 2;
      System.out.println();

    }

  }

}
