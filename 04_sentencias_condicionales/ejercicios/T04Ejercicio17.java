
/*
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce un numero y se le informará de cual es la ultima cifra de dicho numero");
    int num = s.nextInt();
    s.close();
    int ultimoNum = num % 10;
    System.out.println("La ultima cifra del numero que ha introducido es : " + ultimoNum);
  }
}