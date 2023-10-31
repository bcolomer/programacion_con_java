
/**
* Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejemplo03Switch {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println(
        "Introduzca un numero segun la siguiente lista: 1- Lunes, 2-Martes, 3- Miercoles, 4- Jueves, 5- Viernes, 6- Sábado, 7-Domingo");
    int diaSemana = s.nextInt();
    s.close();
    switch (diaSemana) {
      case 1:
        System.out.println("es un dia de entre semana");
        break;
      case 2:
        System.out.println("es un dia de entre semana");
        break;
      case 3:
        System.out.println("es un dia de entre semana");
        break;
      case 4:
        System.out.println("es un dia de entre semana");
        break;
      case 5:
        System.out.println("es un dia de entre semana");
        break;
      case 6:
        System.out.println("es fin de semana");
        break;
      case 7:
        System.out.println("es fin de semana");
        break;

      default:
        System.out.println("el numero introducido no se corresponde con ningun dia de la semana");
        break;
    }
  }
}
