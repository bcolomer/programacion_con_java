
/*
 * Escribe un programa que lea desde teclado un numero indefinido de numeros hasta que el usuario introduzca 
 * un valor negativo, momento en el cual se debera mostrar por pantalla el total de numeros leidos y la suma
 * de todos ellos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Do {
  public static void main(String[] args) {
    int num = 0;
    int suma = 0;
    int contador = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Cuanto suman todos los numeros que introduce? Cuantos numeros ha introducido?");
    System.out.println("Introduzca numeros, y pulsa enter, el programa se parará cuando introduzcas uno negativo");
    while (num >= 0) {
      System.out.print("?:");
      num = s.nextInt();
      if (num >= 0) {
        suma = suma + num;
        contador++;
      }
    }
    System.out.printf("La suma de los %d numeros positivos introducidos es %d", contador, suma);
    s.close();
  }
}
