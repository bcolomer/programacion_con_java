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
    String chocolate = "";
    String nata = "";
    String nombre = "";

    System.out.println("-----PASTELERIA-----");
    System.out.println("Indique de que sabor desea la tarta:");
    System.out.println("Los sabores disponibles son: manzana, fresa y chocolate");
    sabor = (System.console().readLine()).toLowerCase();
    if (sabor.equals("chocolate")) {
      System.out.println("¿La desea de chocolante blanco o negro?");
      chocolate = System.console().readLine().toLowerCase();
    }
    System.out.println("¿Desea añadir nata: s/n");
    nata = (System.console().readLine()).toLowerCase();
    System.out.println("Desea agregar un nombre escrito: s/n:");
    nombre = (System.console().readLine()).toLowerCase();

  }

}
