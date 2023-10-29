
/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 * Ejemplo 1:
 * Introduce la nota del primer examen: 7
 * ¿Qué nota quieres sacar en el trimestre? 8.5
 * Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo
 * examen.
 * Ejemplo 2:
 * Introduce la nota del primer examen: 8
 * ¿Qué nota quieres sacar en el trimestre? 7
 * Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen.
 * 
 * @autor Barbara Colomer
 * 
 */
import java.util.Scanner;

public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce la nota de tu primer examen:");
    double nota1 = s.nextDouble();
    System.out.println("Introduce la nota que quieres tener en el trimestre:");
    double notaFinal = s.nextDouble();
    s.close();
    double nota1Adaptada = (nota1 * 4) / 10;
    double nota2Adaptada = notaFinal - nota1Adaptada;
    double nota2 = (nota2Adaptada * 10) / 6;
    System.out.printf("Para tener %.2f como nota final, en el 2do examen debes tener %.2f.", notaFinal, nota2);
  }

}
