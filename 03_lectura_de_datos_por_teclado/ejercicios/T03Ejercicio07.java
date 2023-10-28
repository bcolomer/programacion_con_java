
/*
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible. *
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T03Ejercicio07 {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el importe bruto para obtener el importe final");
    double bruto = s.nextDouble();
    System.out.println("Introduzca el porcentaje de impuestos a sumar");
    double impuestos = s.nextDouble();
    s.close();

    double importeImp = (bruto * impuestos) / 100;
    double total = bruto + importeImp;
    System.out.printf("El importe correspondiente a los impuestos es de %.2f €.\n", importeImp);
    System.out.printf("El total de la factura a abonar es de %.2f €.", total);

  }

}
