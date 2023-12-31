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
    int horaDiaA = 0;
    int horaDiaB = 0;
    int cantidadHoras = 0;

    // falta realizar comprobacion de errores, respecto a que no se introduzcan dias
    // validos, o que el segundo dia sea mas pequeño que el primero

    System.out.println("Contador de horas entre un dia y hora especifico hasta otro dia y hora especifico");
    System.out.println(
        "puede introducir los dias por su nombre o por su numero tendiendo en cuenta que el primer dia es el lunes");

    System.out.println("Introduzca un dia de la semana:");
    primero = s.next().toLowerCase();

    System.out.println("Introduzca la hora en formato 24hs");
    horaDiaA = s.nextInt();
    if ((horaDiaA < 0) || (horaDiaA > 24)) {
      System.out.println("la hora introducida no esta en formato 24 hs, Vuelva a introducirla:");
      horaDiaA = s.nextInt();
    }

    System.out.println("Introduzca otro dia de la semana:");
    segundo = s.next().toLowerCase();
    System.out.println("introduzca la hora en formato 24hs");
    horaDiaB = s.nextInt();
    if ((horaDiaB < 0) || (horaDiaB > 24)) {
      System.out.println("la hora introducida no esta en formato 24 hs, Vuelva a introducirla:");
      horaDiaB = s.nextInt();
    }

    s.close();
    diaA = diasemana(primero);
    diaB = diasemana(segundo);

    cantidadHoras = (((diaB - diaA) - 1) * 24) + (24 - horaDiaA) + horaDiaB;
    // System.out.println("el primer dia ingresado es " + diaA);
    // System.out.println("el segundo dia ingresado es " + diaB);
    System.out.printf(
        "La cantidad de horas transcurridas entre %s y %s  a las horas anteriormente indicadas es de %d horas", primero,
        segundo,
        cantidadHoras);

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