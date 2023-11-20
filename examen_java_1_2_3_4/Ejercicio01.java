
/*
 * Escribe un programa en Java que solicite el año actual. Seguidamente, se le pedirá que 
 * introduzca por teclado otro año y muestre en pantalla si dicho año es o no bisiesto. 
 * Deberá tenerse en cuenta que el año ha de ser siempre un número entero positivo 
 * mayor que cero. Deberán gestionarse convenientemente las posibles excepciones y
 *  errores que puedan producirse debido a la entrada del usuario. AYUDA: Recuerda que 
 * un año es bisiesto si es divisible por 4, excepto el último de cada siglo 
 * (que es divisible por 100), o si es divisible por 400. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int currentYear = 0;
    int cuestionYear = 0;
    try {
      System.out.println("CALENDARIO ESCOLAR HOWARDS");
      System.out.println("===========================");
      System.out.print("Introduzca el año actual: ");
      currentYear = s.nextInt();
      System.out.println("");
      System.out.println("Introduzca un año: ");
      cuestionYear = s.nextInt();
      s.close();
      if ((currentYear <= 0) || (cuestionYear <= 0)) {
        System.out.println("El año introducido y el actual deben ser mayor al año 0");
      }
      if ((cuestionYear % 400) == 0) {
        if (cuestionYear > currentYear)
          System.out.printf("El año %d será bisiesto", cuestionYear);
        else if (cuestionYear == currentYear) {
          System.out.printf("El año %d es bisiesto", cuestionYear);
        } else {
          System.out.printf("El año %d fue bisiesto", cuestionYear);

        }
      } else if (((cuestionYear % 4) == 0) && ((cuestionYear % 100) != 0)) {
        if (cuestionYear > currentYear)
          System.out.printf("El año %d será bisiesto", cuestionYear);
        else if (cuestionYear == currentYear) {
          System.out.printf("El año %d es bisiesto", cuestionYear);
        } else {
          System.out.printf("El año %d fue bisiesto", cuestionYear);

        }
      } else {
        System.out.println("el año introducido no es bisiesto");
      }

    } catch (Exception e) {
      System.out.println("No ha introducido valores validos");
    }
  }
}
