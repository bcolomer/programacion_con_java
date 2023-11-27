
/*
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un
numero negativo y nos diga cuantos números se han introducido, la media de
los impares y el mayor de los pares. El número negativo sólo se utiliza para
indicar el final de la introducción de datos pero no se incluye en el cómputo. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio21R18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int num = 0;
    int numTotal = 0;
    int sumaImpar = 0;
    int cantImpar = 0;
    double mediaImpar = 0;
    int parMayor = 0;
    do {
      System.out.println("Introduzca numeros enteros, el programa parará con un numero negativo");
      num = s.nextInt();
      numTotal = numTotal + 1;
      if (num % 2 == 0) {
        if (parMayor < num) {
          parMayor = num;
        }

      } else {
        cantImpar = cantImpar + 1;
        sumaImpar = sumaImpar + num;

      }
    } while (num >= 0);

    s.close();
    mediaImpar = sumaImpar / cantImpar;
    System.out.printf(
        "se han introducido %d numeros positivos, la media de los impares es de %.2f y el mayor de los pares es %d",
        (numTotal - 1), mediaImpar, parMayor);
  }
}
