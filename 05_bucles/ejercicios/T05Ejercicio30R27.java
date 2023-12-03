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
    diaA = diasemana(primero);
    diaB = diasemana(segundo);
    System.out.println("el primer dia ingresado es " + diaA);
    System.out.println("el segundo dia ingresado es " + diaB);

  }

  /**
   * 
   * @param dia
   * @return
   */
  public static int diasemana(String dia) {
    int resultado = 0;

    switch (dia) {
      case "lunes", "1":
        resultado = 1;
        break;
      case "martes", "2":
        resultado = 2;
        break;
      case "miercoles", "3":
        resultado = 3;
        break;
      case "jueves", "4":
        resultado = 4;
        break;
      case "viernes", "5":
        resultado = 5;
        break;
      case "sabado", "6":
        resultado = 6;
        break;
      case "domingo", "7":
        resultado = 7;
        break;
      default:
        System.out.println("No ha introducido un dia valido");
        break;
    }
    return resultado;
  }
}