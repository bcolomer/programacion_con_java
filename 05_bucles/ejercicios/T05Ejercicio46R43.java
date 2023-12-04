
/*
 * Realiza un programa que pinte por pantalla un rectángulo hueco hecho
 * con asteriscos. Se debe pedir al usuario la anchura y la altura.
 * Hay que comprobar que tanto la anchura como la altura sean mayores 
 * o iguales que 2, en caso contrario se debe mostrar un mensaje de 
 * error. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio46R43 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int alto = 0;
    int ancho = 0;
    do {
      System.out.println("Introduce la altura para el rectangulo");
      alto = s.nextInt();
    } while (alto <= 2);
    do {
      System.out.println("Introduce el ancho del rectangulo");
      ancho = s.nextInt();
    } while (ancho <= 2);

    s.close();
    // esto es un rectangulo relleno
    for (int i = 0; i < alto; i++) {
      for (int j = 0; j < ancho; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("   ");
    // esto es un rectangulo hueco:
    for (int i = 0; i < alto; i++) {
      for (int j = 0; j < ancho; j++) {
        if ((i != 0) && (i != alto - 1)) {
          if ((j != 0) && (j != ancho - 1)) {
            System.out.print(" ");
          } else {
            System.out.print("*");

          }
        } else {
          System.out.print("*");

        }
      }
      System.out.println();
    }
    System.out.println();
  }
}
