
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
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = s.nextInt();
            }

        }
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "-");
            }
            System.out.println();
        }
        s.close();
    }
}
