
/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Escribe dos numeros separados por espacios para obtener la multiplicacion de los mismos:");
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    double times = num1 * num2;

    System.out.printf("El resultado de la multiplicacion de los numeros introducidos es %.2f", times);
    s.close();
  }
}
