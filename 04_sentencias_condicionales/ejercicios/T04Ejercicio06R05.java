
/*  
 * Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
 * una altura h. Aplica la fórmula t = √ 2h g siendo g = 9:81m/s2
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio06R05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese la altura  en metros para saber cuando tiempo tardara en caer un objeto");
    double h = s.nextDouble();
    s.close();
    if (h <= 0) {
      System.out.println("Por favor introduzca un valor positivo");
    } else {
      double tiempo = Math.sqrt((2 * h) / 9.81);

      System.out.printf("El tiempo que el objeto tardará en caer al suelo es de %.2f segundos.", tiempo);

    }
  }

}
