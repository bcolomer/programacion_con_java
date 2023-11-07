
/*
 * Ejercicio resuelto profesor 7 de noviembre 2023 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class DiasSemana {
  public static void main(String[] args) {
    int dia;
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el numero del dia de la semana");
    dia = s.nextInt();
    s.close();

    switch (dia) {
      case 1, 2, 3, 4, 5:
        System.out.println("Es un dia entre semana");
        break;
      case 6, 7:
        System.out.println("Es un dia de fin de semana");

        break;

      default:
        System.out.println("el numero no se corresponde con ningun dia de la semana");
        break;
    }
  }

}