/*
 * Realiza una programa que calcule las horas transcurridas entre dos horas de dos días
 * de la semana. No se tendrán en cuenta los minutos ni los segundos. El día de la semana 
 * se puede pedir como un número (del 1 al 7) o como una cadena (de “lunes” a “domingo”).
 * Se debe comprobar que el usuario introduce los datos correctamente y que el segundo 
 * día es posterior al primero. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio30R27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String primero = "";
    String segundo = "";
    int diaA = 0;
    int diaB = 0;

    System.out.println("Contador de horas entre un dia y hora especifico hasta otro dia y hora especifico");
    System.out.println(
        "puede introducir los dias por su nombre o por su numero tendiendo en cuenta que el primer dia es el lunes");
    System.out.println("Introduzca un dia de la semana:");
    primero = s.next().toLowerCase();
    System.out.println("Introduzca la hora");

    System.out.println("Introduzca otro dia de la semana:");
    segundo = s.next().toLowerCase();
    System.out.println("introduzca la hora");

    s.close();

    switch (primero) { // hacer lo mismo con la variable segundo
      case "lunes", "1":
        diaA = 1;
        break;
      case "martes", "2":
        diaA = 2;
        break;
      case "miercoles", "3":
        diaA = 3;
        break;
      case "jueves", "4":
        diaA = 4;
        break;
      case "viernes", "5":
        diaA = 5;
        break;
      case "sabado", "6":
        diaA = 6;
        break;
      case "domingo", "7":
        diaA = 7;
        break;
      default:
        System.out.println("No ha introducido un dia valido");
        break;
    }
  }
}
/**
 * funcion para convertir dia de semana en un numero entero
 * 
 * @param nombreDia
 * @return
 */
/*
 * public static int diasemana() {
 * {
 * switch () {
 * case "lunes", "1":
 * return dia = 1;
 * break;
 * case "martes", "2":
 * return dia = 2;
 * break;
 * case "miercoles", "3":
 * return dia = 3;
 * break;
 * case "jueves", "4":
 * return dia = 4;
 * break;
 * case "viernes", "5":
 * return dia = 5;
 * break;
 * case "sabado", "6":
 * return dia = 6;
 * break;
 * case "domingo", "7":
 * return dia = 7;
 * break;
 * default:
 * System.out.println("No ha introducido un dia valido");
 * break;
 * }
 */