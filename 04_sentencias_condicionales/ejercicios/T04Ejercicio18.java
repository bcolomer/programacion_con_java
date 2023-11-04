
/*
 * Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio18 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un numero entero de hasta 5 cifras");
    int num = s.nextInt();
    int primerNum;
    s.close();
    if (num > 99999) {
      System.out.println("El numero introducido esta fuera de los parametros indicados");
    } else if ((num >= 10000) && (num <= 99999)) {
      primerNum = num / 10000;
      System.out.println("La primera cifra del numero introducido es " + primerNum);
    } else if ((num >= 1000) && (num <= 9999)) {
      primerNum = num / 1000;
      System.out.println("La primera cifra del numero introducido es " + primerNum);
    } else if ((num >= 100) && (num <= 999)) {
      primerNum = num / 100;
      System.out.println("La primera cifra del numero introducido es " + primerNum);
    } else if ((num >= 10) && (num <= 99)) {
      primerNum = num / 10;
      System.out.println("La primera cifra del numero introducido es " + primerNum);
    } else {
      System.out.println("La primera cifra del numero introducido es " + num);
    }

  }
}
