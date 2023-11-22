
/*
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * Este ejercicio es equivalente a otro realizado anteriormente, con la salvedad de que 
 * el anterior estaba limitado a números de 5 dígitos como máximo. En esta ocasión, hay 
 * que realizar el ejercicio utilizando bucles; de esta manera, la única limitación en el
 * número de dígitos la establece el tipo de dato que se utilice (int o long). 
 * 
 * @autor Barbara Colomer
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio09R06 {
  public static void main(String[] args) {
    long num = 0;
    long a = -10;
    long b = -1;
    long c = 1;
    long d = 10;
    long digitos = 1;

    Scanner s = new Scanner(System.in);
    System.out.print("Escriba un numero para saber cuantos cifras tiene:");

    try {
      num = s.nextLong();
      s.close();
      while (!(((num > a) && (num <= b)) || ((num >= c) && (num < d)))) {
        digitos = digitos + 1;

        a = a * 10;
        b = b * 10;
        c = c * 10;
        d = d * 10;
      }
      System.out.printf("El numero introducido tiene %d digitos\n", digitos);
    } catch (InputMismatchException e) {
      System.out.println(
          "el valor introducido no es un numero entero. Error: InputMismatchException, si cree que es un error contacte con servicio tecnico");
      /* solucion profesor: */
      long numero = 0;
      long temporal = numero;
      System.out.println("introducte nuerm");
      numero = s.nextLong();
      int contador = 1;
      while (temporal >= 10) {
        temporal /= 10;
        contador++;
        /*
         * clase math sobre el numero es esta la clase abs, que lo que hace es
         * positivizar un negativo y dejar positivo el positivo.
         */
      }
      System.out.println("el numero tiene tnatos digitos " + contador);
    }
  }
}
