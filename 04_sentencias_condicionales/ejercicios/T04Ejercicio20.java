
/*
 * Realiza un programa que diga si un número entero positivo introducido por
teclado es capicúa. Se permiten números de hasta 5 cifras. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero entero positivo de hasta 5 cifras para saber si es o no capicua");
    int num = s.nextInt();
    s.close();
    if ((num <= 0) || (num >= 100000)) {
      System.out.println("El numero introducido esta fuera de los parametros indicados");
    } else {
      String numParse = num + "";
      if (num <= 9) {
        System.out
            .println("El numero solo tiene 1 cifra, para saber si un numero es capicua este debe ser mayor a 1 cifra");
      } else if (num <= 99) {
        if ((numParse.charAt(0)) == (numParse.charAt(1))) {
          System.out.println("El numero tiene dos cifras, pero puedes considerarlo capicua.");
        } else {
          System.out.println("el numero no es capicua");
        }
      } else if (num <= 999) {
        if ((numParse.charAt(0)) == (numParse.charAt(2))) {
          System.out.println("El numero es capicua.");
        } else {
          System.out.println("el numero no es capicua");
        }
      } else if (num <= 9999) {
        if (((numParse.charAt(0)) == (numParse.charAt(3))) && ((numParse.charAt(1)) == (numParse.charAt(2)))) {
          System.out.println("El numero es capicua.");
        } else {
          System.out.println("el numero no es capicua");
        }
      } else if (num <= 99999) {
        if (((numParse.charAt(0)) == (numParse.charAt(4))) && ((numParse.charAt(1)) == (numParse.charAt(3)))) {
          System.out.println("El numero es capicua.");
        } else {
          System.out.println("el numero no es capicua");
        }
      }
    }
  }
}
