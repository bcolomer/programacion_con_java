
/*
 * Escribe un programa que calcule el volumen de un cono según la fórmula
 * V = 1/3 pi r2 h
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;
//import java.lang.Math;--> no necesito importar la clase math para usar pi

public class T03Ejercicio09 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el radio la base del cono en centimetros ");
    double r = s.nextDouble();
    System.out.println("Introduzca la altura del cono en centimetros");
    double h = s.nextDouble();
    s.close();

    double volumenCono = (Math.PI * (Math.pow(r, 2)) * h) / 3;
    System.out.printf("El volumen del cono es de %.2f cm3", volumenCono);
  }
}
