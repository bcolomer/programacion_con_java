/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio14R11 {
  public static void main(String[] args) {

    double base = 0;
    int exponente = 0;
    int contador = 0;
    double potencia = 1;
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca la base para calcular la potencia");
    base = s.nextDouble();
    System.out.println("Introduzca el exponente, asegurese que sea entero y positivo para esta calculadora");
    do {
      exponente = s.nextInt();
      if (exponente < 0) {
        System.out.println("El exponente debe ser un numero positivo, introduce exponente:");
      }
    } while (exponente < 0);
    s.close();
    do {
      contador++;
      potencia = potencia * base;

    } while (contador < exponente);
    System.out.printf("El resultado de %.2f^%d es %.2f", base, exponente, potencia);
  }
}
