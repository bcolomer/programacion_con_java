
/*
 * Escribe un programa en Java que simule una calculadora de factura para el restaurante
 *  Aragog's Lair. El programa presenta un menú principal con opciones para Comidas, 
 * Bebidas y Postres. Cada opción lleva a un submenú específico con elementos y precios
 *  asociados. El usuario puede seleccionar la opción apropiada en cada submenú, y al 
 * final, el programa calcula la factura total. La aplicación deberá preguntar si existe
 *  alguna promoción en curso, en cuyo caso se aplicarán un tanto por ciento de descuento
 *  que tendrá que solicitarse por pantalla. Deberán gestionarse convenientemente 
 * las posibles excepciones y errores que puedan producirse debido a la entrada del usuario.
 * AYUDA: los códigos hexadecimales necesarios para mostrar el carácter unicode
 *  araña son: D83D y DD77. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int opcionGeneral = 0;
    // las comidas las declaro como double para que si en el futuro cambian el
    // precio puedan ser con decimales.
    double nimbus = 7;
    double mandragora = 9;
    double mandragoraExtra = 9.55;
    double reliquias = 12;
    double potion = 2;
    double glitz = 2;
    double flame = 2.5;
    double spritz = 4;
    double brownies = 5;
    double puffs = 3;
    double flies = 3;
    double treats = 3.5;
    int opcionComidaBebidaPostre = 0;
    int unidades = 0;
    String promo = "";
    double descuento = 0;
    double precioUnidad = 0;
    double subtotal = 0;
    double total = 0;

    System.out.printf("\033[1mARAGOG'S LAIR: PUNTO DE VENTA \uDD77 \033[0m \n"); // he modificado agregando negrita
    System.out.println("================================");
    System.out.print("1. Comida \n2. Bebidas \n3. Postres\n");
    System.out.print("Ingrese una opcion para su pedido:");
    try {
      opcionGeneral = s.nextInt();
      switch (opcionGeneral) {
        case 1:
          System.out.println("Comidas\n----------------------------------\n");
          System.out.printf("%-50s (%.2f)€\n", "1. Burguer Nimbus 2000", nimbus);
          System.out.printf("%-50s (%.2f)€\n", "2. Burguer de Mandrágora", mandragora);
          System.out.printf("%-50s (%.2f)€\n", "3. Burguer de Mandrágora extra chillidos", mandragoraExtra);
          System.out.printf("%-50s (%.2f)€\n", "4. Burguer Reliquias de la muerte", reliquias);
          System.out.print("Elige opcion: ");
          opcionComidaBebidaPostre = s.nextInt();

          switch (opcionComidaBebidaPostre) {
            case 1:
              precioUnidad = nimbus;
              break;
            case 2:
              precioUnidad = mandragora;
              break;
            case 3:
              precioUnidad = mandragoraExtra;
              break;
            case 4:
              precioUnidad = reliquias;
              break;
            default:
              System.out.println("no se ha intruducido una opcion válida");
              break;
          }
          break;
        case 2:
          System.out.println("Bebidas\n----------------------------------\n");
          System.out.printf("%-50s (%.2f)€\n", "1. Potion Punch", potion);
          System.out.printf("%-50s (%.2f)€\n", "2. Gillywater Glitz", glitz);
          System.out.printf("%-50s (%.2f)€\n", "3. Phoenix Flame Float", flame);
          System.out.printf("%-50s (%.2f)€\n", "4. Veritaserum Spritz", spritz);
          System.out.print("Elige opcion: ");
          opcionComidaBebidaPostre = s.nextInt();

          switch (opcionComidaBebidaPostre) {
            case 1:
              precioUnidad = potion;
              break;
            case 2:
              precioUnidad = glitz;
              break;
            case 3:
              precioUnidad = flame;
              break;
            case 4:
              precioUnidad = spritz;
              break;
            default:
              System.out.println("no se ha intruducido una opcion válida");
              break;
          }
          break;
        case 3:
          System.out.println("Postres\n----------------------------------\n");
          System.out.printf("%-50s (%.2f)€\n", "1. Snitch Brownie", brownies);
          System.out.printf("%-50s (%.2f)€\n", "2. Pumpking Puffs", puffs);
          System.out.printf("%-50s (%.2f)€\n", "3. Fudge Flies", flies);
          System.out.printf("%-50s (%.2f)€\n", "4. Owl Treats", treats);
          System.out.print("Elige opcion: ");
          opcionComidaBebidaPostre = s.nextInt();
          switch (opcionComidaBebidaPostre) {
            case 1:
              precioUnidad = brownies;
              break;
            case 2:
              precioUnidad = puffs;
              break;
            case 3:
              precioUnidad = flies;
              break;
            case 4:
              precioUnidad = treats;
              break;
            default:
              System.out.println("no se ha intruducido una opcion válida");
              break;
          }
          break;

        default:
          System.out.println("error: No ha introducido una opcion válida");
          break;
      }

      System.out.print("Introduce cantidad de unidades: ");
      unidades = s.nextInt();
      System.out.println("Hay promocion? (s/n)");
      promo = System.console().readLine().toLowerCase();
      if ((promo.equals("s")) || (promo.equals("si"))) {
        System.out.println("Introduce el descuento a aplicar: ");
        descuento = s.nextDouble();
      } else {
        descuento = 0;
      }
      subtotal = precioUnidad * (double) unidades;

      System.out.println("Resumen precio:");
      System.out.println("-------------------------------");
      System.out.printf("%-50s %.2f €\n", "Precio por unidad", precioUnidad);
      System.out.printf("%-50s %d \n", "Unidades", unidades);
      System.out.printf("%-50s %.2f €\n", "Subtotal", subtotal);
      System.out.printf("%-50s %.0f %%\n", "Descuento(%)", descuento);
      descuento = (descuento * subtotal) / 100;
      total = subtotal - descuento;
      System.out.printf("%-50s %.2f €\n", "TOTAL", total);

    } catch (Exception e) {
      System.out.println("ERROR: no ha introducido opciones validas");
    }
    s.close();
  }
/**
 * _ No hacen falta tantas variables.
 * _ No se gestionan correctamente los errores de introducción de datos. Cuando
 * introduces un valor erróneo la aplicación continúa preguntando el número de
 * unidades.
 * _ La respuesta a la promoción debía ser únicamente 's' o 'n'.
 * _ No se muestra el caracter UNICODE de la araña.
 */
}
