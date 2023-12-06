
/*
 * Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
 * encargado realizar un programa que pinte un 8 por pantalla usando la letra
 * M. Se pide al usuario la altura, que debe ser un número entero impar mayor
 * o igual que 5. Si el número introducido no es correcto, el programa deberá
 * mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
 * La anchura de la figura siempre será de 6 caracteres.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio47 {
  public static void main(String[] args) {
    int altura = 0;
    Scanner s = new Scanner(System.in);
    int alturaPiso = 0;
    System.out.println("Impresora de 8. Introduce la altura, recuerda que debe ser numero impar igual o mayor a 5:");
    do {
      altura = s.nextInt();
      if ((altura % 2 == 0) || (altura < 5)) {
        System.out.println("Error, debes introducir un valor válido. Introduce la Altura:");
      }
    } while ((altura % 2 == 0) || (altura < 5));
    s.close();
    alturaPiso = (altura - 3) / 2;
    System.out.println("MMMMMM");
    for (int i = 0; i < alturaPiso; i++) {
      System.out.println("M    M");
    }
    System.out.println("MMMMMM");
    for (int i = 0; i < alturaPiso; i++) {
      System.out.println("M    M");
    }
    System.out.println("MMMMMM");
  }
}