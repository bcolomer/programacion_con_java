
/*
 *  Escribe un programa que pinte por pantalla la letra V. El ancho del palo de
la V es siempre de 3 asteriscos. El usuario debe introducir la altura. La altura
mínima es de 3 pisos. Si el usuario introduce una altura menor, el programa
debe mostrar un mensaje de error.
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio61R57 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int altura = 0;

        System.out.println("Introduzca la altura");
        altura = s.nextInt();
        s.close();

        if (altura < 3) {
            System.out.println("Error. La altura debe de ser mayor o igual a 3");
        } else {

            for (int i = altura - 1; i > 0; i--) {
                // imprime espacios antes de la diagonal izquierda
                for (int k = 0; k < (altura - i); k++) {
                    System.out.print(" ");
                }
                System.out.print("***");// imprime primer diagonal
                // imprimo espacios dentro de la V
                for (int j = 0; j < i * 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("***");// imprime 2da diagonal
                System.out.println();

            }
            // imprime espacios antes de la base
            for (int i = 0; i < altura; i++) {
                System.out.print(" ");
            }
            System.out.print("******");// imprime base
        }

    }
}
