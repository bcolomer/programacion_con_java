
/*
 * Muestra la tabla de multiplicar de un número introducido por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio08 {
  public static void main(String[] args) {
    int num = 0;
    Scanner s = new Scanner(System.in);
    System.out.println();
    try {
      System.out.println("Escribe un numero para obtener su tabla de multiplicar");
      num = s.nextInt();
      s.close();
      for (int i = 0; i <= 10; i++) {
        System.out.printf("%d x %d = %d\n", num, i, (num * i));
      }
    } catch (InputMismatchException e) {
      System.out.println("Debe introducir un numero");

    }
  }

}
