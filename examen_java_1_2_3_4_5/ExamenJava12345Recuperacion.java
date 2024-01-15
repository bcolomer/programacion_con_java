
/*
 * Se quiere crear una aplicación que muestre en pantalla un menú de opciones permitiendo que el usuario realice diferentes 
 * operaciones con números enteros. La ejecución del programa finalizará únicamente cuando el usuario elija la opción SALIR.
 *  La aplicación requiere que se implementen, como mínimo, las siguientes funciones. Deberá gestionarse de forma apropiada 
 * cualquier error que pueda producirse.
a. función menu(): muestra en pantalla el menú de opciones.
   - MENU --------------------
   0. Salir
   1. División de enteros
   2. Longitud
   3. Invertir
   4. Suma de los divisores
   5. Números amigos
   6. Dígitos
   Introduzca una opción:
b. función divisionEnteros(int a, int b): recibe dos valores numéricos de tipo entero, calcula y muestra en pantalla el cociente y
 el resto de la división entera.
c. función longitud(int num): recibe un valor de tipo numérico entero y devuelve el número de dígitos que lo componen.
d. función invertir(int num): recibe un valor de tipo numérico entero y devuelve el número invertido.
e. función sumaDivisores(int num): recibe un valor de tipo numérico entero y devuelve la suma de los divisores propios del número dado. 
Los divisores propios de un número son todos aquellos que lo dividen de forma exacta excepto el propio número.
f. función amigos(int a, int b): recibe dos valores numéricos enteros y devuelve true o false dependiendo de si ambos números son o no amigos.
 Dos números son amigos si cada uno de ellos se obtiene sumando los divisores propios del otro. Las siguientes parejas de números 
 son amigos 220 y 284, 1184 y 1210, 2620 y 2924.
g. función digitos(int num): recibe un valor numérico entero y muestra en pantalla literalmente los dígitos que comprenden la cifra numérica.
 Recuerda que deben tenerse los ceros a la derecha.
Se muestra a continuación un vídeo de demostración de funcionamiento de la aplicacion. Debe tenerse en cuenta que, para realizar el borrado de
 pantalla, tendrás que utilizar el siguiente código de escape:  \033[H\033[2J.
 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class ExamenJava12345Recuperacion {
    public static void main(String[] args) {

        int opcion = 0;
        int numeroA = 0;
        int numeroB = 0;
        // String continuar = "";
        Scanner s = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println(imprimirMenu());
            System.out.print("Introduzca una opción: ");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("- DIVISION DE ENTEROS ------");
                    System.out.println("Introduzca el dividendo:");
                    numeroA = s.nextInt();
                    System.out.println("Introduzca el divisor:");
                    numeroB = s.nextInt();
                    System.out.println(divisionEnteros(numeroA, numeroB));
                    // System.out.println("PULSA ENTER PARA CONTINUAR");
                    // s.next();
                    // System.out.printf("\033[H\033[2J");
                    break;

                case 2:
                    System.out.println("- LONGITUD ----------");
                    System.out.println("Introduzca un número:");
                    numeroA = s.nextInt();
                    System.out.printf("La longitud del numero %d es igual a %d\n", numeroA, longitud(numeroA));
                    break;

                case 3:
                    System.out.println("- INVERTIR ----------");
                    System.out.println("Introduzca un número:");
                    numeroA = s.nextInt();
                    System.out.printf("El numero %d invertido es igual a  %d\n", numeroA, invertir(numeroA));

                    break;
                case 4:
                    System.out.println("- SUMA DE DIVISORES ----------");
                    System.out.println("Introduzca un número:");
                    numeroA = s.nextInt();
                    System.out.printf("La suma de divisores de  %d es igual a  %d\n", numeroA, sumaDivisores(numeroA));
                    break;
                case 5:
                    System.out.println("-NUMEROS AMIGOS ----------");
                    System.out.println("Introduzca un número:");
                    numeroA = s.nextInt();
                    System.out.println("Introduzca un número:");
                    numeroB = s.nextInt();
                    System.out.println(numerosAmigos(numeroA, numeroB));
                    break;
                case 6:
                    System.out.println("-PN NUMERICO ----------");
                    System.out.println("Introduzca un número:");
                    numeroA = s.nextInt();
                    System.out.println(digitosEnLetras(numeroB));
                    break;
                default:
                    break;
            }
            if ((opcion > 6) || (opcion < 0)) {
                System.out.println("No ha introducido valores correctos");
            }
        } while (opcion != 0);

        s.close();

    }

    /**
     * funcion para saber la longitud de un numero tipo int
     * 
     * @param numero
     * @return
     */
    private static int longitud(int numero) {
        int longitud = 0;

        do {
            numero = numero / 10;
            longitud++;
        } while (numero > 0);

        return longitud;
    }

    /**
     * funcion para darle la vuelta a un numero
     * 
     * @param numero
     * @return
     */
    public static int invertir(int numero) {
        int reves = 0;
        int modulo = 0;
        // int contadorAntes = 0;
        // int contadorDespues = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            reves = (reves * 10) + modulo;
        } while (numero > 0);
        // contadorAntes = longitud(numero);
        // contadorDespues = longitud(reves);
        // if (contadorDespues != contadorAntes) {
        // reves = reves * (int) Math.pow(10, (contadorAntes - contadorDespues));

        // }
        return reves;
    }

    /**
     * funcion que imprime menu de opciones
     * 
     * @return
     */
    private static String imprimirMenu() {
        String menu = "";

        menu = "-MENU--------------------\n" + " 0. Salir\n" + " 1. División de enteros\n" + " 2. Longitud\n"
                + " 3. Invertir\n" + " 4. Suma de divisores\n" + " 5. Números amigos\n" + " 6. Dígitos\n";
        ;

        return menu;
    }

    /**
     * funcion para devolver la suma de divisores de un numero tipo int
     * 
     * @param numero
     * @return
     */
    private static int sumaDivisores(int numero) {
        int suma = 0;

        for (int i = 1; i < numero - 1; i++) {
            if (numero % i == 0) {
                suma = suma + i;
            }
        }
        return suma;
    }

    /**
     * funcion para saber si dos numeros tipo int son amigos
     * 
     * @param numeroA
     * @param numeroB
     * @return
     */
    private static String numerosAmigos(int numeroA, int numeroB) {

        String amigotes = "";

        if ((sumaDivisores(numeroA) == numeroB) && (sumaDivisores(numeroB) == numeroA)) {
            amigotes = "los numeros " + numeroA + " y " + numeroB + " SON AMIGOS";
        } else {
            amigotes = "los numeros " + numeroA + " y " + numeroB + " NO SON AMIGOS";
        }

        // return ((sumaDivisores(numeroA) == numeroB) && (sumaDivisores(numeroB) ==
        // numeroA)) ? amigos : !amigos;

        return amigotes;
    }

    /**
     * funcion para devolver en una cadena el cociente y el resto de una division de
     * 2 numeros tipo int
     * 
     * @param dividendo
     * @param divisor
     * @return
     */
    private static String divisionEnteros(int dividendo, int divisor) {
        String division = "";
        int cociente = 0;
        int resto = 0;

        cociente = dividendo / divisor;
        resto = dividendo % divisor;
        division = ("cociente = " + cociente + "\nresto    = " + resto);

        return division;
    }

    /**
     * funcion que devuelve en una cadena de texto el numero dado
     * 
     * @param numero
     * @return
     */
    private static String digitosEnLetras(int numero) {
        String comprenden = "";
        int modulo = 0;
        int invertido = invertir(numero);
        do {
            modulo = invertido % 10;
            invertido = invertido / 10;
            switch (modulo) {
                case 0:
                    comprenden += "cero ";
                    break;
                case 1:
                    comprenden += "uno ";
                    break;
                case 2:
                    comprenden += "dos ";
                    break;
                case 3:
                    comprenden += "tres ";
                    break;
                case 4:
                    comprenden += "cuatro ";
                    break;
                case 5:
                    comprenden += "cinco ";
                    break;
                case 6:
                    comprenden += "seis ";
                    break;
                case 7:
                    comprenden += "siete ";
                    break;
                case 8:
                    comprenden += "ocho ";
                    break;
                case 9:
                    comprenden += "uno ";
                    break;

            }
        } while (invertido > 0);
        return comprenden;
    }

}
