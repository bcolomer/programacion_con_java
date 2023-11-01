
/**
* Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Escriba 1- si quiere calcular el area de un cuadrado"
        + " \nEscriba 2- si quiere calcular el area de un rectangulo"
        + "\nEscriba 3- si quiere calcular el area de un triangulo");
    int eleccion = s.nextInt();

    switch (eleccion) {
      case 1:
        System.out.println("Indique el lado en cm");
        double lado = s.nextDouble();
        System.out.println("El area del cuadrado segun el lado introducido es " + (lado * lado) + " cm2.");
        break;
      case 2:
        System.out.println("Indique la altura en cm");
        double h = s.nextDouble();
        System.out.println("Indique la base en centimetros");
        double b = s.nextDouble();
        System.out.println("El area del rectangulo es " + (b * h) + " cm2.");
        break;
      case 3:
        System.out.println("Indique la altura en cm");
        h = s.nextDouble();
        System.out.println("Indique la base en centimetros");
        b = s.nextDouble();
        System.out.println("El area del triangulo es " + ((b * h) / 2) + " cm2.");
        break;
      default:
        System.out.println("La opcion elegida no es correcta");
        break;
    }
    s.close();
  }
}
