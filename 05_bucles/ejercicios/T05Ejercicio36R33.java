/*
 * Escribe un programa que diga si un número introducido por teclado es o no
capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
programa debe aceptar números de cualquier longitud siempre que lo permita
el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
long en lugar de int ya que el primero admite números más largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio36R33 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    long numero = 0;
    long invertido = 0;
    long modulo = 0;
    long copiaNumero = 0;

    System.out.println("Introduzca un numero para saber si es o no capicua");
    numero = s.nextLong();
    s.close();
    copiaNumero = numero;
    do {
      modulo = numero % 10;
      numero = numero / 10;
      invertido = (invertido * 10) + modulo;

    } while (numero > 0);

    if (copiaNumero == invertido) {
      System.out.printf("El numero %d es capicua", copiaNumero);
    } else {
      System.out.printf("el numero %d no es capicua", copiaNumero);
    }
  }

}
