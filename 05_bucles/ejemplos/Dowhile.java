
/*
 * Escribe un programa que lea desde teclado un numero indefinido de numeros hasta que el usuario introduzca 
 * un valor negativo, momento en el cual se debera mostrar por pantalla el total de numeros leidos y la suma
 * de todos ellos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Dowhile {
  public static void main(String[] args) {
    int num;
    int contador = 0;
    int suma = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("introduzca numeros");
    do {

      num = s.nextInt();
      suma = suma + num;
      contador++;

    } while (num != 0);
    System.out.println("contador: " + (contador - 1));
    System.out.println("suma es :" + suma);
    s.close();
  }

}
