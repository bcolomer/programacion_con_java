/*
 * Escribe un programa que pinte por pantalla un par de calcetines, de los que
 * se ponen al lado del árbol de Navidad para que Papá Noel deje sus regalos. 
 * El usuario debe introducir la altura. Suponemos que el usuario introduce una 
 * altura mayor o igual a 4. Observa que la talla de los calcetines y la distancia 
 * que hay entre ellos (dos espacios) no cambia, lo único que varía es la altura.
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio60 {
  public static void main(String[] args) {

    int altura = 0;
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce la altura para los calcetines, debe ser mayor a 4");

    do {
      altura = s.nextInt();
      if (altura < 4) {
        System.out.println("Recuerda que la altura debe de ser mayor a 4, introduce un nuevo numero");
      }
    } while (altura < 4);
    s.close();
    for (int i = 0; i < altura - 2; i++) {
      System.out.println("***     ***");
    }

    System.out.println("******  ******\n******  ******");
  }

}
