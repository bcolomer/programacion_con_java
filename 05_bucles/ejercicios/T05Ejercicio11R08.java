
/*
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio11R08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num = 0;
    double contador = 0;
    System.out.print("Introduzca un numero: ");

    try {
      num = s.nextDouble();
      System.out.printf("%-15s %-15s %-15s \n", "num", "num2", "num3");
      contador = num;
      do {

        System.out.printf("%-15.2f %-15.2f %-15.2f \n", num, Math.pow(num, 2), Math.pow(num, 3));
        num++;
      } while (num < (contador + 5));
    } catch (Exception InputMismatchException) {
      System.out.println("no se han introducido valores validos");
    }
    s.close();
  }

}
