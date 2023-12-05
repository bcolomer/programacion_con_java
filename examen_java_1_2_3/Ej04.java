
/*
 * La franquicia de tiendas de ropa VísteT nos ha pedido que realicemos un programa 
 * para su terminal de punto de venta. El programa deberá solicitar el nombre 
 * del artículo a vender, su precio base en euros (sin IVA) y la cantidad de 
 * unidades que se desean. Al estar en periodo de rebajas, se aplica
 *  un descuento del 15 % sobre el precio base. Con estos datos, el programa
 *  mostrará por pantalla el total de la compra, aplicándole el 21% de IVA. 
 * Toda la información deberá presentarse en pantalla tal y como ves en el ejemplo. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ej04 {
  public static void main(String[] args) {
    double precioBase = 0;
    String articulo = "";
    int cantidad = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el nombre del artículo:");
    articulo = System.console().readLine();
    System.out.println("Introduzca el precio base por unidad");
    precioBase = s.nextDouble();
    System.out.println("Introduzca la cantidad de articulos");
    cantidad = s.nextInt();
    s.close();
    double totalBase = precioBase * cantidad;
    double descuento = totalBase * 0.15;
    double totalConDesc = totalBase - descuento;
    double totalFinal = totalConDesc * 1.21;
    System.out.println("Factura");
    System.out.println("=====================================================");
    System.out.printf("%-25s %25s \n", "Artículo", articulo);
    System.out.println("Precio                                 " + precioBase + "€/unidad");
    System.out.printf("%-25s %25s\n", "Cantidad", cantidad);
    System.out.printf("%-25s %25.2f %s\n", "Subtotal", (precioBase * cantidad), "€");
    System.out.printf("%-25s %25.2f %s\n", "Descuento(15%)", descuento, "€");
    System.out.printf("%-25s %25.2f %s\n", "Subtotal con descuento ", totalConDesc, "€");
    System.out.printf("%-25s %25.2f %s\n", "IVA(21%) ", (totalConDesc * 0.21), "€");
    System.out.println("=====================================================");
    System.out.printf("\033[1;48;5;7m %-25s %25.2f %s \033[0m \n", "TOTAL ", totalFinal, "€");
  }
}

/**
 * La franquicia de tiendas de ropa VísteT nos ha pedido que realicemos un
 * programa para su terminal de punto de venta.
 * El programa deberá solicitar el nombre del artículo a vender, su precio base
 * en euros (sin IVA) y la cantidad de unidades
 * que se desean.
 * Al estar en periodo de rebajas, se aplica un descuento del 15 % sobre el
 * precio base.
 * Con estos datos, el programa mostrará por pantalla el total de la compra,
 * aplicándole el 21% de IVA.
 * Toda la información deberá presentarse en pantalla tal y como ves en el
 * ejemplo.
 * 
 * @author Sergio Sánchez
 */

/*
 * import java.util.Scanner;
 * public class Ejercicio5 {
 * 
 * public static void main(String[] args) {
 * 
 * Scanner sc = new Scanner(System.in);
 * String nombre;
 * double precioBase;
 * int cantidad;
 * double subtotal;
 * double descuento;
 * double iva;
 * 
 * System.out.print("Nombre del artículo: ");
 * nombre = sc.nextLine();
 * 
 * System.out.print("Precio base: ");
 * precioBase = sc.nextDouble();
 * 
 * System.out.print("Unidades: ");
 * cantidad = sc.nextInt();
 * sc.close();
 * 
 * subtotal = precioBase * cantidad;
 * descuento = subtotal * 0.15;
 * iva = (subtotal - descuento) * 0.21;
 * 
 * System.out.println("Factura");
 * System.out.println("===============================================");
 * 
 * System.out.printf("%-25s %20s\n", "Artículo", nombre);
 * System.out.printf("%-25s %11.2f €/unidad \n", "Precio", precioBase);
 * System.out.printf("%-25s %20d \n", "Cantidad", cantidad);
 * System.out.printf("%-25s %18.2f € \n", "Subtotal", subtotal);
 * System.out.printf("%-25s %+18.2f € \n", "Descuento (15%)", -descuento);
 * System.out.printf("%-25s %18.2f € \n", "Subtotal con descuento", (subtotal -
 * descuento));
 * System.out.printf("%-25s %+18.2f € \n", "IVA (21%)", iva);
 * 
 * System.out.println("===============================================");
 * System.out.printf("\033[1;48;5;251m%-25s %18.2f € \n", "TOTAL", (subtotal -
 * descuento + iva));
 * System.out.print("\033[0m");
 * }
 * 
 * }
 */