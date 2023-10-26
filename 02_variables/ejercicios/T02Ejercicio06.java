/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable. *
 * 
 * @autor Barbara Colomer
 */
public class T02Ejercicio06 {
  public static void main(String[] args) {
    double precioSinIva = 25.69;
    double porcentajeIva = 21;
    double eurosIva = (precioSinIva * porcentajeIva) / 100;
    double precioFinal = precioSinIva + eurosIva;

    System.out.println("El precio final de su factura de " +
        precioSinIva + "€ es de " + precioFinal + "€");
    System.out.println("La base imponible correspondiente al "
        + porcentajeIva + "% es de " + eurosIva + "€.");
  }
}
