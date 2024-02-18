package Vehiculo;

public class AppVehiculo {
    public static void main(String[] args) {

        int opcion = 0;
        int kmBici = 0;
        Bicicleta bici = new Bicicleta();
        Coche auto = new Coche();

        do {
            menu();
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos kilometros?");
                    kmBici = Integer.parseInt(System.console().readLine());
                    bici.setKilometrosRecorridos(bici.kilometrosRecorridos + kmBici);
                    bici.setKilometrosTotales(bici.kilometrosTotales + kmBici);
                    System.out.printf("La bici lleva recorridos %d kilometros", bici.getKilometrosRecorridos());
                    System.out.printf("todos los vehiculos llevan recorridos %d kilometros",
                            bici.getKilometrosTotales());

                    break;

                default:
                    break;
            }
        } while (opcion != 8);
    }

    /**
     * Imprime el menu de opciones
     */
    public static void menu() {
        System.out.println("VEHÍCULOS\n=========\n");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta ");
        System.out.println("3. Anda con el coche ");
        System.out.println("4. Quema rueda con el coche ");
        System.out.println("5. Ver kilometraje de la bicicleta ");
        System.out.println("6. Ver kilometraje del coche ");
        System.out.println("7. Ver kilometraje total ");
        System.out.println("8. Salir ");
        System.out.println("Elige una opción (1-8): ");
    }
}
