/*
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio32R29 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    long numero = 0;
    long invertido = 0;
    long modulo = 0;
    long sumaPares = 0;
    long aux = 0;

    System.out.println("Introduzca un numero entero");
    numero = s.nextLong();
    s.close();

    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;
    } while (numero > 0);

    System.out.print("Los digitos pares del numero introducido son: ");
    do {
      modulo = invertido % 10;
      if (modulo % 2 == 0) {
        System.out.print(modulo + " ");
        sumaPares = sumaPares + modulo;
      }
      invertido = invertido / 10;
      aux = (aux * 10) + modulo;

    } while (invertido > 0);
    System.out.println();
    System.out.println("Suma de los digitos pares: " + sumaPares);
  }
}
