
/*
 * La franquicia de tiendas de ropa VisteT nos ha pedido que realicemos un programa para 
 * su terminal de punto de venta. El programa deberá solicitar el nombre del 
 * artículo a vender, su precio base en euros (sin IVA) y la cantidad de unidades
 *  que se desean. Al estar en un período de rebajas, se aplicará un descuento en 
 * función del número de unidades vendidas. 
 * Unidades Descuento  de 1 a 3 5%-de 4 a 10 10%-  más de 10 15%
 * Con estos datos, el programa mostrará por pantalla el total de la compra, 
 * aplicando el 21% de IVA, excepto si estamos en fiestas, que será de un 16%,
 *  lo cual tendremos también que preguntarlo en el punto de venta. Toda la información
 *  deberá presentarse en pantalla como ves en el siguiente ejemplo:
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio30R28 {
    public static void main(String[] args) {
        String NombreArticulo = "";
        double precioBase = 0;
        int cantidad = 0;
        double descuento = 0;
        String descuentoTexto = "";
        String iva = "";
        double ivaPorcentaje = 0;
        double subtotal = 0;
        double subtotalDescuento = 0;
        String ivaTexto = "";
        double total = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("----Tienda de ropa----");
        System.out.print("Introduzca el nombre del articulo: ");
        NombreArticulo = System.console().readLine();
        System.out.print("Introduzca la cantidad: ");
        cantidad = s.nextInt();
        if (cantidad <= 0) {
            System.out.println("La cantidad ingresada no es correcta.");
        } else {
            System.out.print("Introduzca el precio base: ");
            precioBase = s.nextDouble();
            System.out.print("Cual es el impuesto a imponer: general o fiestas:  ");
            iva = System.console().readLine();
            s.close();
            if (cantidad <= 3) {
                descuento = -0.05;
                descuentoTexto = " (5%)";
            } else if ((cantidad >= 4) && (cantidad <= 10)) {
                descuento = -0.1;
                descuentoTexto = " (10%)";
            } else {
                descuento = -0.15;
                descuentoTexto = " (15%)";
            }
            if (iva.equals("general")) {
                ivaPorcentaje = 0.21;
                ivaTexto = " (21%)";
            } else if (iva.equals("fiestas")) {
                ivaPorcentaje = 0.16;
                ivaTexto = " (16%)";
            }
            subtotal = precioBase * cantidad;
            subtotalDescuento = subtotal + (subtotal * descuento);
            total = subtotalDescuento + (subtotalDescuento * ivaPorcentaje);
            System.out.println("===================================================================");
            System.out.println("                              FACTURA                              ");
            System.out.println("===================================================================");
            System.out.printf("%-25s %41s\n", "Artículo: ", NombreArticulo);
            System.out.printf("%-25s %33.2f€/unidad\n", "Precio: ", precioBase);
            System.out.printf("%-25s %41d\n", "Cantidad: ", cantidad);
            System.out.printf("%-25s %40.2f€\n", ("Descuento:" + descuentoTexto), (subtotal * descuento));
            System.out.printf("%-25s %40.2f€\n", "Subtotal con descuento: ", subtotalDescuento);
            System.out.printf("%-25s %40.2f€\n", ("Iva" + ivaTexto), (subtotalDescuento * ivaPorcentaje));
            System.out.println("===================================================================");
            System.out.printf("\033[1;48;5;247m%-25s %40.2f€ \033[0m]\n", "TOTAL: ", total);
            // no consigo poner en negrita las letras del texto que tiene color de fondo.
        }
    }
}
