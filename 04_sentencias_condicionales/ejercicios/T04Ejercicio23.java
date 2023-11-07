
/*
 * Escribe un programa que calcule el precio final de un producto según su base imponible 
 * (precio antes de impuestos), el tipo de IVA aplicado (general, reducido o superreducido) 
 * y el código promocional. Los tipos de IVA general, reducido y superreducido 
 * son del 21%, 10% y 4% respectivamente. Los códigos promocionales pueden ser 
 * nopro, mitad, meno5 o 5porc que significan respectivamente que no se aplica promoción,
 * el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. 
 * El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
    double precioBase = 0;
    String iva;
    String ivaTexto;
    String promo;
    double general = 0.21;
    double reducido = 0.1;
    double superreducido = 0.04;
    double ivaImporte;
    double precioFinal;
    double mitad = 0.5;
    int menos5 = -5;
    double porc5 = 0.05;

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el la base imponible");
    precioBase = s.nextDouble();

    System.out.println("Introduzca el tipo de IVA (general, reducido, superreducido)");
    iva = System.console().readLine();
    System.out.println("Introduzca el código promocional (nopro, mitad, menos5, 5porc)");
    promo = System.console().readLine();
    s.close();
    switch (iva) {
      case "general", "General", "GENERAL":
        ivaImporte = precioBase * general;
        ivaTexto = "(21%)";
        break;
      case "reducido", "Reducido", "REDUCIDO":
        ivaImporte = precioBase * reducido;
        ivaTexto = "(10%)";
        break;
      case "superreducido", "Superreducido", "SuperReducido", "SUPERREDUCIDO":
        ivaImporte = precioBase * superreducido;
        ivaTexto = "(4%)";
        break;
      default:
        System.out.println("El tipo seleccionado de iva no es correcto");
        break;
    }
    switch (promo) {
      case "mitad", "Mitad", "MITAD":
        precioFinal = (precioBase + ivaImporte) * mitad;
        break;

      default:
        break;
    }

    System.out.println("------------TICKET------------");
    System.out.printf("%-20s %10.2f", "Base imponible", precioBase);

  }

}
