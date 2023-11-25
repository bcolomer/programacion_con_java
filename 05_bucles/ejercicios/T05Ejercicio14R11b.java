
/*
 * calcular base por exponente teniendo en cuenta que el exponente puede ser 
 * 0, mayor a 0 o menor a 0 
 * 
 * @autor Barbara Colomer
 */import java.util.Scanner;

public class T05Ejercicio14R11b {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    double base = 0;
    double exponente = 0;
    double potencia = 1;
    System.out.println("introduzca la base");
    base = s.nextDouble();
    System.out.println("introduzca el exponente:");
    exponente = s.nextDouble();

    /*
     * if (exponente < 0) {
     * while (exponente < 0) {
     * potencia = potencia * base;
     * exponente++;
     * 
     * potencia = 1 / ((base * (Math.abs(exponente))));
     * } else {
     * while (exponente > 0) {
     * potencia = potencia * base;
     * exponente--;
     * 
     * }
     * }
     */

    System.out.println(potencia);
    System.out.println(Math.pow(base, exponente));
    s.close();

  }

}
