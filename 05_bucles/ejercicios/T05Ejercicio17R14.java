
/*
 * Realiza un programa que sume los 100 números siguientes a un número entero 
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido 
 * es correcto (que es un número positivo). 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio17R14 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    int sumaNum = 0;
    try {
      do {
        System.out.println("Introduzca un numero entero y positivo:");
        num = s.nextInt();
      } while ((num < 0) /* || ((num >= 10) && (num % 10 != 0)) ||(((num>=1)&&(num<=9))&&(num%)) */);
      s.close();
      for (int i = num; i < num + 100; i++) {
        sumaNum = sumaNum + (i);
        System.out.println("suma por vuelta " + sumaNum);
      }
    } catch (Exception e) {
      System.out.println("El numero es incorrecto");
    }
    System.out.println("suma total = " + sumaNum);
  }
}
