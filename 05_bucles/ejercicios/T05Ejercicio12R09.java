
/*
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
 * El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se 
 * calcula sumando los dos anteriores, por lo que tendríamos que los términos son 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio12R09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int fibonacci = 0;
    int contador = 2;
    int a = 0;
    int b = 1;
    int c;
    System.out.print("Serie de Fibonacci, indique cuantos valores desea conocer: ");
    try {
      fibonacci = s.nextInt();
      if (fibonacci == 1) {
        System.out.println("0");
      } else if (fibonacci == 2) {
        System.out.println("0, 1");
      } else {
        System.out.print(a + ", " + b + ", ");
        while (contador < fibonacci) {
          c = a + b;
          System.out.print(c + ", ");
          a = b;
          b = c;
          contador++;
        }
      }
    } catch (Exception InputMismatchException) {
      System.out.println("Ha introducido valores incorrectos");
      s.close();
    }

  }

}
