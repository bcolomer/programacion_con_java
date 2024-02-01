/*
 * Escribe un programa que rellene un array de 15 elementos con números enteros
comprendidos entre 0 y 500 (ambos incluidos). A continuación, se mostrará el
array “cincuerizado”, según el siguiente criterio: si el número que hay en una
posición del array es múltiplo de 5, se deja igual, y si no, se cambia por el
siguiente múltiplo de 5 que exista a partir de él. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio21 {

    // declaro el maximo para numeros aleatorios y cantidad de valores del array
    public static final int MAXIMO = 500;
    public static final int CANTIDAD = 15;

    public static void main(String[] args) {

        int[] numeros = new int[CANTIDAD];

        crearArray(numeros);
        System.out.println();
        muestroArray(numeros);
        System.out.println();
        arrayCincuerizado(numeros);

    }

    /**
     * convierto los multiplos de 5 del array para cincuerizarlo
     * 
     * @param numeros
     */
    public static void arrayCincuerizado(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = siguienteMultiploCinco(numeros[i]);
            System.out.print(numeros[i] + " ");
        }
    }

    /**
     * convertir un numero al multiplo de cinco superior mas cercano
     * 
     * @param numero
     * @return
     */
    public static int siguienteMultiploCinco(int numero) {
        for (int i = 1; i < 5; i++) {
            if (numero % 10 == i) {
                numero = ((numero / 10) * 10) + 5;
            }
        }
        for (int i = 6; i < 10; i++) {
            if (numero % 10 == i) {
                numero = ((numero / 10) * 10) + 10;
            }
        }
        return numero;
    }

    /**
     * muestro array en pantalla
     * 
     * @param numeros
     */
    public static void muestroArray(int[] numeros) {
        // System.out.println("Array: ");
        for (int valor : numeros) {
            System.out.print(valor + " ");
        }
    }

    /**
     * creo array de aleatorios
     * 
     * @param numeros
     */
    public static void crearArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarAleatorio();
        }
    }

    /**
     * Genero aleatorio
     * 
     * @return
     */
    public static int generarAleatorio() {
        return (int) (Math.random() * (MAXIMO + 1));
    }
}
