/*
 * Realiza un conversor del sistema decimal al sistema de “palotes”. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio37R34 {
  public static void main(String[] args) {

    long numero = 0;
    long invertido = 0;
    int contador = 0;
    long modulo = 0;

    Scanner s = new Scanner(System.in);

    System.out.println("introduzca un numero para su conversion: ");
    numero = s.nextInt();
    s.close();
    // invertido = Matematicas.voltea(numero);
    long cuenta = contador(numero);
    System.out.println(cuenta);

    /*
     * for (int i = 0; i < contador; i++) {
     * modulo = invertido % 10;
     * invertido = invertido / 10;
     * for (int j = 0; j < modulo; j++) {
     * System.out.print("|");
     * }
     * System.out.print(" - ");
     * }
     */
  }

  public static int contador(long num) {

    int contador = 1;
    for (int i = 0; i < num; i++) {
      num = num / 10;
      contador++;

    }
    return contador;
  }
}