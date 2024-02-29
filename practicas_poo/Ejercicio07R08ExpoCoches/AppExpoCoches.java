package Ejercicio07R08ExpoCoches;

public class AppExpoCoches {
    public static void main(String[] args) {
        int opcionMenu;
        int opcionZona;
        int cantidad;
        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        System.out.println("EXPOCOCHES CAMPANILLAS\n====================");

        do {
            menu();
            System.out.print("Elija opcion:");
            opcionMenu = Integer.parseInt(System.console().readLine());
            switch (opcionMenu) {
                case 1:
                    System.out.println("En la zona Principal hay " + principal.getEntradasPorVender());
                    System.out.println("En la zona Compra-Venta hay " + compraVenta.getEntradasPorVender());
                    System.out.println("En la zona V.I.P. hay " + vip.getEntradasPorVender());
                    break;
                case 2:
                    menuZonas();
                    System.out.println("Para que zona las quiere:");
                    opcionZona = Integer.parseInt(System.console().readLine());

                    System.out.println("Cuantas entradas quiere?");
                    cantidad = Integer.parseInt(System.console().readLine());
                    switch (opcionZona) {
                        case 1:
                            principal.vender(cantidad);

                            break;
                        case 2:
                            compraVenta.vender(cantidad);

                            break;
                        case 3:
                            vip.vender(cantidad);

                            break;

                    }
                    break;

                default:
                    System.out.println("Gracias por visitarnos");
                    break;
            }

        } while (opcionMenu != 3);
    }

    public static void menu() {
        System.out.println("1. Mostrar número de entradas libres ");
        System.out.println("2. Vender entradas ");
        System.out.println("3. Salir ");

    }

    public static void menuZonas() {
        System.out.println("1. Sala Principal");
        System.out.println("2. Sala Compra-Venta");
        System.out.println("3. Sala V.I.P.");
    }
}
