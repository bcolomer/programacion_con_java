
/*
 *Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio20R17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    char borde;
    int columna;
    int incremento = 1;
    System.out.println("\033[1mNavidad´s Time\033[0m");
    System.out.println("Introduzca la altura para su arbolito sin decoraciones");
    altura = s.nextInt();
    System.out.println("Introduzca el caracter para pintar el arbol");
    borde = s.next().charAt(0);

    s.close();
    int fila;
    for (fila = 1; fila <= altura; fila++) {
      for (columna = 1; columna <= (altura - fila); columna++) {
        System.out.print(" ");

      }
      for (columna = 1; columna <= incremento; columna++) {
        if ((columna == 1) || (columna == incremento) || (fila == altura)) {
          System.out.print(borde);
        } else {
          System.out.print(" ");
        }

      }
      incremento = incremento + 2;
      System.out.println("");

    }

    System.out.println("mi piramide hueca trocha");
    /*
     * for (int i = 1; i < altura; i++) {
     * System.out.println("");
     * // para los espacios de la izquierda:
     * for (int j = i; j < altura; j++) {
     * System.out.print(".");
     * }
     * // para el borde izquierdo
     * System.out.print("i");
     * // para la primera mitad del relleno izquierdo
     * for (int k = 2; k <= i; k++) {
     * System.out.print("k");
     * }
     * // para la mitad derecha del relleno
     * for (int l = 3; l <= i; l++) {
     * System.out.print("p");
     * 
     * }
     * System.out.print("h"); // esto hace lo mismo que el bucle:
     * // for (int m = 2; m < altura - 2; m++) {// si pongo m=2 imprime desde la
     * // linea de arriba si pongo m=3 no imprime ninguna h
     * // System.out.print("h");
     * // }
     * // borde derecho
     * // System.out.print("d");
     * }
     * System.out.println("");
     * 
     * // esto es para la base de la piramide
     * for (int m = 1; m < (altura * 2); m++) {
     * System.out.print("s");
     * }
     */

  }
}
/*
 * // para la mitad derecha del relleno
 * for (int i = 2; i < altura; i++) {
 * 
 * for (int l = 3; l <= i; l++) {
 * System.out.print(" ");
 * }
 * }
 */