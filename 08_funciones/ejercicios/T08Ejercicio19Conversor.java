
/*
 * Une y amplía los dos programas anteriores de tal forma que se permita
convertir un número entre cualquiera de las siguientes bases: decimal, binario,
hexadecimal y octal. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T08Ejercicio19Conversor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numeroAConvertir = 0;
        // long numeroConvertido = 0;
        char opcion = ' ';

        System.out.println("---------Conversor---------");
        imprimirMenu();
        opcion = System.console().readLine().toUpperCase().charAt(0);
        while (opcion != 'T') {

            System.out.println("Introduzca el numero que quiere convertir:");
            numeroAConvertir = s.nextLong();
            System.out.println();
            System.out.println("el numero convertido es: " + conversorEleccion(opcion, numeroAConvertir));
            System.out.println();

            imprimirMenu();
            opcion = System.console().readLine().toUpperCase().charAt(0);
        }

        System.out.println();

        s.close();

    }

    /**
     * Funcion para imprimir el menu de opciones
     * 
     */
    public static void imprimirMenu() {
        System.out.println("A) Binario --> Octal\nB) Binario --> Decimal\nC) Binario --> Hexadecimal");
        System.out.println("D) Octal --> Binario\nE) Octal --> Decimal\nF) OCtal --> Hexadecimal");
        System.out.println("G) Decimal --> Binario\nH) Decimal --> Octal\nI) Decimal --> Hexadecimal");
        System.out.println("J) Hexadecimal --> Binario\nK) Hexadecimal --> Octal\nL) Hexadecimal --> Decimal");
        System.out.println("T) Terminar ");
        System.out.println("Elija su opcion:");
    }

    /**
     * funcion para convertir un hexadecimal a decimal
     * 
     * @param NumeroHexa
     * @return
     */
    public static long HexaDecimal(String numeroHexa) {
        long decimal = 0;
        // int longNumero = numeroHexa.length();

        return decimal;
    }

    /**
     * funcion para convertir un decimal a octal
     * 
     * @param numero
     * @return
     */
    public static long decimalOctal(long decimal) {
        long octal = 0;

        int modulo = 0;
        int contadorAntes = 0;
        long octalReves = 0;
        int contadorDespues = 0;
        int diferenciaContadores = 0;

        do {
            modulo = (int) (decimal % 8);
            octalReves = (octalReves * 10) + modulo;
            decimal = decimal / 8;
            contadorAntes++;
        } while (decimal > 0);

        do {
            modulo = (int) (octalReves % 10);
            octalReves = octalReves / 10;
            octal = (octal * 10) + modulo;
            contadorDespues++;
        } while (octalReves > 0);

        if (contadorAntes > contadorDespues) {
            diferenciaContadores = contadorAntes - contadorDespues;
            octal = octal * (long) (Math.pow(10, diferenciaContadores));
        }

        return octal;
    }

    /**
     * funcion para convertir octal en decimal
     * 
     * @param numero
     * @return
     */
    public static long octalDecimal(long numero) {

        long decimal = 0;
        int contador = 0;
        long modulo = 0;
        do {
            modulo = numero % 10;
            numero = numero / 10;

            decimal = decimal + (modulo * ((long) (Math.pow(8, contador))));

            contador++;
        } while (numero > 0);

        return decimal;
    }

    /**
     * funcion para convertir un numero binario a decimal
     * 
     * @param numero
     * @return
     */
    public static long binarioDecimal(long numero) {

        long decimal = 0;
        int contador = 0;
        long modulo = 0;
        do {
            modulo = numero % 10;
            numero = numero / 10;
            if (modulo == 1) {
                decimal = decimal + (long) (Math.pow(2, contador));
            }
            contador++;
        } while (numero > 0);

        return decimal;
    }

    /**
     * funcion para pasar un numero decimal a binario
     * 
     * @param numero
     * @return
     */
    public static long decimalBinario(long decimal) {
        long binario = 0;
        int modulo = 0;
        int contadorAntes = 0;
        long binarioReves = 0;
        int contadorDespues = 0;
        int diferenciaContadores = 0;

        do {
            modulo = (int) (decimal % 2);
            binarioReves = (binarioReves * 10) + modulo;
            decimal = decimal / 2;
            contadorAntes++;
        } while (decimal > 0);

        do {
            modulo = (int) (binarioReves % 10);
            binarioReves = binarioReves / 10;
            binario = (binario * 10) + modulo;
            contadorDespues++;
        } while (binarioReves > 0);

        if (contadorAntes > contadorDespues) {
            diferenciaContadores = contadorAntes - contadorDespues;
            binario = binario * (long) (Math.pow(10, diferenciaContadores));
        }

        return binario;
    }

    /**
     * funcion para elegir la opcion del conversor
     * 
     * @param opcion
     * @return
     */
    public static long conversorEleccion(char opcion, long numero) {
        long numeroConvertido = 0;

        switch (opcion) {
            case 'A':
                numeroConvertido = binarioDecimal(numero);
                numeroConvertido = decimalOctal(numeroConvertido);
                break;
            case 'B':
                numeroConvertido = binarioDecimal(numero);
                break;
            case 'C':
                System.out.println("no hay opcion disponible aun");
                break;
            case 'D':
                numeroConvertido = octalDecimal(numero);
                numeroConvertido = decimalBinario(numeroConvertido);
                break;
            case 'E':
                numeroConvertido = octalDecimal(numero);
                break;
            case 'F':
                System.out.println("no hay opcion disponible aun");
                break;
            case 'G':
                numeroConvertido = decimalBinario(numero);
                break;
            case 'H':
                numeroConvertido = decimalOctal(numero);
                break;
            case 'I':
                System.out.println("no hay opcion disponible aun");
                break;
            case 'J':
                System.out.println("no hay opcion disponible aun");
                break;
            case 'K':
                System.out.println("no hay opcion disponible aun");
                break;
            case 'L':
                System.out.println("no hay opcion disponible aun");
                break;
            default:
                System.out.println("La opcion marcada no está en el menú");
                break;
        }
        return numeroConvertido;
    }
}
