
/*
 * Realiza un programa que, dado un día de la semana (de lunes a viernes) y 
 * una hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana. 
 * Se considerará que el fin de semana comienza el viernes a las 15:00h. 
 * Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio22R20 {
  public static void main(String[] args) {
    String semana;
    int horaActual;
    int minutosAcual;
    Scanner s = new Scanner(System.in);
    System.out.println("¿Cuanto falta para el fin de semana?");
    System.out.println("Escribe que dia es hoy sin tildes");
    semana = System.console().readLine();
    System.out.println("Indique la hora actual y los minutos separados de espacios");
    horaActual = s.nextInt();
    minutosAcual = s.nextInt();
    int minDelDia = (horaActual * 60) + minutosAcual;
    int minutosViernes = 900;
    int minutosPorDia = 1440;

    s.close();
    switch (semana) {
      case "lunes", "Lunes", "LUNES":
        System.out.printf("Para el fin de semana faltan %d minutos",
            ((minutosPorDia * 4) + minutosViernes - minDelDia));
        break;
      case "martes", "Martes", "MARTES":
        System.out.printf("Para el fin de semana faltan %d minutos",
            ((minutosPorDia * 3) + minutosViernes - minDelDia));
        break;
      case "miercoles", "Miercoles", "MIERCOLES":
        System.out.printf("Para el fin de semana faltan %d minutos",
            ((minutosPorDia * 2) + minutosViernes - minDelDia));
        break;
      case "jueves", "Jueves", "JUEVES":
        System.out.printf("Para el fin de semana faltan %d minutos", (minutosPorDia + minutosViernes - minDelDia));
        break;
      case "viernes", "Viernes", "VIERNES":
        System.out.printf("Para el fin de semana faltan %d minutos", (minutosViernes - minDelDia));
        break;
      case "sabado", "Sabado", "SABADO", "domingo", "Domingo", "DOMINGO":
        System.out.println("Ya es fin de semana! disfruta");
        break;
      default:
        System.out.println("Error: no has introducido el dia correctamente");
        break;
    }
  }
}
