/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas
 * que se quiere convertir deberá estar almacenada en una variable
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio05 {
  public static void main(String[] args) {
    double conversion;
    int pesetas;
    double resultado;

    pesetas = 1000;
    conversion = 166.386;
    resultado = pesetas / conversion;
    System.out.println("");
    System.out.printf("por " + pesetas + " pesetas recibiras %.2f €. ", resultado);
    System.out.println("");

    String resultadob = String.format("%.2f", resultado);
    System.out.println("por " + pesetas + " pesetas recibirás " + resultadob + "€");
    // System.out.printf("%d pesetas --> %.2f ");
  }
}
