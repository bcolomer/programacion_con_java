package EjercicioArray04R24Gestisimal;

public class AppGestisimal {
    public static void main(String[] args) {
        int opcionMenu;

        do {
            menu();
            opcionMenu = Integer.parseInt(System.console().readLine());
            switch (opcionMenu) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("La opcion seleccionada no es válida");
                    break;
            }
        } while (opcionMenu != 7);

    }

    public static void menu() {
        System.out.println("GESTISIMAL\n===================");
        System.out.println("1. Listado ");
        System.out.println("2. Alta ");
        System.out.println("3. Baja ");
        System.out.println("4. Modificación ");
        System.out.println("5. Entrada de mercancía ");
        System.out.println("6. Salida de mercancía ");
        System.out.println("7. Salir ");

    }
}
