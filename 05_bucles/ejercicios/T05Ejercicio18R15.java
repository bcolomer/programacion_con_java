
/*
 * Escribe un programa que obtenga los números enteros comprendidos entre dos
 * números introducidos por teclado y validados como distintos, el programa debe 
 * empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class T05Ejercicio18R15 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int numA = 0;
    int numB = 0;
    int auxiliar = 0;
    try {
      System.out.println("Introduzca un numero entero: ");
      numA = s.nextInt();
      do {
        System.out.println("El primer numero introducido es " + numA);
        System.out.println("Introduzca otro número \nAsegurese que sean distintos");
        numB = s.nextInt();
      } while (numA == numB);
    } catch (InputMismatchException e) {
      System.out.println("No ha introducido valores correctos");
    }
    s.close();
    if (numA < numB) {
      auxiliar = numA;
      for (int i = numA; auxiliar <= numB; i++) { // porque me marca un error como que i no esta siendo usado
        System.out.printf("%d, ", auxiliar);
        auxiliar = auxiliar + 7;
      }
    } else {
      auxiliar = numB;
      for (int i = numB; auxiliar <= numA; i++) {
        System.out.printf("%d, ", auxiliar);
        auxiliar = auxiliar + 7;
      }
    }
  }
}
