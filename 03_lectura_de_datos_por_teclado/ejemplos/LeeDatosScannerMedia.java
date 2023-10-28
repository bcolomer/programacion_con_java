
/**
 * Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class LeeDatosScannerMedia {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce tres numeros separados por espacios");
    double num1 = s.nextDouble();
    double num2 = s.nextDouble();
    double num3 = s.nextDouble();

    double promedio = (num1 + num2 + num3) / 3;
    System.out.printf("el promedio de los 3 numeros introducidos es %.2f", promedio);
    s.close();
    // para introducir los numeros por teclado, si son decimales debe usarse "," en
    // lugar de "."
  }
}
