
/*
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce por teclado las notas de los 3 ultimos examenes separadas por espacio");
    double nota1 = s.nextDouble();
    double nota2 = s.nextDouble();
    double nota3 = s.nextDouble();
    s.close();
    double promedio;
    if ((nota1 < 0) || (nota1 > 10) || (nota2 < 0) || (nota2 > 10) || (nota3 < 0) || (nota3 > 10)) {
      System.out.println("Introduce notas validas");
    } else {
      promedio = ((nota1 + nota2 + nota3) / 3);
      System.out.printf("La media de las notas ingresadas es %.2f. ", promedio);

      if (promedio < 5) {
        System.out.println("La nota es Insuficiente.");

      } else if ((promedio >= 5) && (promedio < 6)) {
        System.out.println("La nota es Suficiente");
      } else if ((promedio >= 6) && (promedio < 7)) {
        System.out.println("La nota es Suficiente");
      } else if ((promedio >= 7) && (promedio < 9)) {
        System.out.println("La nota es Notable");
      } else if (promedio >= 9) {
        System.out.println("La nota es Sobresaliente");
      }
    }
  }
}
