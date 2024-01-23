import java.util.InputMismatchException;
import java.util.Scanner;

public class T07Ejercicio00 {
    public static void main(String[] args) {

        int celda = 0;
        int[] numeros;
        // esto se puede realizar tambien asi: dandole valores directamente en lugar de
        // darle los valores despues
        // int[] numeros = { 8, 3, 200, 150, 11 };
        Scanner s = new Scanner(System.in);
        numeros = new int[5];

        numeros[0] = 8;
        numeros[1] = 33;
        numeros[2] = 200;
        numeros[3] = 150;
        numeros[4] = 11;

        try {

            System.out.println("indica de que numero de celda quieres saber el valor. Solo hay 5 celdas");
            celda = s.nextInt();
            System.out.printf("En la celda %d esta el valor %d", celda, numeros[celda - 1]);
        } catch (InputMismatchException e) {
            System.out.println("Se ha producido un error en la insercion del valor numerico");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido un error. El valor excede el tamaño del array");
        }
        s.close();

    }
}
