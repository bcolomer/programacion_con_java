
/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado. *
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double conversor = 166.386;
    System.out.println("Introduzca la cantidad de pesetas que quiere convertir a euros:");
    int pesetas = s.nextInt();
    double euros = pesetas / conversor;

    System.out.printf("Por " + pesetas + " ptas, recibiras %.2f € ", euros);

    s.close();
  }
}
