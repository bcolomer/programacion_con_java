/*
 * Realiza un programa que pinte una pirámide maya. Por los lados, se trata
de una pirámide normal y corriente. Por el centro se van pintando líneas de
asteriscos de forma alterna (empezando por la superior): la primera se pinta,
la segunda no, la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre
tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la pirámide
normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el
usuario introducirá un número entero mayor o igual a 3; no es necesario
comprobar los datos de entrada. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio69 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("introduzca la altura igual o mayor a 3");
        altura = s.nextInt();
        s.close();

        for (int fila = 0; fila < altura; fila++) {
            for (int espaciosIzquierdos = 0; espaciosIzquierdos < altura - fila; espaciosIzquierdos++) {
                System.out.print(" ");
            }
            // imprime la fila 0 o terraza
            if (fila == 0) {
                System.out.print("******");
            } else {

                // imprime las lineas impares (* *)
                if (fila % 2 != 0) {
                    // imprime las estrellas de la izquierda
                    for (int estrellas = 0; estrellas < fila + 1; estrellas++) {
                        System.out.print("*");
                    }
                    // espacios centrales
                    System.out.print("    ");

                    // imprime estrellas de la derecha
                    for (int estrellas = 0; estrellas < fila + 1; estrellas++) {
                        System.out.print("*");
                    }

                    // imprime lineas pares o lineas completas
                } else {
                    for (int estrellas = 0; estrellas < (fila * 2) + 6; estrellas++) {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
