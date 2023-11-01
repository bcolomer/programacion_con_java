
/**
* Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejercicio01 {
  public static void main(String[] args) {

    System.out.println("Escriba su edad, para saber si es mayor, menor de edad o se puede jubilar");
    Scanner s = new Scanner(System.in);
    int edad = s.nextInt();

    s.close();
    if (edad < 18) {
      System.out.println("Eres menor de edad");

    } else if (edad >= 65) {
      System.out.println("Estas en edad de jubilarte");

    } else {
      System.out.println("Eres mayor de edad");
    }

  }

}
