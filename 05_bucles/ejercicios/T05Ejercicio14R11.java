
/*
 * Escribe un programa que pida una base y un exponente (entero positivo) y que
calcule la potencia. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio14R11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double numBase = 0;
    double numExp = 0;
    System.out.print("Escriba un numero que sera la base:");
    numBase = s.nextDouble();
    System.out.print("Escriba un numero entero positivo para el exponente: ");
    do {
      numExp = s.nextDouble();
    } while ((numExp < 0) && (numExp % 10 != 0));
    /*
     * no enteindo porque tiene que ser or cuando quiero que las dos se cumplan a la
     * vez
     * tampoco se como hacer si es menor a 10 para saber si es entero o decimal
     */
  }
}
