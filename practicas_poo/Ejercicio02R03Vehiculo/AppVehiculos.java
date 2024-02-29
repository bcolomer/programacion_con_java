package Ejercicio02R03Vehiculo;

public class AppVehiculos {
    public static void main(String[] args) {
        int opcion;
        Bicicleta bici1 = new Bicicleta();
        Coche auto1 = new Coche();

        do {
            menu();
            System.out.println("Elije opcion:");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    System.out.println("cuantos kilometros?");
                    bici1.setKilometrosBicicleta(Integer.parseInt(System.console().readLine()));
                    bici1.anda();

                    System.out.println();
                    break;
                case 2:
                    bici1.hacerCaballito();
                    System.out.println();

                    break;
                case 3:
                    System.out.println("cuantos kilometros?");
                    auto1.setKilometroCoche(Integer.parseInt(System.console().readLine()));
                    auto1.anda();
                    System.out.println();

                    break;
                case 4:
                    auto1.quemaRueda();
                    System.out.println();

                    break;
                case 5:

                    System.out.println("Ya he pedaleado " + bici1.kilometrosBicicleta + " km.");
                    System.out.println();

                    break;
                case 6:
                    System.out.println("Ya he recorrido " + auto1.kilometrosCoche + " km.");
                    System.out.println();

                    break;
                case 7:
                    System.out.println("Todos los vehiculos han recorrido " + Vehiculo.kilometrosTotales + " Km.");
                    System.out.println();

                    break;

            }

        } while (opcion < 8);
    }

    public static void menu() {
        System.out.println("1- Anda con la bicicleta  ");
        System.out.println("2- Haz caballito con la bicicleta  ");
        System.out.println("3- Anda con el coche  ");
        System.out.println("4- Quema rueda con el coche  ");
        System.out.println("5- Ver kilometraje de la bicicleta  ");
        System.out.println("6- Ver kilometraje del coche  ");
        System.out.println("7- Ver kilometraje total  ");
        System.out.println("8- Salir  ");
    }
}
