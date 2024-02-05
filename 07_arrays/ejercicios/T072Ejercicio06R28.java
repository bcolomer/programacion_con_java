public class T072Ejercicio06R28 {
    /*
     * Modifica el programa anterior de tal forma que no se repita ningún número en
     * el array.
     * 
     * @autor Barbara Colomer
     */

    // establece el limite maximo para los aleatorios del array
    public static final int MAXIMO = 70;

    // FIXME corregir que no repita numeros
    public static void main(String[] args) {

        int[][] numeros;
        numeros = new int[6][10];
        rellenarArrayDiferente(numeros);
        System.out.println();
        // mostrarArrayModificado(numeros);
        mostrarArray(numeros);

    }

    /**
     * crea un array con numeros aleatorios entre 0 y el valor dado por MAXIMO
     * 
     * @param numeros
     */
    public static void rellenarArray(int[][] numeros) {
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {

                numeros[fila][columna] = (int) (Math.random() * (MAXIMO + 1));
            }
        }
    }

    /**
     * crea un array con numeros aleatorios entre 0 y el valor dado por MAXIMO
     * sin repetir ningun numero
     * 
     * @param numeros
     */
    public static void rellenarArrayDiferente(int[][] numeros) {
        int[] arrayAux;
        int contador = 0;
        int aleatorio = 0;
        arrayAux = new int[contarPosicionesArray(numeros)];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                aleatorio = (int) (Math.random() * (MAXIMO + 1));
                arrayAux[contador] = aleatorio;
                for (int valor : arrayAux) {
                    if (aleatorio == valor) {

                    }
                }
                // numeros[i][j] = (int) (Math.random() * (MAXIMO + 1));
                // arrayAux[contador] = numeros[i][j];
                // if (numeroExiste(arrayAux, numeros[i][j])) {
                // numeros[i][j] = (int) (Math.random() * (MAXIMO + 1));
                // }
                contador++;
            }
        }
    }

    /**
     * comprueba si un numero esta o no en un array de numeros
     * 
     * @param array
     * @param numero
     * @return
     */
    public static boolean numeroExiste(int[] array, int numero) {
        boolean encontrado = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * cuenta la cantidad de posiciones totales en un array bidimensional
     * 
     * @param numeros
     * @return
     */
    public static int contarPosicionesArray(int[][] numeros) {
        int contador = 0;
        for (int[] filas : numeros) {
            for (int columnas : filas) {
                contador++;
            }

        }
        return contador;
    }

    /**
     * devuelve el numero mayor de un array dado
     * 
     * @param numeros
     * @return
     */
    public static int maxNumero(int[][] numeros) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (max < numeros[i][j]) {
                    max = numeros[i][j];
                }
            }
        }
        return max;
    }

    /**
     * devuelve el numero menor de un array dado
     * 
     * @param numeros
     * @return
     */
    public static int minNumero(int[][] numeros) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (min > numeros[i][j]) {
                    min = numeros[i][j];
                }
            }
        }
        return min;
    }

    /**
     * muestra array
     * 
     * @param numeros
     */
    public static void mostrarArray(int[][] numeros) {
        for (int[] fila : numeros) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }

    /**
     * muestra array modificado con el maximo y el minimo
     * 
     * @param numeros
     */
    public static void mostrarArrayModificado(int[][] numeros) {
        for (int[] fila : numeros) {
            for (int columna : fila) {
                if (columna == minNumero(numeros)) {
                    System.out.print("min \"" + columna + "\" ");
                } else if (columna == maxNumero(numeros)) {
                    System.out.print("max \"" + columna + "\" ");
                } else {
                    System.out.print(columna + " ");
                }
            }
            System.out.println();
        }
    }
}
