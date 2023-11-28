
/*
 * Escribe un programa que calcule el factorial de un número entero leído por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio28R25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    int factorial = 1;
    System.out.println("Indique un numero para saber su factorial");
    numero = s.nextInt();

    s.close();
    for (int i = 1; i <= numero; i++) {
      factorial = factorial * i;
    }
    System.out.printf("El factorial del numero %d (!%d), es %d.", numero, numero, factorial);
  }

}
