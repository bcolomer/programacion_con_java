
/**
 * Escribe un programa que calcule el área de un triángulo. *
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String dato;

    System.out.println(
        "Introduce la base del triangulo en centimetros. Si introduce decimales, utilice el punto para separarlos.");
    dato = System.console().readLine();
    double base = Double.parseDouble(dato);

    // Cuando hace la lectura de datos por teclado como String, el decimal se usa
    // con . y no con ,

    System.out.println(
        "Introduce la altura del triangulo en centimetros.Si introduce decimales, utilice el punto para separarlos.");
    dato = System.console().readLine();
    double altura = Double.parseDouble(dato);
    s.close();

    double areaTriangulo = (base * altura) / 2;
    System.out.printf("La superficie del triangulo con las medidas introducidas es de %.2f cm2.", areaTriangulo);
  }
}
