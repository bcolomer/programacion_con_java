
/*   
 * Escribe un programa que ordene tres números enteros introducidos por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca 3 numeros separados por espacio para ordenarlos de menor a mayor");
    double a = s.nextDouble();
    double b = s.nextDouble();
    double c = s.nextDouble();
    s.close();
    if ((a < b) && (a < c)) {
      if (b < c) {
        System.out.println(a + ", " + b + ", " + c + "");
      } else {
        System.out.println(a + ", " + c + ", " + b + "");
      }
    } else if ((b < a) && (b < c)) {
      if (a < c) {
        System.out.println(b + ", " + a + ", " + c + "");
      } else {
        System.out.println(b + ", " + c + ", " + a + "");
      }
    } else if (a < b) {
      System.out.println(c + ", " + a + ", " + b + "");
    } else {
      System.out.println(c + ", " + b + ", " + a + "");
    }
  }
}
