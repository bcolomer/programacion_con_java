
/*
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Escriba la cantidad de horas trabajadas esta semana");
    System.out.println("Si no son completas, redondee al alza, somos buenos jefes!");
    int horasTrabajadas = s.nextInt();
    s.close();
    int horasExtrasTrabajadas = horasTrabajadas - 40;
    int salarioSemanal = horasTrabajadas * 12;
    int horasExtras = horasExtrasTrabajadas * 16;
    int salarioBasico = 480;
    if (horasTrabajadas <= 40) {
      System.out.println("El salario correspondiente a esta semana es de " + salarioSemanal
          + "€.");
      System.out.println("Esta semana no has trabajado horas extra.");
    } else {

      System.out.println("El salario correspondiente a esta semana es de "
          + (salarioBasico + horasExtras) + "€");
      System.out.println("La cantidad de horas trabajadas extras ha sido de "
          + horasExtrasTrabajadas + " horas.");
      System.out.println("La ganancia por las horas extras es de " + horasExtras + "€.");
    }
  }
}
