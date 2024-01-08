/*
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen 
 * en un número entero introducido por teclado. El orden es el que se muestra en 
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números 
 * largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long numero = 0;
        boolean encontrado = false;

        System.out.println("introduzca un numero y se le indicara los numeros que aparecen y los que no");
        numero = s.nextLong();
        s.close();

        System.out.print("Los numeros que aparecen son: ");
        for (int i = 0; i <= 9; i++) {
            encontrado = digitoEsta(i, numero);
            if (encontrado) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Los numeros que no aparecen son: ");
        for (int i = 0; i <= 9; i++) {
            encontrado = digitoEsta(i, numero);
            if (!encontrado) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean digitoEsta(int digito, long numero) {

        boolean encontrado = false;
        int modulo = 0;
        do {
            modulo = (int) numero % 10;
            numero = numero / 10;
            encontrado = (modulo == digito);
        } while (numero > 0 && !encontrado);
        return encontrado;
    }
}
