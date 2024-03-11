import clasesDiscos.Coleccion;
import clasesDiscos.Disco;

public class AppDiskCollection {

    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();

        int opcion;

        do {
            menu();
            System.out.print("Introduzca su opcion: ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 0:
                    System.out.print("Cantidad de discos en la coleccion: ");
                    System.out.println(Disco.getCantidadDiscos());
                    break;
                case 1:
                    System.out.println("1. Listado ");

                    coleccion.mostrar();
                    break;
                case 2:
                    System.out.println("2. Nuevo disco ");

                    if (coleccion.estaLleno()) {
                        System.out.println("La coleccion esta llena. No se admiten mas discos");
                    } else {
                        introducirDisco(coleccion);
                    }

                    break;
                case 3:
                    System.out.println("3. Modificar por numero de indice");
                    // modificarDisco(coleccion);
                    editarDisco(coleccion);
                    break;
                case 4:
                    System.out.println("4. Borrar ");
                    borrarDisco(coleccion);
                    break;
                case 6:
                    System.out.println("6. Buscar disco por titulo ");
                    buscarDiscoTitulo(coleccion);

                    break;
                case 7:
                    System.out.println("7. buscar todos por duracion ");
                    if (coleccion.estaVacia()) {
                        System.out.println("No hay discos en la coleccion");

                    } else {
                        buscarDuracion(coleccion);
                    }
                    break;
                case 8:
                    System.out.println("8. buscar por codigo ");
                    buscarPorCodigo(coleccion);

                    break;
                case 5:
                    System.out.println("Gracias por utilizar nuestra App. Que tenga una vida llena de buena música");

                    break;
                default:
                    System.out.println("Error! La opcion indicada no existe");
                    break;

            }

            if (opcion == 5) {
            }
        } while (opcion != 5);

    }

    public static void menu() {
        System.out.println("COLECCION DE DISCOS\n===================");
        System.out.println("0. Mostrar cantidad de discos totales añadidos a la colección");
        System.out.println("1. Listado ");
        System.out.println("2. Nuevo disco ");
        System.out.println("3. Modificar ");
        System.out.println("4. Borrar ");
        System.out.println("6. Buscar disco por titulo ");
        System.out.println("7. buscar todos por duracion ");
        System.out.println("8. buscar por codigo ");

        System.out.println("5. Salir ");
    }

    public static void introducirDisco(Coleccion coleccion) {
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;
        Disco disco;

        System.out.println("Introduzca los datos del disco");

        System.out.print("Introduzca codigo: ");
        codigo = System.console().readLine();

        System.out.print("Introduzca autor: ");
        autor = System.console().readLine();

        System.out.print("Introduzca titulo: ");
        titulo = System.console().readLine();

        System.out.print("Introduzca genero: ");
        genero = System.console().readLine();

        System.out.print("Introduzca duracion: ");
        duracion = Integer.parseInt(System.console().readLine());

        disco = new Disco(codigo, autor, titulo, genero, duracion);
        coleccion.crear(disco);
    }

    public static void buscarPorCodigo(Coleccion coleccion) {
        String codigoDisco;
        Disco disco;
        System.out.println("Ingrese el codigo");
        codigoDisco = System.console().readLine();
        disco = coleccion.buscarPorCodigo(codigoDisco);
        if (disco != null) {
            System.out.println(disco);

        } else {
            System.out.println("no se ha encontrado el contacto");
        }
    }

    public static void editarDisco(Coleccion coleccion) {
        int numero;
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;

        System.out.println("Numero de disco a modificar");
        numero = Integer.parseInt(System.console().readLine());
        if ((numero < 1) || (numero > coleccion.total())) {
            System.out.println("El disco esta fuera de los parametros de los discos ingresados");
        } else {

            System.out.println(coleccion.getListado()[numero - 1]);

            System.out.println("Introduzca los datos de actualizacion del disco");

            System.out.print("Introduzca codigo: ");
            codigo = System.console().readLine();
            coleccion.getListado()[numero - 1].setCodigo(codigo);

            System.out.print("Introduzca autor: ");
            autor = System.console().readLine();
            coleccion.getListado()[numero - 1].setAutor(autor);

            System.out.print("Introduzca titulo: ");
            titulo = System.console().readLine();
            coleccion.getListado()[numero - 1].setTitulo(titulo);

            System.out.print("Introduzca genero: ");
            genero = System.console().readLine();
            coleccion.getListado()[numero - 1].setGenero(genero);

            System.out.print("Introduzca duracion: ");
            duracion = Integer.parseInt(System.console().readLine());
            coleccion.getListado()[numero - 1].setDuracion(duracion);
        }
    }

    public static void modificarDisco(Coleccion coleccion) {
        int numero;
        Disco disco;
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;

        System.out.println("Numero de disco a modificar");
        numero = Integer.parseInt(System.console().readLine());

        disco = coleccion.buscarPorId(numero);

        if (disco == null) {
            System.out.println("El disco no existe");
        } else {

            System.out.println(disco);

            System.out.println("Introduzca los datos de actualizacion del disco");

            System.out.print("Introduzca codigo: ");
            codigo = System.console().readLine();
            disco.setCodigo(codigo);

            System.out.print("Introduzca autor: ");
            autor = System.console().readLine();
            disco.setAutor(autor);

            System.out.print("Introduzca titulo: ");
            titulo = System.console().readLine();
            disco.setTitulo(titulo);

            System.out.print("Introduzca genero: ");
            genero = System.console().readLine();
            disco.setGenero(genero);

            System.out.print("Introduzca duracion: ");
            duracion = Integer.parseInt(System.console().readLine());
            disco.setDuracion(duracion);

        }
    }

    public static void buscarDiscoTitulo(Coleccion coleccion) {

        String titulo;
        Disco disco;
        System.out.println("Ingrese el nombre del titulo a buscar");
        titulo = System.console().readLine();
        disco = coleccion.buscarDiscoTitulo(titulo);

        if (coleccion.buscarDiscoTitulo(titulo) == null) {
            System.out.println("El disco no existe");
        } else {
            System.out.println(disco);
        }

    }

    public static void buscarDuracion(Coleccion coleccion) {

        int duracion;
        // Disco disco;
        System.out.println("Ingrese la duracion a buscar");
        duracion = Integer.parseInt(System.console().readLine());
        coleccion.buscarTodosDuracion(duracion);

    }

    public static void borrarDisco(Coleccion coleccion) {
        int numero;
        String codigo;
        String autor;
        String titulo;
        String genero;
        int duracion;

        System.out.println("Numero de disco a modificar");
        numero = Integer.parseInt(System.console().readLine());
        if ((numero < 1) || (numero > coleccion.total())) {
            System.out.println("El disco esta fuera de los parametros de los discos ingresados");
        } else {

            System.out.println(coleccion.getListado()[numero - 1]);

            codigo = "Disco eliminado";
            coleccion.getListado()[numero - 1].setCodigo(codigo);

            autor = null;
            coleccion.getListado()[numero - 1].setAutor(autor);

            titulo = null;
            coleccion.getListado()[numero - 1].setTitulo(titulo);

            genero = null;
            coleccion.getListado()[numero - 1].setGenero(genero);

            duracion = 0;
            coleccion.getListado()[numero - 1].setDuracion(duracion);
            System.out.println("el disco ha sido eliminado:");
            System.out.println(coleccion.getListado()[numero - 1]);
        }
    }

}
