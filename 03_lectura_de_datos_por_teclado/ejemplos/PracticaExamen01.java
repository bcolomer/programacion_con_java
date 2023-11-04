
/**
 * 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class PracticaExamen01 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero con decimales para redondearlo");
    double num1 = s.nextDouble();
    num1 = Math.round(num1); // esto parsea el double en int y le quita los decimales que tenga a .0
    int num2 = (int) (num1);
    System.out.println(num1);
    System.out.printf(" el numero sin decimales es: %.0f \n", num1);
    System.out.printf("el numero %d no tendra decimales ", num2);

    /*
     * int pesetasAConvertir;
     * Scanner sc = new Scanner(System.in);
     * 
     * 
     * System.out.
     * print("Por favor, introduzca la cantidad de pesetas que quiere convertir: ");
     * pesetasAConvertir = sc.nextInt();
     * double euros = (pesetasAConvertir / 166.386); // No hacemos casting (division
     * entero y real --> real)
     * 
     * System.out.printf("%d pta --> %.2f €", pesetasAConvertir, euros); // El
     * resultado es formateado: dos decimales con
     * // coma
     * 
     * sc.close();
     */

  }

}
/* */