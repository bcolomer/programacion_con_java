/*
 * Modifica el programa anterior de tal forma que los números que se introducen
en el array se generen de forma aleatoria (valores entre 100 y 999). 
 * 
 * @autor Barbara Colomer
 */

public class T072Ejercicio03R25 {
    public static void main(String[] args) {
        int[][] numeros;
        numeros = new int[4][5];

        // crearArray(numeros);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = (int) (Math.random() * 1100) + 100;
            }
        }
        System.out.println();
        // TODO COMPLETAR EL ANTERIOR Y REALIZAR ESTE
        System.out.printf("\033[H\033[2J");
        System.out.flush();
        mostrarArray(numeros);
        System.out.println();
        for (int i = 0; i <= numeros.length; i++) {
            for (int j = 0; j <= numeros[i].length; j++) {
                if (i == numeros[i].length) {
                    System.out.print(sumarColumnas(numeros, j) + " ");
                    // } else if (j == numeros[i].length) {
                    // System.out.print(sumarFilas(numeros, i) + " ");
                } else {
                    System.out.print(" j:" + j + " " + numeros[i][j]);
                }
            }
            System.out.println();
        }
        // System.out.println("fila 0 : " + sumarFilas(numeros, 0));
        // System.out.println("fila 1 : " + sumarFilas(numeros, 1));
        // System.out.println("fila 2 : " + sumarFilas(numeros, 2));
        // System.out.println("fila 3 : " + sumarFilas(numeros, 3));
        // System.out.println("Columna 0 : " + sumarColumnas(numeros, 0));
        // System.out.println("Columna 1 : " + sumarColumnas(numeros, 1));
        // System.out.println("Columna 2 : " + sumarColumnas(numeros, 2));
        // System.out.println("Columna 3 : " + sumarColumnas(numeros, 3));
        // System.out.println("Columna 4 : " + sumarColumnas(numeros, 4));

    }

    /**
     * suma las filas del array
     * 
     * @param numeros
     * @param control
     * @return
     */
    public static int sumarFilas(int[][] numeros, int control) {
        int suma = 0;
        control = 0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                if (fila == control) {
                    suma += numeros[fila][columna];

                }
            }
        }
        return suma;
    }

    /**
     * suma las columnas verticales de un array
     * 
     * @param numeros
     * @param control
     * @return
     */
    public static int sumarColumnas(int[][] numeros, int control) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                if (j == control) {
                    suma += numeros[i][j];

                }
            }

        }
        return suma;
    }

    /**
     * crear array con numeros introducidos por teclado
     * 
     * @param numeros
     */
    public static void crearArray(int[][] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Introduce un numero entero");
                numeros[i][j] = Integer.parseInt(System.console().readLine());
            }
        }

    }

    /**
     * mostrar array
     * 
     * @param numeros
     */
    public static void mostrarArray(int[][] numeros) {
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int columna = 0; columna < numeros[fila].length; columna++) {
                System.out.print(numeros[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    /**
     * mostrar array con las filas y las columnas sumadas
     * 
     * @param numeros
     */
    public static void mostrarArraySumado(int[][] numeros) {
        for (int fila = 0; fila <= numeros.length; fila++) {

            for (int columna = 0; columna <= numeros[fila].length; columna++) {
                if (columna == numeros[fila].length) {
                    System.out.print(sumarColumnas(numeros, columna));
                }
            }
        }
        System.out.println();
    }

    // System.out.println("fila 1 : " + sumarFilas(numeros, 1));"\u2211"
    // System.out.println("fila 2 : " + sumarFilas(numeros, 2));
    // System.out.println("fila 3 : " + sumarFilas(numeros, 3));
    // System.out.println("Columna 0 : " + sumarColumnas(numeros, 0));
    // System.out.println("Columna 1 : " + sumarColumnas(numeros, 1));
    // System.out.println("Columna 2 : " + sumarColumnas(numeros, 2));
    // System.out.println("Columna 3 : " + sumarColumnas(numeros, 3));
    // System.out.println("Columna 4 : " + sumarColumnas(numeros, 4));

}
