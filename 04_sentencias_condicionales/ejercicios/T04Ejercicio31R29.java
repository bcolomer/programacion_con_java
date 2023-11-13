
/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio31R29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca un numero mayor de 3 cifras y se le indicara las ultimas dos cifras");
    int num = s.nextInt();
    int ulimosDos = 0;
    s.close();
    if (num >= 100) {
      ulimosDos = num % 100;
      System.out.println("las ultimas dos cifras del numero son: " + ulimosDos);

    } else {
      System.out.println("el numero no tiene mas de 3 cifras");
    }
  }
}
