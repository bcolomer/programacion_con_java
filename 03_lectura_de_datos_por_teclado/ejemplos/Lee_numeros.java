/**
 * Explica tu codigo aqui
 * 
 * @autor Barbara Colomer
 */
public class Lee_numeros {
  public static void main(String[] args) {
    String linea; // Variable que almacenará cada linea que ontroduzcamos por teclado

    System.out.println("Introduce un número entero: "); // Pedimos primer numero
    linea = System.console().readLine();

    int num1;
    num1 = Integer.parseInt(linea);

    System.out.println("Introduce otro número entero: "); // Pedimos otro numero
    linea = System.console().readLine();

    int num2;
    num2 = Integer.parseInt(linea);

    System.out.printf("El primer número es: %d \n", num1);
    System.out.printf("El segundo número es: %d \n", num2);

    System.out.println("El doble del primer número es " + num1 * 2);

    // Parseamos float
    System.out.println("Introduce un número real: \n");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("El número real introducido es: %.2f", numReal);

  }
}