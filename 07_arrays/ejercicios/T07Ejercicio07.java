
/*
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
muestre por pantalla separados por espacios. El programa pedirá entonces por
teclado dos valores y a continuación cambiará todas las ocurrencias del primer
valor por el segundo en la lista generada anteriormente. Los números que se
han cambiado deben aparecer entrecomillados. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T07Ejercicio07 {
    public static void main(String[] args) {
        int[] numeros;
        int valor1 = 0;
        int valor2 = 0;
        Scanner s = new Scanner(System.in);

        numeros = new int[100];

        // genero un array de 100 numeros aleatorios:
        arrayAleatorios(numeros, numeroAleatorio());
        System.out.println("\n ------- ------- -------");

        System.out.println(
                "\nIntroduzca dos numeros del 0 al 20, separados por la tecla intro, asegurese que el primero este en el listado mostrado anteriormente");
        valor1 = s.nextInt();
        valor2 = s.nextInt();
        s.close();
        System.out.println(" ------- ------- -------");

        // muestro el array con los valores cambiados y entrecomillados para
        // identificarlos rapido
        mostrarArrayCambiado(numeros, valor1, valor2);
        System.out.println("---");

        // muestro el array cambiado sin las comillas
        mostrarArray(numeros);
    }

    /**
     * mostrar el array con el valor1 cambiado por el valor 2 entre comillas
     * 
     * @param numeros
     * @param valor1
     * @param valor2
     */
    public static void mostrarArrayCambiado(int[] numeros, int valor1, int valor2) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valor1) {
                numeros[i] = valor2;
                System.out.print("\"" + numeros[i] + "\" ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    /**
     * numero aleatorio entre 0 y 20
     * 
     * @return
     */
    public static int numeroAleatorio() {
        int numero = 0;
        numero = (int) (Math.random() * 21);

        return numero;

    }

    /**
     * genero un array de aleatorios
     * 
     * @param numeros
     * @param aleatorio
     */
    public static void arrayAleatorios(int numeros[], int aleatorio) {
        for (int i = 0; i < numeros.length; i++) {
            aleatorio = numeroAleatorio();
            numeros[i] = aleatorio;
            System.out.print(numeros[i] + " ");
        }

    }

    public static void inicializarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 21);
        }
    }

    public static void mostrarArray(int[] numeros) {
        for (int item : numeros) {
            System.out.printf("%d ", item);
        }

    }
}
