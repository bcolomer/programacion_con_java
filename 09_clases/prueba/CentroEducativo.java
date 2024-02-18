import clases.Alumno;
import clases.Persona;

public class CentroEducativo {
    private static final int MAXALUMNOS = 100;

    public static void main(String[] args) {
        int opcion;
        Alumno[] alumnos = new Alumno[MAXALUMNOS];
        do {
            menu();
            System.out.println("Opcion?");
            opcion = Integer.parseInt(System.console().readLine());
        } while (opcion != 0);
    }

    /**
     * muestra menu en pantalla
     */
    public static void menu() {
        System.out.println("CENTRO EDUCATIVO HEDY LAMARR");
        System.out.println("=============================");
        System.out.println("0. Salir");
        System.out.println("1. Introducir alumno");
        System.out.println("2. Modificar alumno");// de momento dejarlo
        System.out.println("3. Buscar alumno por Dni");
        System.out.println("4. Mostrar listado de alumnos");
    }

    /**
     * introducirAlumno:
     * Solicita los datos de un alumno, lo crea e introduce
     * en el array.
     */

    /**
     * BuscarAlumno:
     * Solicita el DNI del alumno y lo busca en el array.
     * Si lo encuentra, muestra la información del alumno;
     * en otro caso, se indica que no se ha encontrado.
     */
    public static void buscarAlumno(int dni) {
        for (iterable_type iterable_element : iterable) {

        }
    }

    /**
     * mostrarListado :
     * Muestra un listado de todos los alumnos almacenados
     * en el array, separando cada uno de ellos por una
     * línea.
     * 12345678A, Pedro Pérez, 18 años
     * ---------
     * 23456789B, Alicia Gutiérrez, 22 años
     */
    public static void mostrarAlumno(Alumno alumno){
        for ( iterable_element : iterable) {
            System.out.println(iterable_element);
        }
    }
    /**********************************************/
    /**
     * solicita los datos d un alumno , lo crea e introduce en el array
     * 
     * public static... introducirAlumno(...){
     * 
     * }
     */
    /**
     * buscar alumno: solicita dni del alumno, lo busca en el array ,
     * si lo encuentra muestra la informacion del alumno y en otro caso
     * se indica que no se ha encontrado
     */

    /**
     * mostrar listado: muestra un listado de todos lo alumnos
     * almacenados en el array, separando cada uno de ellos por una linea
     * 123456a, pedro perez, 18 años
     * -----
     * 546546e, alicia gutierrez, 22 años
     * ---
     */
}