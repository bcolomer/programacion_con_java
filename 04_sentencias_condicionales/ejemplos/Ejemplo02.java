
/*
operadores logicos
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numero;
    System.out.println("Introduce un numero entre 1 y 100:");
    numero = s.nextInt();
    if ((numero >= 1) && (numero <= 100)) {
      System.out.println("enhorabuena el valor es correcto");
    } else {
      System.out.println("Prueba con otro numero, el valor no es correcto");
    }

    s.close();
  }

}
