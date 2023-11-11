
/*
 * Realiza un programa que calcule el precio de unas entradas de cine
 * en función del número de personas y del día de la semana.
 * El precio base de una entrada son 8 euros. El miércoles (día del espectador),
 * el precio base es de 5 euros. Los jueves son el día de la pareja, 
 * por lo que la entrada para dos cuesta 11 euros. Con la tarjeta CineCampa 
 * se obtiene un 10% de descuento. Si un jueves, un grupo de 6 personas 
 * compran entradas, el precio total sería de 33 euros ya que son 3 parejas; 
 * pero si es un grupo de 7, pagarán 3 entradas de pareja más 1 individual 
 * que son 41 euros (33 + 8). 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T04Ejercicio26 {
  public static void main(String[] args) {

    int entradaPareja = 11;
    double descuentoTarjeta = 0;
    double descuentoTarjetaPareja = 0;
    int entradas = 0;
    String diaSemana = "";
    String tieneTarjeta = "";
    int precio = 8;
    int cantParejas = 0;
    int cantIndividual = 0;

    Scanner s = new Scanner(System.in);
    System.out.println("Venta de entradas cine Campa");
    System.out.println("Cantidad de entradas: ");
    entradas = s.nextInt();
    System.out.println("Dia de la semana al que se desea asistir:");
    System.out.println("-Indique un dia de la semana sin tildes-");
    diaSemana = System.console().readLine();
    diaSemana = diaSemana.toLowerCase();
    System.out.println("Tiene tarjeta CineCampa? (s/n):");
    tieneTarjeta = System.console().readLine();
    tieneTarjeta = tieneTarjeta.toLowerCase();
    s.close();

    cantParejas = entradas / 2;
    cantIndividual = entradas % 2;
    double total = precio * entradas;
    double totalPareja = (cantParejas * entradaPareja) + (cantIndividual * precio);

    switch (tieneTarjeta) {
      case "s":
        descuentoTarjeta = total * 0.1;
        descuentoTarjetaPareja = totalPareja * 0.1;
        break;
      case "n":
        descuentoTarjeta = 0;
        break;
      default:
        System.out.println("no ha introducido valores correctos para saber si tiene o no tarjeta de CineCampa");
        break;
    }
    System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
    if (diaSemana.equals("jueves")) {
      System.out.printf("%-40s %10d\n", "Entradas de pareja:", cantParejas);
      System.out.printf("%-40s %10.2f €\n", "Precio de pareja:", ((double) entradaPareja));
      System.out.printf("%-40s %10d\n", "Entradas individuales:", cantIndividual);
      System.out.printf("%-40s %10.2f €\n", "Precio por entrada individual: ", ((double) precio));
      System.out.printf("%-40s %10.2f €\n", "Total: ", totalPareja);
      System.out.printf("%-40s %10.2f €\n", "Descuento", descuentoTarjetaPareja);
      System.out.printf("%-40s %10.2f €\n", "Total a pagar: ", (totalPareja - descuentoTarjetaPareja));

    } else {
      if (diaSemana.equals("miercoles")) {
        precio = 5;
      } else {
        precio = 8;
      }
      System.out.printf("%-40s %10d\n", "Entradas Individuales:", entradas);
      System.out.printf("%-40s %10.2f €\n", "Precio por entrada individual: ", ((double) precio));
      System.out.printf("%-40s %10.2f €\n", "Total: ", total);
      System.out.printf("%-40s %10.2f €\n", "Descuento", descuentoTarjeta);
      System.out.printf("%-40s %10.2f €\n", "Total a pagar: ", (total - descuentoTarjeta));

    }

  }
}