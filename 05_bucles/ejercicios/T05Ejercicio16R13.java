
/*
 * Escribe un programa que diga si un número introducido por teclado es o no primo. 
 * Un número primo es aquel que sólo es divisible entre él mismo y la unidad. 
 * 
 * @autor Barbara Colomer
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio16R13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    boolean primo = false;
    int num = 0;

    System.out.println("Introduzca un número para saber si es o no primo");
    try {

      num = s.nextInt();
      for (int i = num - 1; i >= 2; i--) {
        if (num % i == 0) {
          primo = true;
        }

      }
      s.close();
      if (primo) {
        System.out.println("El numero no es primo");
      } else {
        System.out.println("El numero introducido es primo");
      }
    } catch (InputMismatchException e) {
      System.out.println("Error: InputMismatchException \nNo ha introducido valores validos");
    }
  }
}
