
/*   
 * Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser 
 * positivo o negativo. Se permiten números de hasta 5 dígitos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio19 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero para saber cuantas cifras tiene");
    int num = s.nextInt();
    s.close();
    if ((num >= 100000) || (num <= -100000)) {
      System.out.println("El numero esta fuera de los parametros indicados");
    } else if ((num >= 9999) || (num <= -9999)) {
      System.out.println("El numero introducido tiene 5 cifras");
    } else if ((num >= 999) || (num <= -999)) {
      System.out.println("El numero introducido tiene 4 cifras");
    } else if ((num >= 99) || (num <= -99)) {
      System.out.println("El numero introducido tiene 3 cifras");
    } else if ((num >= 9) || (num <= -9)) {
      System.out.println("El numero introducido tiene 2 cifras");
    } else { // si fuera un else if la condicion deberia ser
             // ((num <= 9) && (num >= -9))
      System.out.println("El numero introducido tiene 1 cifra.");
    }
  }
}
