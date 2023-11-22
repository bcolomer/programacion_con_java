
/*
 * Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio13R10 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int contadorPos = 0;
    int contadorNeg = 0;
    int num = 0;
    System.out.println("Introduzca 10 numeros enteros:");
    try {

      for (int i = 0; i < 10; i++) {
        num = s.nextInt();
        if (num >= 0) {
          contadorPos++;
        } else {
          contadorNeg++;
        }
      }
      System.out.printf("Has introducido %d numeros positivos y %d numeros negativos", contadorPos, contadorNeg);
    } catch (Exception InputMismatchException) {
      System.out.println("No has introducido valores validos");
      s.close();
    }
  }
}