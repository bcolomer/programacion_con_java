
/*
 * Realiza el control de acceso a una caja fuerte. La combinación será un 
 * número de 4 cifras. El programa nos pedirá la combinación para abrirla.
 *  Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
 * combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
 * satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int claveCorrecta = 7643;
    int intentoClave = 0;
    int contadorIntentos = 0;
    System.out.println("-----ACCESO A CAJA FUERTE-----");
    System.out.println("Si deberia tener acceso, tiene que tener una clave, solo tiene 4 intentos");

    do {
      contadorIntentos++;
      System.out.print("Ingrese la clave: ");
      intentoClave = s.nextInt();
      if ((intentoClave < 0) || (intentoClave > 9999)) {
        System.out.println("La clave debe ser un numero entero positivo de 4 cifras");
      } else {
        if (intentoClave == claveCorrecta) {
          System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        } else {
          System.out.println("Lo siento, esa no es la combinación.");
        }
      }
    } while ((contadorIntentos < 4) && (intentoClave != claveCorrecta));
    if (contadorIntentos == 4) {
      System.out.println("Ha superado el numero de intentos");
    }
    s.close();
  }
}