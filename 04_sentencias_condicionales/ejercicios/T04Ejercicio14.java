
/*                 
 * Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero");
    double numero = s.nextDouble();
    s.close();
    if ((numero % 2) == 0) {
      System.out.println("El número introducido es par");
    }

  }

}
