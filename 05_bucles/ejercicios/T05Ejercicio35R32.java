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

        System.out.println("introduzca una altura impar igual o mayor a 3");
        altura = s.nextInt();
        s.close();

        if ((altura < 3) || (altura % 2 == 0)) {
            System.out.println("Error: no ha introducido la altura correctamente.");

        } else {
            alturaPiramideSuperior = altura / 2;
            alturaPiramideInferior = (altura / 2) + 1;

            for (int i = alturaPiramideSuperior; i >= 1; i--) {
                for (int j = 0; j < (alturaPiramideSuperior - i); j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                for (int j = 0; j < ((i * 2) - 1); j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
                System.out.println();
            }

            for (int i = 1; i <= alturaPiramideInferior; i++) {
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
