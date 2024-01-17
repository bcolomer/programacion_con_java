import java.util.Scanner;

public class T07Ejercicio000 {
    public static void main(String[] args) {

        int[] numeros;
        Scanner s = new Scanner(System.in);

        numeros = new int[10];

        System.out.println("Introduzca 10 numeros enteros, separados por enter");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }
        s.close();
        System.out.println("Los numeros introducidos al reves, son los siguientes: ");

        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");

        }
    }
}
