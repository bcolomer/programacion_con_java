
/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y 
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. 
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. 
 * Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    String semana;
    int horaActual;
    int minutosAcual;
    Scanner s = new Scanner(System.in);
    System.out.println("¿Cuanto falta para el fin de semana?");
    System.out.println("Escribe que dia es hoy en minusculas y sin tilde");
    semana = System.console().readLine();
    System.out.println("Indique la hora actual y los minutos separados de espacios");
    horaActual = s.nextInt();
    minutosAcual = s.nextInt();
    s.close();
    switch (semana) {
      case "lunes":
        System.out.println("es lunes");
        break;
      case "martes":

        break;
      case "miercoles":

        break;
      case "jueves":

        break;
      case "viernes":

        break;
      case "sabado", "domingo":
        System.out.println("Ya es fin de semana! disfruta");

        break;
      default:
        break;
    }

  }

}
