
/*   
 * Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio09 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("---Calculadora de ecuaciones de 2do Grado---");
    System.out.println("------------  ax2 + bx + c = 0  ------------");
    System.out.println("Introduzca el valor de a");
    double a = s.nextDouble();

    if (a == 0) {
      System.out.println("El valor de a nunca puede ser 0, debe introducir otro valor");

    } else {
      System.out.println("Introduzca el valor de b");
      double b = s.nextDouble();
      System.out.println("Introduzca el valor de c");
      double c = s.nextDouble();
      s.close();

      double x1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
      double x2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
      System.out.printf("Los valores de x para los datos introducidos es %.2f  y %.2f", x1, x2);
    }

  }
}
