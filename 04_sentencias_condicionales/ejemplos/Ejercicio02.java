
/**
* Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero del 1 al 12 y se le indicara a que mes corresponde");
    int mes = s.nextInt();
    switch (mes) {
      case 1:
        System.out.println("Corresponde a Enero");
        break;
      case 2:
        System.out.println("Corresponde a Febrero");
        break;
      case 3:
        System.out.println("Corresponde a Marzo");
        break;
      case 4:
        System.out.println("Corresponde a Abril");
        break;
      case 5:
        System.out.println("Corresponde a Mayo");
        break;
      case 6:
        System.out.println("Corresponde a Junio");
        break;
      case 7:
        System.out.println("Corresponde a Julio");
        break;
      case 8:
        System.out.println("Corresponde a Agosto");
        break;
      case 9:
        System.out.println("Corresponde a Septiembre");
        break;
      case 10:
        System.out.println("Corresponde a Octubre");
        break;
      case 11:
        System.out.println("Corresponde a Noviembre");
        break;
      case 12:
        System.out.println("Corresponde a Diciembre");
        break;

      default:
        System.out.println("El numero que has introducido no se corresponde con ningun mes");
        break;
    }

    s.close();
  }
}
