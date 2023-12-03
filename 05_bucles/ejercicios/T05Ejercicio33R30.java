
/*
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio33R30 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int base = 0;

    System.out.println("Introduzca la altura que tendra su letra U");
    altura = s.nextInt();
    s.close();
    base = altura - 2;
    // para pintar los asteriscos de la izq hasta altura -1
    for (int i = 0; i < altura - 1; i++) {
      System.out.print("*");
      // para pintar los espacios de dentro
      for (int j = 0; j < (altura * 2) - 3; j++) {
        System.out.print(" ");// un espacio
      }
      // esto pinta los asteriscos de la derecha
      System.out.print("*");
      // hace un salto de linea para pasar a la linea de abajo
      System.out.println();
    }
    // esto es para la ultima linea:
    for (int j = 0; j < base + 1; j++) {
      if (j == 0) {
        System.out.print("  ");// dos espacios ya que los asteriscos de la ultima fila estan separados

      } else {
        System.out.print("* ");// asterisco y un espacio
      }
    }
  }
}