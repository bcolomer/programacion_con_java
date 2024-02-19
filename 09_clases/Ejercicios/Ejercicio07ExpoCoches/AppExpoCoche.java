/*
 * El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir 
 * 
 * @autor Barbara Colomer
 */

package Ejercicio07ExpoCoches;

public class AppExpoCoche {
    public static void main(String[] args) {

        int opcionMenu;
        int opcionZonas;
        int cantidad;
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        menu();
        do {
            opcionMenu = Integer.parseInt(System.console().readLine());
            switch (opcionMenu) {
                case 1:
                    System.out.println(principal.getEntradasPorVender() + compraVenta.getEntradasPorVender()
                            + vip.getEntradasPorVender());
                    break;
                case 2:
                    menuZonas();
                    System.out.println("Para que zona desea las entradas?");
                    do {
                        opcionZonas = Integer.parseInt(System.console().readLine());
                        switch (opcionZonas) {
                            case 1:
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = Integer.parseInt(System.console().readLine());
                                principal.vender(cantidad);
                                break;
                            case 2:
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = Integer.parseInt(System.console().readLine());
                                compraVenta.vender(cantidad);
                                break;
                            case 3:
                                System.out.println("Cuantas entradas quiere?");
                                cantidad = Integer.parseInt(System.console().readLine());
                                vip.vender(cantidad);
                                break;
                            default:
                                System.out.println("Error, no es una opcion valida.");
                                break;
                        }

                    } while (opcionZonas < 3);

                    break;
                default:
                    System.out.println("Error, no es una opcion valida");
                    break;

            }
            menu();

        } while (opcionMenu != 3);

    }

    /**
     * muestra menu
     */
    public static void menu() {
        System.out.println(" EXPO COCHES CAMPANILLAS");
        System.out.println("=========================");
        System.out.println("1. Mostrar número de entradas libres ");
        System.out.println("2. Vender entradas");
        System.out.println("3. Salir ");

    }

    public static void menuZonas() {
        System.out.println(" Zonas a elegir:");
        System.out.println("1. Sala Principal");
        System.out.println("2. CompraVenta");
        System.out.println("3. V.I.P. ");
    }
}
