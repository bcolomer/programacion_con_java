import java.util.Scanner;

public class T07Ejercicio000 {
    public static void main(String[] args) {

        int[] numeros;
        Scanner s = new Scanner(System.in);
        String opcion;

        numeros = new int[3];

        System.out.println("Introduzca 10 numeros enteros, separados por enter");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
        }

        System.out.println("deseas ver el array al derecho o al reves?");

        opcion = System.console().readLine();
        if (opcion.equals("al derecho")) {
            System.out.println("el array al derecho  es: ");
            mostrarArrayDerecho(numeros);
        } else if (opcion.equals("al reves")) {
            System.out.println("el array invertido es: ");
            mostrarArrayInvertido(numeros);
        }
        s.close();
    }

    public static void mostrarArrayDerecho(int[] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    }

    public static void mostrarArrayInvertido(int[] numeros) {

        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
