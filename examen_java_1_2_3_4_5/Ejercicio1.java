
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        char color;
        long invertido = 0;
        long descomponer = 0;
        long modulo = 0;
        int contador = 0;
        int copiaContador = 0;

        System.out.println("GRAPHIFY");
        System.out.println("============================");
        System.out.print("Introduce un numero: ");
        do {
            numero = s.nextLong();
            if (numero <= 0) {
                System.out.println("ERROR: el número tiene que ser mayor que cero.");
                System.out.println("Introduzca el numero nuevamente:");

            }
        } while (numero <= 0);
        System.out.println("Dibujo la gráfica en blanco y negro o en color (B/C)?");
        color = s.next().charAt(0);

        s.close();

        invertido = Invertir(numero);
        contador = ContadorDigitos(numero);
        copiaContador = contador;

        do {
            modulo = invertido % 10;
            invertido = invertido / 10;
            descomponer = (descomponer * 10) + modulo;

            // este for imprime tantas lineas como digitos tenga el numero
            // for (int i = 0; i < copiaContador; i++) {

            // esto imprime las lineas arriba

            for (int j = 0; j <= NumeroMayor(numero); j++) {
                System.out.print(" ---");
            }
            System.out.println();

            System.out.printf("| %d |", modulo);

            // esto imprimira las lineas del medio
            for (int j = 0; j < NumeroMayor(numero); j++) {

                if (j < modulo) {
                    System.out.print(" * |");
                } else {
                    System.out.print("   |");
                }

            }

            copiaContador--;
            System.out.println();
            // }

        } while (invertido > 0);
        // esto imprime las lineas abajo
        for (

                int k = 0; k <= NumeroMayor(numero); k++) {
            System.out.print(" ---");
        }
    }

    /**
     * funcion para invertir un numero tipo long
     * 
     * @param numero
     * @return
     */
    public static long Invertir(long numero) {
        long modulo = 0;
        long invertido = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            invertido = (invertido * 10) + modulo;

        } while (numero > 0);

        return invertido;
    }

    /**
     * funcion para contar digitos de un numero tipo long
     * 
     * @param numero
     * @return
     */
    public static int ContadorDigitos(long numero) {
        long modulo = 0;
        long invertido = 0;
        int contador = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            invertido = (invertido * 10) + modulo;
            contador++;

        } while (numero > 0);

        return contador;
    }

    /**
     * funcion para saber cual es el digito mayor del numero dado
     * 
     * @param numero
     * @return
     */
    public static int NumeroMayor(long numero) {
        long modulo = 0;
        long invertido = 0;
        int digitoMayor = 0;

        do {
            modulo = numero % 10;
            numero = numero / 10;
            invertido = (invertido * 10) + modulo;
            if (digitoMayor <= modulo) {
                digitoMayor = (int) modulo;
            }

        } while (numero > 0);
        return digitoMayor;
    }
}