
/*
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio31R28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int altura = 0;
    int ancho = 0;
    System.out.println("Imprime tu L para el coche, introduce la altura:");
    altura = s.nextInt();
    s.close();
    ancho = (altura / 2) + 1;
    for (int i = 1; i < altura; i++) {
      System.out.println("*");
    }
    for (int i = 0; i < ancho; i++) {
      System.out.print("* ");
    }
  }
}
