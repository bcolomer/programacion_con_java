
/**
 * Escribe un programa que calcule el área de un rectángulo. *
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String dato;

    System.out.println("Introduce la base del rectangulo en centimetros utilizando el punto para separar decimales");
    dato = System.console().readLine();
    double base = Double.parseDouble(dato);

    // Cuando hace la lectura de datos por teclado como String, el decimal se usa
    // con . y no con ,

    System.out.println("Introduce la altura del rectangulo en centimetros utilizando el punto para separar decimales");
    dato = System.console().readLine();
    double altura = Double.parseDouble(dato);
    s.close();

    double areaRectangulo = base * altura;
    System.out.printf("La superficie del rectangulo con las medidas introducidas es de %.2f cm2.", areaRectangulo);
  }
}
