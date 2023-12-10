/*
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio41R38 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    long numero = 0;
    int contadorPares = 0;
    int contadorImpares = 0;
    long modulo = 0;
    long numeroCopia = 0;

    System.out.println("introduzca un numero entero positivo");
    numero = s.nextLong();
    s.close();
    numeroCopia = numero;
    do {
      modulo = numero % 10;
      numero = numero / 10;
      if (modulo % 2 == 0) {
        contadorPares++;
      } else {
        contadorImpares++;
      }

    } while (numero > 0);
    System.out.printf("el numero %d contiene %d digitos pares y %d digitos impares", numeroCopia, contadorPares,
        contadorImpares);

  }

}
