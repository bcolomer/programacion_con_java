
/*
 * Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio10R07 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double num = 0;
    double media = 0;
    double suma = 0;
    int contador = -1;
    System.out.println("-----Calculadora de promedios-----");
    System.out.println("Se calculara el promedio de los numeros que introduzca mientras sean positivos.");
    try {
      do {
        num = s.nextDouble();
        suma = suma + num;
        contador++;

      } while (num >= 0);
      suma = suma - num;
      media = suma / contador;

      System.out.println("La mmedia de los numeros positvos introducidos es: " + media);
      s.close();

    } catch (Exception InputMismatchException) {
      System.out.println("No se han introducido valores válidos");
    }
  }

}