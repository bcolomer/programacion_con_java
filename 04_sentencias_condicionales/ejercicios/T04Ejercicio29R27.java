/*
 * Realiza un programa que calcule el precio de un desayuno. El programa preguntará 
 * primero qué ha tomado el usuario de comer: palmera, donut o pitufo. 
 * La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el programa 
 * debe preguntar además si era con aceite o con tortilla; el primero vale 1’20 € 
 * y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 
 * respectivamente. 
 * 
 * @autor Barbara Colomer
 */
public class T04Ejercicio29R27 {
  public static void main(String[] args) {
    String comer = "";
    String beber = "";
    double precioComer = 0;
    double precioBeber = 0;
    double sumaTicket = 0;

    System.out.println("---Cafeteria ALAN TURING---");
    System.out.print("¿Que ha pedido para comer? palmera, donut o pitufo: ");
    comer = System.console().readLine().toLowerCase();
    if (comer.equals("pitufo")) {
      System.out.print("lo ha pedido con aceite o tortilla: ");
      comer = System.console().readLine();
    }
    System.out.print("¿Que ha pedido de bebida? zumo o cafe: ");
    beber = System.console().readLine().toLowerCase();
    if ((comer.equals("palmera")) || (comer.equals("donut")) || (comer.equals("tortilla"))
        || (comer.equals("aceite"))) {
      if (comer.equals("palmera")) {
        comer = "Palmera: ";
        precioComer = 1.4;
      } else if (comer.equals("donut")) {
        comer = "Donut: ";
        precioComer = 1;
      } else if (comer.equals("aceite")) {
        comer = "Pitufo con aceite: ";
        precioComer = 1.2;

      } else if (comer.equals("tortilla")) {
        comer = "Pitufo con tortilla: ";
        precioComer = 1.6;
      }
      System.out.printf("%-25s %-6.2f€\n", comer, precioComer);
    } else {
      System.out.println("La comida introducida no es correcta.");
    }
    if ((beber.equals("cafe")) || (beber.equals("zumo"))) {
      if (beber.equals("cafe")) {
        beber = "Café: ";
        precioBeber = 1.2;
      } else if (beber.equals("zumo")) {
        beber = "Zumo: ";
        precioBeber = 1.5;
      }
      System.out.printf("%-25s %-6.2f€\n", beber, precioBeber);

    } else {
      System.out.println("La bebida introducida no es correcta.");
    }
    // System.out.printf("%-25s %-6.2f€\n", comer, precioComer);
    // System.out.printf("%-25s %-6.2f€\n", beber, precioBeber);
    System.out.printf("%-25s %-6.2f€\n", "Total desayuno: ", (precioBeber + precioComer));
    System.out.println("Gracias por su compra!");

  }
}
