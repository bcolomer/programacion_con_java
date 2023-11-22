
/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un 
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla.
 *  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
 * combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
 * satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte. 
 * 
 * @autor Barbara Colomer
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    final int CLAVE_CORRECTA = 7643; // la declaro constante porque la clave no cambiara
    int intentoClave = 0;
    int contadorIntentos = 0;
    System.out.println("-----ACCESO A CAJA FUERTE-----");
    System.out.println("Si deberia tener acceso, tiene que tener una clave, solo tiene 4 intentos");
    try {
      do {
        contadorIntentos++;
        System.out.print("Ingrese la clave: ");

        intentoClave = s.nextInt();

        if ((intentoClave < 0) || (intentoClave > 9999)) {
          System.out.println("La clave debe ser un numero entero positivo de 4 cifras");
          System.out.printf("Le quedan %d intentos\n", (4 - contadorIntentos));
        } else {
          if (intentoClave == CLAVE_CORRECTA) {
            System.out.println("La caja fuerte se ha abierto satisfactoriamente. \nRecuerde volver a cerrarla.");
          } else {
            System.out.println("Lo siento, esa no es la combinación.");
            System.out.printf("Le quedan %d intentos\n", (4 - contadorIntentos));
          }
        }
      } while ((contadorIntentos < 4) && (intentoClave != CLAVE_CORRECTA));
      if (contadorIntentos == 4) {
        System.out.println("==========================================");
        System.out.println("|| La caja fuerte esta bloqueada porque ||");
        System.out.println("|| ha superado el numero de intentos.   ||");
        System.out.println("|| Puede volver a intentarlo en 4 horas ||");
        System.out.println("==========================================");
      }
    } catch (InputMismatchException e) {
      System.out.println("Error. Debe ingresar una clave numerica.");
    }
    s.close();
  }
}