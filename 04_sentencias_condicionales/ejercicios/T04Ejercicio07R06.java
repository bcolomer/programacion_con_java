
/*
 * Realiza un programa que calcule la media de tres notas
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio07R06 {
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
    }
  }
}
