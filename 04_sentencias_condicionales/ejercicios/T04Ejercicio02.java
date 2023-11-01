
/*
 * Realiza un programa que pida una hora por teclado y que muestre luego buenos
días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
horas, los minutos no se deben introducir por teclado.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca la hora, omita los minutos");
    int hora = s.nextInt();
    s.close();

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos dias!");

    } else if ((hora >= 13) && (hora <= 21)) {
      System.out.println("Buenas tardes");

    } else if (((hora >= 22) && (hora <= 24)) || (hora < 6)) {
      System.out.println("Buenas noches");
    }
  }
}
