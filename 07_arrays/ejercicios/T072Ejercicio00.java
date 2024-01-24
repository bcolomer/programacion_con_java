import java.util.Scanner;

public class T072Ejercicio00 {
    public static void main(String[] args) {
        int matriz[][];
        matriz = new int[3][3];
        // matriz=[[8,-12,33], [14,1,-24], [100,51,69]];
        matriz={{8,-12,33},{14,1,-24},{100,51,69}};
        Scanner s = new Scanner(System.in);

        /*
         * //1er ejercicio
         * int fila = 0;
         * int columna = 0;
         * int[][] numeros = { { 8, -12, 33 }, { 14, 1, -24 }, { 100, 51, 69 } };
         * System.out.println("selecciona la fila entre 0 y 2");
         * fila = s.nextInt();
         * System.out.println("selecciona la columna entre 0 y 2");
         * columna = s.nextInt();
         * s.close();
         * 
         * System.out.printf("la variable numero [%d] [%d] = %d", fila, columna,
         * numeros[fila][columna]);
         * System.out.printf("la variable elegida es %d", numeros[fila][columna]);
         */

        // ejercicio 2:

        int elemento = 0;
        int[][] numeros = { { 8, -12, 33 }, { 14, 1, -24 }, { 100, 51, 69 } };

        System.out.println(numeros.length);
        System.out.println("indica que elemento quieres ver");
        elemento = s.nextInt();
        /*
         * if ((elemento >= 0) && (elemento <= 3)) {
         * System.out.println(numeros[0][elemento]);
         * } else if ((elemento >= 3) && (elemento <= 5)) {
         * System.out.println(numeros[1][elemento - 3]);
         * } else if ((elemento >= 6) && (elemento <= 8)) {
         * System.out.println(numeros[2][elemento - 6]);}
         */

    }

}
