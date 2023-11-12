/*
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
 *  El programa preguntará primero de qué sabor quiere el usuario la tarta: 
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa 
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar 
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la 
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un 
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75. 
 * 
 * @autor Barbara Colomer
 */
public class T04Ejercicio27R25 {
  public static void main(String[] args) {

    String sabor = "";
    String nata = "";
    String nombre = "";
    double manzana = 18;
    double fresa = 16;
    double chocoBlanco = 15;
    double chocoNegro = 14;
    double precioNata = 2.5;
    double precioNombre = 2.75;
    double total = 0;

    System.out.println("-----PASTELERIA-----");
    System.out.println("Indique de que sabor desea la tarta:");
    System.out.println("Los sabores disponibles son: manzana, fresa y chocolate");
    sabor = (System.console().readLine()).toLowerCase();
    if (sabor.equals("chocolate")) {
      System.out.println("¿La desea de chocolante: blanco o negro?");
      sabor = System.console().readLine().toLowerCase();
    }
    System.out.println("¿Desea añadir nata: s/n");
    nata = (System.console().readLine()).toLowerCase();
    System.out.println("Desea agregar un nombre escrito: s/n:");
    nombre = (System.console().readLine()).toLowerCase();

    switch (sabor) {
      case "manzana":
        System.out.printf("%-30s %-7.2f€\n", "Tarta de manzana: ", manzana);
        total = manzana;
        break;
      case "fresa":
        System.out.printf("%-30s %-7.2f€\n", "Tarta de fresa: ", fresa);
        total = fresa;
        break;
      case "blanco":
        System.out.printf("%-30s %-7.2f€\n", "Tarta de chocolate blanco: ", chocoBlanco);
        total = chocoBlanco;
        break;
      case "negro":
        System.out.printf("%-30s %-7.2f€\n", "Tarta de chocolate negro: ", chocoNegro);
        total = chocoNegro;
        break;
      default:
        System.out.println("El sabor introducido no esta actualmente disponible");
        break;
    }
    if (nata.equals("s")) {
      System.out.printf("%-31s %-6.2f€\n", "Con nata: ", precioNata);
      total = total + precioNata;
    }
    if (nombre.equals("s")) {
      System.out.printf("%-31s %-6.2f€\n", "Con Nombre: ", precioNombre);
      total = total + precioNombre;
    }
    System.out.printf("%-30s %-7.2f€\n", "Total: ", total);
  }
}
