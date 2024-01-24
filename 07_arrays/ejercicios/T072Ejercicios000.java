
/*
 * define un array bidimensional de 3*3 y solicita al usuario slos 
         emlemenos que debe contener cada una de sus celdas. luego mostrar el contenido del array 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T072Ejercicios000 {
    public static void main(String[] args) {
        int[][] numeros;
        numeros = new int[3][3];

        Scanner s = new Scanner(System.in);
        System.out.println("introduzca el contenido de las celdas, separado con intro");
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
                numeros[filas][columnas] = s.nextInt();
            }

        }
        for (int filas = 0; filas < numeros.length; filas++) {
            for (int columnas = 0; columnas < numeros[filas].length; columnas++) {
                System.out.print(numeros[filas][columnas] + "-");
            }
            System.out.println();
        }
        s.close();

    }
}
