/*
 * Realiza un programa que sea capaz de insertar un número en una posición concreta
de un array. En primer lugar, el programa generará un array de 12 números enteros
aleatorios entre 0 y 200 ambos incluidos. A continuación se debe mostrar el
contenido de ese array junto al índice (0 – 11). Seguidamente el programa preguntará
por el número que se quiere insertar y por la posición donde será insertado. Los
números del array se desplazan a la derecha para dejar sitio al nuevo. El último
número (el que se encuentra en la posición 11) siempre se perderá. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio19 {
    // limite de los numeros aleatorios:
    public static final int MAXIMO = 200;
    // cantidad de valores del array:
    public static final int CANTIDAD = 12;

    public static void main(String[] args) {
        int[] numeros = new int[CANTIDAD];
        int nuevoValor;
        int nuevaPosicion;

        // creo el array con los numeros aleatorios y lo muestro en pantalla:
        crearArray(numeros);
        System.out.println("Array original: ");
        mostrarIndice();
        System.out.println();
        mostrarArray(numeros);

        // solicito por pantalla el valor a ingresar y su posicion
        System.out.println("\nIntroduzca el numero que quiere ingresar");
        nuevoValor = Integer.parseInt(System.console().readLine());
        System.out.println("\nIntroduzca la posicion donde quiere ese valor");
        nuevaPosicion = Integer.parseInt(System.console().readLine());

        // modifico el array y lo muestro por pantalla
        modificarArray(numeros, nuevoValor, nuevaPosicion);
        mostrarIndice();
        System.out.println();
        mostrarArray(numeros);

    }

    /**
     * modifico array para colocar el valor en la posicion solicitada
     * 
     * @param numeros
     * @param valor
     * @param posicion
     */
    public static void modificarArray(int[] numeros, int valor, int posicion) {
        for (int i = numeros.length - 1; i >= posicion; i--) {
            if (i == posicion) {
                numeros[i] = valor;
            } else {
                numeros[i] = numeros[i - 1];
            }
        }
    }

    /**
     * muestra el indice del array en pantalla
     */
    public static void mostrarIndice() {
        System.out.print("Indice: ");

        for (int i = 0; i < CANTIDAD; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(" ");
            }
            System.out.print(i + " ");
        }
    }

    /**
     * muestra array en pantalla
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        System.out.print("Valor:  ");
        for (int indice : numeros) {
            System.out.print(indice + "  ");
        }
    }

    /**
     * crea array de una CANTIDAD determinada con numeros aleatorios
     * 
     * @param numeros
     */
    public static void crearArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = generarAleatorio();
        }

    }

    /**
     * genera numero aleatorio entre 1 y el numero determinado por MAXIMO
     * 
     * @return
     */
    public static int generarAleatorio() {
        int aleatorio = (int) (Math.random() * (MAXIMO + 1));
        return aleatorio;
    }
}
