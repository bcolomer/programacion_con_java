/*
 * Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo. 
 * 
 * @autor Barbara Colomer
 */
//FIXME corregir el que te del el minimo y el maximo en lugar de que lo marque 
public class T072Ejercicio05R27 {
    // establece el limite maximo para los aleatorios del array
    public static final int MAXIMO = 1000;

    public static void main(String[] args) {

        int[][] numeros;
        numeros = new int[6][10];

        rellenarArray(numeros);
        mostrarArray(numeros);
        System.out.println();
        mostrarArrayModificado(numeros);
        System.out.println();
        System.out.println(mostrarMinimo(numeros));
        System.out.println(mostrarMaximo(numeros));

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

    public static String mostrarMinimo(int[][] numeros) {
        String minimo = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == minNumero(numeros)) {
                    minimo = "El valor minimo esta en la fila " + (i + 1) + " y en la columna " + (j + 1);
                }
            }
        }
        return minimo;
    }

    public static String mostrarMaximo(int[][] numeros) {
        String maximo = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (numeros[i][j] == maxNumero(numeros)) {
                    maximo = "El valor maximo esta en la fila " + (i + 1) + " y en la columna " + (j + 1);
                }
            }
        }
        return maximo;
    }
}
