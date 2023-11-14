/*
 * Muestra los números múltjplos de 5 de 0 a 100 utilizando un bucle for. 
 * 
 * @autor Barbara Colomer
 */
public class T05Ejercicio01 {
  public static void main(String[] args) {
    for (int i = 0; i <= 100; i += 5) {
      System.out.print(i + " ");
    }
    System.out.println("");
    // otra forma de resolverlo:
    int resultado = 0;
    for (int j = 0; resultado <= 99; j++) {
      resultado = j * 5;
      System.out.print(resultado + (","));
    }
  }
}
