
/*
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y 
 * nos ha pedido hacer un configurador que calcule el precio según el alto y el ancho. 
 * El precio base de una bandera es de un céntimo de euro el centímetro cuadrado.
 *  Si la queremos con un escudo bordado, el precio se incrementa en 2.50 € independientemente
 *  del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio25R23 {
  public static void main(String[] args) {
    int alto = 0;
    int ancho = 0;
    int superficie = 0;
    double escudo = 0;
    String pregunta = "";
    double envio = 3.25;
    double precio = 0.01;
    double precioSuperficie = 0;
    String bordado = "";
    double total = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el alto de la bandera en centimetros");
    alto = s.nextInt();
    System.out.println("Introduzca el ancho en centimetros");
    ancho = s.nextInt();
    System.out.println("¿Desea el escudo bordado? (s:si n:no)");
    pregunta = System.console().readLine();
    System.out.println("Gracias, aqui tiene el desglose de su compra:");
    s.close();
    if (pregunta.equals("n")) {
      bordado = "Sin escudo";
      escudo = 0;
    } else if (pregunta.equals("s")) {
      bordado = "Con escudo";
      escudo = 2.5;
    }
    /*
     * Pregunta para el profesor:
     * Como se puede hacer para leer por teclado solo el primer caracter de un
     * String y luego comparar ese caracter con otro. Para recoger el caracter puedo
     * usar
     * char y charAt pero si quiero compararlo con equals no me deja porque equals
     * no es
     * para primitivos y tampoco me deja con ==
     * ej: if pregunta.charAt(0).equals"s"--> con esto quiero que coja solo el
     * primer
     * caracter de el string pregunta y lo compare con el caracter "s"
     */

    superficie = alto * ancho;
    precioSuperficie = superficie * precio;
    total = precioSuperficie + escudo + envio;
    System.out.printf("Bandera de %d cm2: %15.2f €\n", superficie,
        precioSuperficie);

    // System.out.printf("%-17s %15.2f €\n", bordado, escudo);
    System.out.printf("%-25s %-15.2f €\n", bordado, escudo);
    System.out.printf("%-25s %-15.2f €\n", "Gastos de envio:", envio);
    System.out.printf("%-25s %-15.2f €\n", "Total", total);
    // System.out.printf("%-20sBandera de %d cm2 %-15.2f €", superficie,
    // precioSuperficie);
    // System.out.printf("Gastos de envio: %15.2f €\n", envio);
    // System.out.printf("%-15s %15.2f", "Total", total + "€");
    // System.out.printf("%25 %-10.2f", ("Bandera de " + superficie + "cm2"),
    // (precioSuperficie + "€"));
  }
}
// no consigo resolver los formatos correctamente