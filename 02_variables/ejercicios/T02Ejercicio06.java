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
    int porcentajeIva = 21;
    double eurosIva = (precioSinIva * porcentajeIva) / 100;
    double precioFinal = precioSinIva + eurosIva;

    System.out.printf("El precio final de su factura de " +
        precioSinIva + "€ es de %.2f€\n", precioFinal);

    System.out.printf("La base imponible correspondiente al "
        + porcentajeIva + "%% es de %.2f€\n", eurosIva);

    /*
     * Solucion profesor: para numeros de 8 cifras contando la coma, para reservar
     * espacio
     * double baseImponible = 22.75;
     * System.out.printf("Base imponible %8.2f\n", base imponible);
     * System.out.printf("total %8.2f\n", baseimponible + (baseimponible*0.21);
     */
  }
}
