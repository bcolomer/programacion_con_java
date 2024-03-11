package EjercicioAgendaDeContactos;

/**
 * Aplicación Agenda de Contactos
 * 
 * @author Antonio José Sánchez
 */
public class AgendaContactos {

    /**
     * @param args
     */
    public static void main(String[] args) {

        int numero;
        int opcion;
        Agenda agenda = new Agenda();

        do {

            menu();
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {

                // CREAR CONTACTO
                case 1:
                    if (agenda.esLlena()) {
                        System.out.println("La agenda está completa. No se admiten más contactos.");
                    } else {
                        nuevoContacto(agenda);
                    }
                    break;

                // EDITAR CONTACTO
                case 2:

                    editarContacto(agenda);
                    break;

                // BUSCAR POR DNI
                case 4:
                    buscarContactoDni(agenda);
                    break;

                // BUSCAR POR NOMBRE
                case 5:
                    buscarContactoNombre(agenda);
                    break;

                // BUSCAR TODOS POR NOMBRE
                case 6:
                    if (agenda.esVacia()) {
                        System.out.println("No hay contactos en la agenda.");
                    } else {
                        buscarContactosTodosNombre(agenda);
                    }
                    break;

                // LISTAR CONTACTOS
                case 7:
                    System.out.println("LISTADO DE CONTACTOS DE LA AGENDA\n=================================");
                    agenda.listar();
                    break;
            }

        } while (opcion != 0);

    }

    /**
     * Muestra el menú de la aplicación
     */
    private static void menu() {

        System.out.println("\n\n");
        System.out.println("0. Salir");
        System.out.println("1. Introducir contacto");
        System.out.println("2. Modificar contacto");
        System.out.println("3. Borrar contacto");
        System.out.println("4. Buscar por DNI");
        System.out.println("5. Buscar por nombre");
        System.out.println("6. Buscar todos por Nombre (by Juanfran && Paco)");
        System.out.println("7. Listar contacto");

        System.out.print("Opcion? ");
    }

    /**
     * Añade un nuevo contacto a la agenda
     * 
     * @param agenda
     */
    private static void nuevoContacto(Agenda agenda) {

        String dni;
        String nombre;
        String apellido;
        Contacto contacto;

        System.out.print("DNI: ");
        dni = System.console().readLine();

        System.out.print("Nombre: ");
        nombre = System.console().readLine();

        System.out.print("Apellido: ");
        apellido = System.console().readLine();

        contacto = new Contacto(dni, nombre, apellido);
        agenda.crear(contacto);

    }

    /**
     * Solicita dni, busca y muestra un contacto
     * 
     * @param agenda
     */
    private static void buscarContactoDni(Agenda agenda) {

        String dni;
        Contacto contacto;

        System.out.print("DNI: ");
        dni = System.console().readLine();

        contacto = agenda.buscarPorDni(dni);

        if (contacto != null) {
            System.out.println(contacto);
        } else {
            System.out.println("No se ha encontrado el contacto.");
        }
    }

    /**
     * Solicitamos la información y la modificamos en
     * el contacto.
     * 
     * @param agenda
     */
    private static void editarContacto(Agenda agenda) {

        int numero;
        int edad;

        String nombre;
        String apellido;
        Contacto contacto;

        System.out.println("Nº del contacto a editar: ");
        numero = Integer.parseInt(System.console().readLine());

        // buscamos el contacto
        contacto = agenda.buscarPorId(numero);

        if (contacto == null) {
            System.out.println("El contacto no existe.");
        } else {

            // mostramos el contacto
            System.out.println(contacto);

            // solicitar datos del contacto
            System.out.print("Nombre: ");
            nombre = System.console().readLine();
            contacto.setNombre(nombre);

            System.out.print("Apellido: ");
            apellido = System.console().readLine();
            contacto.setApellido(apellido);

            System.out.print("edad: ");
            edad = Integer.parseInt(System.console().readLine());
            contacto.setEdad(edad);
        }
    }

    /**
     * Solicita un nombre y busca en la agenda el contacto que
     * coincida con dicho nombre.
     * 
     * @param agenda
     */
    private static void buscarContactoNombre(Agenda agenda) {

        String nombre;
        Contacto contacto;

        System.out.print("Introduce nombre del contacto a buscar: ");
        nombre = System.console().readLine();

        // buscamos el contacto por nombre
        contacto = agenda.buscarPorNombre(nombre);

        // mostramos el contacto o un mensaje de error
        if (contacto == null) {
            System.out.println("El contacto no existe.");
        } else {
            System.out.println(contacto);
        }

        // System.out.println((contacto==null)?"El contacto no existe":contacto);
    }

    private static void buscarContactosTodosNombre(Agenda agenda) {

        String nombre;

        System.out.print("Introduce nombre a buscar: ");
        nombre = System.console().readLine();
        agenda.listarTodosNombre(nombre);

    }

}
