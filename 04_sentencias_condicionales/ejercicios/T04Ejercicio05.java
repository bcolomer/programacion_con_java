
/* 
 * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =
0).
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("--- Calculadora de ecuacion de primer grado ---");
    System.out.println("--- --- --- --- ---  ax+b=0 --- --- --- --- ---");
    System.out.println("Introduzca el valor de a:");
    double a = s.nextDouble();
    if (a == 0) {
      System.out.println("La ecuacion nunca tendria una solucion real, no se puede dividir entre 0.");

    } else {

      System.out.println("Introduzca el valor de b:");
      double b = s.nextDouble();
      s.close();
      double x = (0 - b) / a;
      System.out.printf("El valor correspondiente a x es %.2f", x);
    }
  }

}
