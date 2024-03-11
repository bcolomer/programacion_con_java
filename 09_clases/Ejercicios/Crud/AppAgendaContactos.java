package Crud;

public class AppAgendaContactos {
    public static void main(String[] args) {
        Contacto listado[] = new Contacto[5];
        int opcion;
        listado[0] = new Contacto("barbara", "colomer", 45);
        int indice = 1;

        menu();
        System.out.println("ingrese opcion:");
        opcion = Integer.parseInt(System.console().readLine());
        switch (opcion) {
            case 1:
                listado[indice] = new Contacto();
                System.out.println("introduzca el nombre");
                listado[indice].setNombre(System.console().readLine());
                System.out.println("Introduzca apellido");
                listado[indice].setApellido(System.console().readLine());
                indice++;
                break;
            case 2:
                for (int i = 0; i < listado.length; i++) {
                    System.out.println(listado[i]);

                }
                break;

            default:
                break;
        }
    }

    public static void menu() {
        System.out.println("Gestion de alumnos");
        System.out.println("==================");
        System.out.println("1- Ingresar alumno");
        System.out.println("2- Listar alumnos");
        System.out.println("3- Editar alumno");
        System.out.println("4- Borrar alumno");
        System.out.println(" Hacer algo mas con alumnos, aun no definido");

    }

}
