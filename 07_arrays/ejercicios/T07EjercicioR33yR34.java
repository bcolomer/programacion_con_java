/*
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas
relleno con números aleatorios entre 200 y 300. A continuación, el programa debe
mostrar los números de la diagonal que va desde la esquina superior izquierda a la
esquina inferior derecha, así como el máximo, el mínimo y la media de los números
que hay en esa diagonal. 
 * 
 * @autor Barbara Colomer
 */
public class T07EjercicioR33yR34 {
    public static final int MAX = 10;
    public static final int INI = 200;
    public static final int FIN = 300;

    public static void main(String[] args) {
        int[][] tablero;
        tablero = new int[MAX][MAX];
        int[] diagonalIzquierdo;
        diagonalIzquierdo = new int[MAX];
        int[] diagonalDerecho;
        diagonalDerecho = new int[MAX];

        rellenarArray(tablero);
        mostrarArrayBi(tablero);
        generoArrayDiagonalIzquierdo(diagonalIzquierdo, tablero);
        generoArrayDiagonalDerecho(diagonalDerecho, tablero);
        System.out.println("Diagonal derecho:");
        mostrarArray(diagonalDerecho);
        numMaximo(diagonalDerecho);
        numMinimo(diagonalDerecho);
        media(diagonalDerecho);
        System.out.println();
        System.out.println("Diagonal izquierdo");
        mostrarArray(diagonalIzquierdo);
        numMaximo(diagonalIzquierdo);
        numMinimo(diagonalIzquierdo);
        media(diagonalIzquierdo);

    }

    /**
     * imprime la media del array en pantalla
     * 
     * @param diagonal
     */
    public static void media(int[] array) {
        double suma = 0;
        for (int item : array) {
            suma = suma + item;
        }
        System.out.printf("Media: %.2f", (suma / MAX));
    }

    /**
     * imprime el numero minimo de un array unidimensional
     * 
     * @param diagonal
     */
    public static void numMinimo(int[] array) {
        int min = Integer.MAX_VALUE;
        System.out.print("Mínimo: ");

        for (int item : array) {
            if (min > item) {
                min = item;
            }
        }
        System.out.print(min + "\n");
    }

    /**
     * imprime el numero maximo de un array unidimensional
     * 
     * @param diagonal
     */
    public static void numMaximo(int[] array) {
        int max = Integer.MIN_VALUE;
        System.out.print("\nMáximo: ");

        for (int item : array) {
            if (max < item) {
                max = item;
            }
        }
        System.out.print(max + "\n");
    }

    /**
     * muestro array de diagonales
     * 
     * @param diagonal
     */
    public static void mostrarArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    /**
     * completo el array con los valores de la diagonal
     * 
     * @param diagonal
     * @param tablero
     */
    public static void generoArrayDiagonalIzquierdo(int[] arrayDiagonal, int[][] tablero) {

        for (int i = 0; i < arrayDiagonal.length; i++) {
            arrayDiagonal[i] = tablero[i][i];
        }
    }

    /**
     * completo el array con los valores de la diagonal empezando por la derecha
     * esta vez
     * 
     * @param diagonal
     * @param tablero
     */
    public static void generoArrayDiagonalDerecho(int[] arrayDiagonal, int[][] tablero) {
        int posicion = arrayDiagonal.length - 1;

        for (int i = 0; i < arrayDiagonal.length; i++) {
            arrayDiagonal[posicion] = tablero[posicion][i];
            posicion--;

        }
    }

    /**
     * muestro array bidimensional
     * 
     * @param tablero
     */
    public static void mostrarArrayBi(int[][] tablero) {
        for (int[] fila : tablero) {
            for (int colu : fila) {
                System.out.print(colu + " ");
            }
            System.out.println();
        }
    }

    /**
     * rellenar array
     * 
     * @param tablero
     */
    public static void rellenarArray(int[][] tablero) {
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int colu = 0; colu < tablero[fila].length; colu++) {
                tablero[fila][colu] = generarAleatorio();
            }

        }
    }

    /**
     * genero aleatorio dentro del los valores del intervalo
     * 
     * @return
     */
    public static int generarAleatorio() {
        int numero = (int) (Math.random() * (FIN + 1 - INI) + INI);
        return numero;
    }
}
