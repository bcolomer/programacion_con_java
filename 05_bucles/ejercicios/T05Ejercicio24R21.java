
/*
 * Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura: 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio24R21 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    System.out.println("escribe la altura para la piramide");
    altura = s.nextInt();
    s.close();

    for (int i = 0; i < altura; i++) {
      // esto pinta espacios:
      for (int j = 0; j < altura - i; j++) {
        System.out.print("_");
      }
      // esto imprime una piramide normal con numeros ascendentes
      /*
       * for (int j = 1; j <= (i * 2) + 1; j++) {
       * System.out.print(j);
       * }
       */
      // esto imprime la primera mitad de la piramide
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(j);
      }
      for (int j = i; j > 0; j--) {
        System.out.print(j);
      }

      System.out.println();
    }

    /*
     * int fila;
     * int columna;
     * for (fila = 1; fila <= altura; fila++) {
     * 
     * // escribir espacios
     * for (columna = 1; columna <= (altura - fila); columna++) {
     * System.out.print("_");
     * 
     * }
     * // escribir numeros crecientes
     * for (columna = 1; columna <= fila; columna++) {
     * System.out.print(columna);
     * }
     * 
     * // escribir numeros decrecientes
     * for (columna = fila - 1; columna >= 1; columna--) {
     * System.out.print(columna);
     * }
     * System.out.println("");
     * }
     */
  }
}
