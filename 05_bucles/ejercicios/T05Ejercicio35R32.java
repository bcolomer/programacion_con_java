/*
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
igual a 3, en caso contrario se debe mostrar un mensaje de error. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio35R32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int alturaPiramideInferior = 0;
        int alturaPiramideSuperior = 0;
        int altura = 0;
lkjlñ
        System.out.println("introduzca una altura impar igual o mayor a 3");
        altura = s.nextInt();
        s.close();

        if ((altura < 3) || (altura % 2 == 0)) {
            System.out.println("Error: no ha introducido la altura correctamente.");

        } else {
            alturaPiramideSuperior = altura / 2;
            alturaPiramideInferior = (altura / 2) + 1;
            for (int i = 1; i <= alturaPiramideSuperior; i++) {
                System.out.print(i);
                for (int j = 0; j < (i - 1); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 0; j < ((alturaPiramideSuperior * 2) - i); j++) {
                    System.out.print("m");
                }

                System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= alturaPiramideInferior; i++) {
                System.out.print(i);
                // System.out.print(i);
                for (int j = 0; j < (alturaPiramideInferior - i); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < (i - 1); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (i - 2); j++) {
                    System.out.print(" ");
                }
                if (i != 1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

/*
 * Scanner s = new Scanner(System.in);
 * int altura = 0;
 * int alturaA = 0;
 * int auxiliar = 0;
 * int alturaB = 0;5464
 * 
 * System.out.println("Impresora de X, Introduzca la altura: ");
 * do {
 * altura = s.nextInt();
 * if (((altura < 3) || (altura % 2 == 0))) {
 * System.out.
 * println("La altura debe ser un numero impar mayor o igual a 3. Introduzca la altura: "
 * );
 * 
 * }
 * } while ((altura < 3) || (altura % 2 == 0));
 * s.close();
 * 
 * // 1era mitad es una piramide hueca invertida:
 * alturaA = (altura / 2) + 1; // esto me resuelve la altura de la primera mitad
 * auxiliar = altura;
 * for (int i = 0; i < alturaA; i++) {// controlo las lineas
 * for (int j = 0; j < i; j++) {// pinto espacios
 * System.out.print(" ");
 * }
 * 
 * for (int j = 0; j < auxiliar; j++) {// pinto estrellas
 * if ((j != 0) && (j != auxiliar - 1)) { //
 * System.out.print(" ");
 * } else {
 * System.out.print("*");
 * }
 * 
 * }
 * auxiliar = auxiliar - 2;
 * 
 * System.out.println();
 * }
 * alturaB = altura / 2;
 * // 2da mitad de la piramide sin la base:
 * for (int i = 0; i <= alturaB + 1; i++) { // esto controla las filas
 * for (int j = 1; j < alturaB; j++) { // esto controla los espacios
 * System.out.print(" ");
 * }
 * alturaB--;
 * for (int j = 0; j < (i * 2) + 3; j++) {
 * if ((j != 0) && (j != (i * 2) + 2)) {
 * System.out.print(" ");
 * } else {
 * System.out.print("*");
 * }
 * 
 * }
 * System.out.println();
 * }
 * 
 * }
 * }
 */