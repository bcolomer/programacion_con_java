/*
 * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200
ambos incluidos y que los almacene en un array. A continuación, el programa
debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el
programa debe colocar de forma alterna y en orden los menores o iguales de
100 y los mayores de 100: primero menor, luego mayor, luego menor, luego
mayor… Cuando se acaben los menores o los mayores, se completará con los
números que queden. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio18 {
    public static final int MAXIMO = 200;
    public static final int ITEMS = 10;

    // TODO realizar la mezcla de los dos arrays
    public static void main(String[] args) {
        int[] numeros;
        int[] menores;
        int[] mayores;

        numeros = new int[ITEMS];
        crearArray(numeros);

        menores = new int[cuentoMenores(numeros)];
        mayores = new int[cuentoMayores(numeros)];

        mostrarArray(numeros);
        rellenoArrays(numeros, menores, mayores);
        System.out.println();
        mostrarArray(menores);
        System.out.println();
        mostrarArray(mayores);

    }

    /**
     * relleno arrays con los mayores y los menores de 100 de un array dado
     * 
     * @param numeros
     * @param menores
     * @param mayores
     */
    public static void rellenoArrays(int[] numeros, int[] menores, int[] mayores) {
        int contMenor = 0;
        int contMayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 100) {
                menores[contMenor] = numeros[i];
                contMenor++;
            } else {
                mayores[contMayor] = numeros[i];
                contMayor++;
            }
        }
    }

    /**
     * cuento la cantidad de items mayores a 100
     * 
     * @param numeros
     * @return
     */
    public static int cuentoMayores(int[] numeros) {
        int contador = 0;
        for (int item : numeros) {
            if (item > 100) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * cuento la cantidad de items menores a 100
     * 
     * @param numeros
     * @return
     */
    public static int cuentoMenores(int[] numeros) {
        int contador = 0;
        for (int item : numeros) {
            if (item <= 100) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * creo array de numeros aleatorios
     * 
     * @param numeros
     */
    public static void crearArray(int[] numeros) {
        for (int item = 0; item < numeros.length; item++) {
            numeros[item] = generarAleatorio();

        }
    }

    /**
     * muestro array
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }

    /**
     * genero numero aleatorio de cero a un numero dado por la variable maximo
     * 
     * @return
     */
    public static int generarAleatorio() {
        int numero = (int) (Math.random() * (MAXIMO + 1));
        return numero;
    }
}
