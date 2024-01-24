
/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T07Ejercicio11 {
    public static void main(String[] args) {

        int numeros[];
        int contador = 0;

        numeros = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("introduce los valores del array separado por la tecla intro");
        // solicito los valores del array por teclado
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = s.nextInt();
            // si el numero es primo sumo en contador
            if (esPrimo(numeros[i])) {
                contador++;
            }
        }
        s.close();

        // imprimo el indice de la fila superior
        imprimirIndice(numeros.length);
        System.out.println();

        // imprimo el array de valores
        imprimirArray(numeros);
        System.out.println();

        // imprimo el array de valores ordenados con los primos delante:
        System.out.println("El array ordenado:");
        imprimirIndice(numeros.length);
        imprimirArray(ordenarArrayPrimos(numeros, numeros.length, contador));

    }

    /**
     * imprime el indice de los numeros en una linea
     * 
     * @param numero
     */
    public static void imprimirIndice(int numero) {
        System.out.printf("Indice:   ");
        for (int j = 0; j < numero; j++) {
            System.out.print(j + "  ");
        }
    }

    /**
     * ordenar un array con los primos delante dado el array y la cantidad de
     * elementos del mismo
     * 
     * @param array
     * @param cantidadElementos
     */
    public static int[] ordenarArrayPrimos(int array[], int cantidadElementos, int contador) {
        int aux[];
        aux = new int[cantidadElementos];
        int contadorNoPrimos = 0;
        int contadorPrimos = 0;
        contadorNoPrimos = contador;

        for (int i = 0; i < array.length; i++) {
            if (esPrimo(array[i])) {
                aux[contadorPrimos] = array[i];
                contadorPrimos++;
            } else {
                aux[contadorNoPrimos] = array[i];
                contadorNoPrimos++;
            }
        }
        return aux;
    }

    /**
     * imprime un array en una sola fila
     * 
     * @param array
     */
    public static void imprimirArray(int array[]) {
        System.out.printf("VALOR:    ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "  ");
        }
    }

    /**
     * devuelve si un numero entero es primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        boolean primo = true;
        if (numero > 2) {
            for (int i = 2; i < ((numero / 2) + 1); i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }
        return (primo);
    }
}
