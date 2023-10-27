/**
 * Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
public class Ejemplo01 {
  public static void main(String[] args) {
    String nombre;
    System.out.println("Dime cómo te llamas: ");
    nombre = System.console().readLine();

    System.out.println("¡Hola " + nombre + "! Bienvenido a la programación.");

    String num1;
    String num2;

    System.out.println("Introduce un número: ");
    num1 = System.console().readLine();

    System.out.println("Introduce un número: ");
    num2 = System.console().readLine();

    System.out.println("El resultado es: " + (num1 + num2));
    System.out.println(num1 + num2);// concatena porque lee los numeros como string
  }

}
