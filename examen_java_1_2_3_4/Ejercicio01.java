
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
    String tiempoVerbal = "";
    try {
      System.out.println("\033[1mCALENDARIO ESCOLAR HOWARDS\033[0m");
      System.out.println("===========================");
      System.out.print("Introduzca el año actual: ");
      currentYear = s.nextInt();
      System.out.println("");
      System.out.print("Introduzca un año: ");
      cuestionYear = s.nextInt();
      s.close();

      if ((currentYear <= 0) || (cuestionYear <= 0)) {
        System.out.println("El año introducido y el actual deben ser mayor al año 0");
      }

      /*
       * if (currentYear > 0) {
       * if (cuestionYear > 0) {
       */

      if (cuestionYear < currentYear) {
        tiempoVerbal = "fue ";
      } else if (currentYear == cuestionYear) {
        tiempoVerbal = "es";
      } else {
        tiempoVerbal = "sera";
      }
      boolean bisiesto = ((cuestionYear % 4 == 0) && (cuestionYear % 100 != 0)) || (cuestionYear % 400 == 0);
      System.out.printf("el año %d %s %s bisiesto\n", cuestionYear, (bisiesto) ? "" : "no", tiempoVerbal);

      /*
       * if (((cuestionYear % 4 == 0) && (cuestionYear % 100 != 0)) || (cuestionYear %
       * 400 == 0)) {
       * }
       * if (cuestionYear < currentYear) {
       * System.out.println("el año fue bisiesto");
       * } else if (cuestionYear == currentYear) {
       * System.out.println("el año es bisiesto");
       * 
       * } else
       * System.out.println("el año sera bisiesto");
       * } else
       * System.out.println("el año no es bisiesto");
       */

      /*
       * if ((cuestionYear % 400) == 0) {
       * if (cuestionYear > currentYear)
       * System.out.printf("El año %d será bisiesto", cuestionYear);
       * else if (cuestionYear == currentYear) {
       * System.out.printf("El año %d es bisiesto", cuestionYear);
       * } else {
       * System.out.printf("El año %d fue bisiesto", cuestionYear);
       * 
       * }
       * } else if (((cuestionYear % 4) == 0) && ((cuestionYear % 100) != 0)) {
       * if (cuestionYear > currentYear)
       * System.out.printf("El año %d será bisiesto", cuestionYear);
       * else if (cuestionYear == currentYear) {
       * System.out.printf("El año %d es bisiesto", cuestionYear);
       * } else {
       * System.out.printf("El año %d fue bisiesto", cuestionYear);
       * 
       * }
       * } else {
       * System.out.println("el año introducido no es bisiesto");
       * }
       */

    } catch (

    Exception e) {
      System.out.println("No ha introducido valores validos");
    }
  }
}
