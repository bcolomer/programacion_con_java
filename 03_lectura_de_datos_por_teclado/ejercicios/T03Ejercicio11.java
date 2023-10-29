
/*
 * Realiza un conversor de Kb a Mb.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca los Mb para convertir a Kb:");
    double kb = s.nextDouble();
    s.close();
    double conversor = kb / 1024;
    System.out.printf("%.0f Kb equivalen a %.2f Kb", kb, conversor);
  }
}
