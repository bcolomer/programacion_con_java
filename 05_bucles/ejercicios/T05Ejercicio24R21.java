
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
    int fila;
    int columna;
    for (fila = 1; fila <= altura; fila++) {

      // escribir espacios
      for (columna = 1; columna <= (altura - fila); columna++) {
        System.out.print("_");

      }
      // escribir numeros crecientes
      for (columna = 1; columna <= fila; columna++) {
        System.out.print(columna);
      }

      // escribir numeros decrecientes
      for (columna = fila - 1; columna >= 1; columna--) {
        System.out.print(columna);
      }
      System.out.println("");
    }
  }
}
