
/*
 * Realiza un conversor de Mb a Kb.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio10 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca los Mb para convertir a Kb:");
    int mb = s.nextInt();
    s.close();
    int conversor = mb * 1024;
    System.out.println(mb + "Mb equivalen a " + conversor + " Kb");
  }
}
