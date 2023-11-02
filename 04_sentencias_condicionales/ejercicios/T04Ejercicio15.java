
/*
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido 
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice 
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o 
 * hacia la derecha. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el caracter de relleneno de la piramide");
    char r = s.next().charAt(0);
    System.out.println("Indique para donde quiere el vertice:");
    System.out.println(" 1- arriba \n 2- abajo \n 3- derecha \n 4- izquierda");
    String direccion = System.console().readLine(); // lo recibo como string para controlar excepciones fuera del 1 al 4
    s.close();

    switch (direccion) {
      case "1":
        System.out.println("    " + r);
        System.out.println("   " + r + r + r);
        System.out.println("  " + r + r + r + r + r);
        System.out.println(" " + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r + r + r);
        break;
      case "2":
        System.out.println("" + r + r + r + r + r + r + r + r + r);
        System.out.println(" " + r + r + r + r + r + r + r);
        System.out.println("  " + r + r + r + r + r);
        System.out.println("   " + r + r + r);
        System.out.println("    " + r);
        break;
      case "3":
        System.out.println("" + r);
        System.out.println("" + r + r + r);
        System.out.println("" + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r + r + r);
        System.out.println("" + r + r + r + r + r);
        System.out.println("" + r + r + r);
        System.out.println("" + r);
        break;
      case "4":
        System.out.println("           " + r);
        System.out.println("         " + r + r + r);
        System.out.println("       " + r + r + r + r + r);
        System.out.println("     " + r + r + r + r + r + r + r);
        System.out.println("   " + r + r + r + r + r + r + r + r + r);
        System.out.println(" " + r + r + r + r + r + r + r + r + r + r + r);
        System.out.println("   " + r + r + r + r + r + r + r + r + r);
        System.out.println("     " + r + r + r + r + r + r + r);
        System.out.println("       " + r + r + r + r + r);
        System.out.println("         " + r + r + r);
        System.out.println("           " + r);
        break;
      default:
        System.out.println("El caracter introducido no corresponde a ninguna opcion para la direccion de la piramide");
        break;
    }
  }
}
