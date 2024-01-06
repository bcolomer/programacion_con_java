
/*
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8 y el 9.
Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6. Un
número es afortunado si contiene más números de la suerte que de la mala
suerte. Realiza un programa que diga si un número introducido por el usuario
es afortunado o no. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio62R58 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        int contadorAfortunado = 0;
        int contadorDesafortunado = 0;
        int modulo = 0;
        long numeroDuplicado = 0;

        System.out.println("Introduzca un numero");
        numero = s.nextLong();
        s.close();

        numeroDuplicado = numero;
        do {
            modulo = (int) numeroDuplicado % 10;
            if ((modulo == 3) || (modulo == 7) || (modulo == 8) || (modulo == 9)) {
                contadorAfortunado++;
            } else {
                contadorDesafortunado++;
            }
            numeroDuplicado = numeroDuplicado / 10;
        } while (numeroDuplicado > 0);

        if (contadorAfortunado > contadorDesafortunado) {
            System.out.printf("El numero %d es un numero afortunado", numero);
        } else {
            System.out.printf("El numero %d no es un numero afortunado", numero);
        }
        System.out.println("");
    }

}
