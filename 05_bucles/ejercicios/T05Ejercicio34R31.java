/*
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio34R31 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    long numeroA = 0;
    long numeroB = 0;
    long invertidoA = 0;
    long invertidoB = 0;
    long pares = 0;
    long impares = 0;
    long moduloA = 0;
    long moduloB = 0;

    System.out.println("Introduce un numero");
    numeroA = s.nextLong();
    invertidoA = invertir(numeroA);
    System.out.println("Introduce otro numero");
    numeroB = s.nextLong();
    invertidoB = invertir(numeroB);
    s.close();

    do {
      moduloA = invertidoA % 10;
      moduloB = invertidoB % 10;
      invertidoA = invertidoA / 10;
      invertidoB = invertidoB / 10;
      if (moduloA % 2 == 0) {
        pares = (pares * 10) + moduloA;
      } else
        impares = (impares * 10) + moduloA;
      if (moduloB % 2 == 0) {
        pares = (pares * 10) + moduloB;
      } else
        impares = (impares * 10) + moduloB;

    } while ((invertidoA > 0) || (invertidoB > 0));

    System.out.println("El numero formado por los digitos pares es: " + pares);
    System.out.println("El numero formado por los digitos impares es: " + impares);

  }

  /**
   * funcion para invertir un numero
   * 
   * @param numero
   * @return
   */
  public static long invertir(long numero) {

    long modulo = 0;
    long invertido = 0;

    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;

    } while (numero > 0);

    return invertido;
  }
}