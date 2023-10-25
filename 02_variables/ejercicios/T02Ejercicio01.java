/**
 * Escribe un programa en el que se declaren las variables enteras x e y.
 * Asígnales los valores 144 y 999 respectivamente. A continuación, muestra por
 * pantalla
 * el valor de cada variable, la suma, la resta, la división y la
 * multiplicación.
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio01 {
  public static void main(String[] args) {
    int x = 144;
    int y = 999;

    System.out.println("la suma de los numeros introducidos es " + (x + y));
    System.out.println("la resta de los numeros introducidos es " + (x - y));
    System.out.println("la multiplicacion de los numeros introducidos es " + (x * y));
    System.out.printf("la division de los numeros introducidos es %.2f", (double) x / (double) y);

  }

}
