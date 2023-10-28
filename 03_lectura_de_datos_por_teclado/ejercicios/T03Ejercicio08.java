
/*
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Indique en horas la cantidad trabajadas esta semana.");
    System.out.println("Redondee al alza de a medias horas en caso de ser necesario.");
    double horas = s.nextDouble();

    s.close();
    System.out.printf("Por haber trabajado " + horas + " horas, su salario esta semana es de " + (horas * 12) + "€.");
  }
}
