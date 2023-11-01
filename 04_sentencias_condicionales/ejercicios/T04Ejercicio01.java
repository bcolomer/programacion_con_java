
/*
 * Escribe un programa que pida por teclado un día de la semana y que diga qué
 * asignatura toca a primera hora ese día.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un dia de la semana para saber que asignatura tienes a primera hora");
    System.out.println("El dia debe introducirse en letra minuscula sin tildes:");
    String dia = s.nextLine();
    s.close();

    switch (dia) {
      case "lunes":
        System.out.println("A primera hora tienes FOL");
        break;
      case "martes":
        System.out.println("A primera hora tienes Programacion");
        break;
      case "miercoles":
        System.out.println("A primera hora tienes Entornos");
        break;
      case "jueves":
        System.out.println("A primera hora tienes Base de Datos");
        break;
      case "viernes":
        System.out.println("A primera hora tienes Programacion");
        break;
      case "sabado", "domingo":
        System.out.println("Es fin de semana, no tienes clases.");
        break;
      default:
        System.out.println("No has introducido el dia correctamente");
        break;
    }
  }
}
