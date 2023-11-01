
/*
 * Escribe un programa que dada una hora determinada (horas y minutos), 
 * calcule los segundos que faltan para llegar a la medianoche.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("----¿CUANTO FALTA PARA MEDIANOCHE? ---");
    System.out.println("Introduzca la hora en formato 24hs");
    int hora = s.nextInt();
    if ((hora < 0) || (hora >= 24)) {
      System.out.println("La hora no ha sido introducida en el formato indicado");

    } else {
      System.out.println("Introduzca los minutos");
      int minutos = s.nextInt();
      if ((minutos < 0) || (minutos >= 60)) {
        System.out.println("La cantidad de minutos introducida no es válida");
        s.close();
      } else {

        int horasRestantes = 23 - hora;
        int minutosRestantes = 60 - minutos;
        int segundosHora = horasRestantes * 3600;
        int segundosMinutos = minutosRestantes * 60;

        switch (hora) {
          case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23:
            System.out.println("Para medianoche restan " + (segundosHora + segundosMinutos) + " segundos.");
            break;
        }
      }
    }
  }
}
