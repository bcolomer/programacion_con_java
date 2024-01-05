/*
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen 
 * en un número entero introducido por teclado. El orden es el que se muestra en 
 * los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números 
 * largos. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;dsfadf

public class T05Ejercicio48 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long numero = 0;
        boolean encontrado = false;
        long numeroDuplicado = 0;
        int modulo = 0;

        System.out.println("introduzca un numero y se le indicara los numeros que aparecen y los que no");
        numero = s.nextLong();
        s.close();

        System.out.print("Los numeros que aparecen son:");
        for (int i = 0; i < 10; i++) {
            // System.out.print("vuelta: " + i);
            numeroDuplicado = numero;
            do {
                modulo = (int) numeroDuplicado % 10;
                numeroDuplicado = numeroDuplicado / 10;
                if (i == modulo) {
                    System.out.print(i + " ");
                }

            } while (numeroDuplicado > 0);
        }

        System.out.print("Los numeros que no aparecen son:");
        for (int i = 0; i < 10; i++) {
            // System.out.print("vuelta: " + i);
            numeroDuplicado = numero;
            do {
                modulo = (int) numeroDuplicado % 10;
                numeroDuplicado = numeroDuplicado / 10;
                if (i != modulo) {
                    System.out.print(i + " ");
                }

            } while (numeroDuplicado > 0);
        }
    }
}
/*
 * solucion profesor: libro
 * 
 * 
 * 
 * 
 * 
 * Scanner s = new Scanner(System.in);
 * System.out.print("Introduzca un número entero: ");
 * long numero = Long.parseLong(s.nextLine());
 * long aux;
 * boolean encontrado;
 * System.out.print("Dígitos que aparecen en el número: ");
 * for (int i = 0; i < 10; i++) {
 * // Comprueba si i está en el número
 * encontrado = false;
 * aux = numero;
 * while (aux > 0) {
 * if (aux % 10 == i) {
 * encontrado = true;
 * }
 * aux /= 10;
 * }
 * 
 * if (encontrado) {
 * System.out.print(i + " ");
 * }
 * }
 * System.out.print("\nDígitos que no aparecen: ");
 * for (int i = 0; i < 10; i++) {
 * // Comprueba si i está en el número
 * encontrado = false;
 * aux = numero;
 * while (aux > 0) {
 * if (aux % 10 == i) {
 * encontrado = true;
 * }
 * aux /= 10;
 * }
 * if (!encontrado) {
 * System.out.print(i + " ");
 * }
 * }
 * }
 * 
 * 
 * 
 * 
 * solucion profe clase
 * 
 * 
 * 
 * 
 * Realiza un programa que diga los dígitos que aparecen y los que no aparecen
 * en
 * un número entero introducido por teclado. El orden es el que se muestra en
 * los
 * ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
 * largos.
 * 
 * @author Antonio J. Sánchez
 * 
 * @author José David Quero
 */

/**
 * public class Ejercicio45 {
 * public static void main(String[] args) {
 * 
 * int numero ;
 * int digito ;
 * 
 * Scanner sc = new Scanner(System.in) ;
 * System.out.print("Introduzca un número entero: ");
 * numero = sc.nextInt() ;
 * 
 * // mostramos los dígitos que aparecen en el número
 * System.out.print("Dígitos que aparecen en el número: ");
 * for(digito=0; digito<=9; digito++) {
 * if (buscarDigito(digito, numero)) { System.out.printf("%d ", digito); }
 * }
 * 
 * // mostramos los dígitos que NO aparecen
 * System.out.print("\nDígitos que no aparecen: ");
 * for(digito=0; digito<=9; digito++) {
 * if (!buscarDigito(digito, numero)) { System.out.printf("%d ", digito); }
 * }
 * 
 * System.out.println("");
 * }
 */
/**
 * Busca el dígito en el número dado. Devuelve true si se encuentra; false en
 * otro caso.
 * 
 * @param digito
 * @param numero
 * @return
 */
/*
 * public static boolean buscarDigito(int digito, int numero) {
 * 
 * while((numero > 0) && (numero%10!=digito)) { numero/=10 ; }
 * return (numero!=0) ;
 * 
 * }
 * }
 */