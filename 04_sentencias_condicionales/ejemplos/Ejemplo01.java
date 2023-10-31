
/*
* escribe un programa que solicite por teclado un valor de tipo 
*numerico entero positivo, y hecho esto, muestre por pantalla
 *un mensaje que indique si ha aprobado o no
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejemplo01 {

  public static void main(String[] args) {
    System.out.println("Indique la nota que ha obtenido en el examen sin decimales");
    Scanner s = new Scanner(System.in);
    int nota1 = s.nextInt();
    if (nota1 >= 5) {
      System.out.println("Enhorabuena, has aprobado");

    } else {
      System.out.println("lo siento, has suspendido");
    }
    s.close();
  }
}
// otra opcion de pedir datos
// string entrada = System.console().readLine();
// double nota = Double.parseDouble (line);