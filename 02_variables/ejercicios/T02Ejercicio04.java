/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que
 * se quiere convertir deberá estar almacenada en una variable.
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio04 {
  public static void main(String[] args) {
    double euros;
    double pesetas;
    int resultado;

    euros = 6.00;
    pesetas = 166.386;
    resultado = (int) (pesetas * euros);

    System.out.println("por " + euros + "€ recibiras " + resultado + " pesetas");
    System.out.printf("%.2f € --> %d pesetas", euros, resultado);
    // System.out.println(esto es una prueba);
  }
}
