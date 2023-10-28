
/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio02 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    double conversor = 166.386;
    System.out.println("Introduzca la cantidad de euros que desea convertir a pesetas: ");
    double eurosConvertir = s.nextDouble();
    double pesetas = eurosConvertir * conversor;

    System.out.printf("Por " + eurosConvertir + "€ obtendrás %.0f pesetas", pesetas);

    s.close();
  }
}
