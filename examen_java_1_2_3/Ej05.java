
/*
 * Escribe un programa que calcule el volumen de un tronco de cono según la siguiente fórmula: 
 * V = (1/3)πh(R2 + r2 + Rr)
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ej05 {
  public static void main(String[] args) {
    double baseMayor;
    double baseMenor;
    double h;
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el radio de la base mayor en centimetros");
    baseMayor = s.nextDouble();
    System.out.println("introduzca el radio de la base menor en centimetros");
    baseMenor = s.nextDouble();
    System.out.println("Introduzca la altura en centimetros");
    h = s.nextDouble();
    s.close();
    double volumen = ((Math.PI) * h)
        * (((Math.pow(baseMayor, 2)) + (Math.pow(baseMenor, 2))) + (baseMayor * baseMenor)) / 3;
    System.out.printf("El volumen del toroide es de \033[1;31m %.4f cm \u00B3\033[0m.", volumen);
  }
}
