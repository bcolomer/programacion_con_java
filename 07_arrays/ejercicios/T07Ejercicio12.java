/*
 * Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante.
Por ejemplo, para inicial = 3 y final = 7:
1 hora para terminar de resolverlo 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio12 {
    public static final int MAXIMO = 9;

    public static void main(String[] args) {
        int[] numeros;
        int[] auxiliar;
        int inicial = 0;
        int finale = 0;

        numeros = new int[10];
        auxiliar = new int[10];

        pedirArray(numeros);

        System.out.println("introduzca dos posiciones de 0 al 9 y la primera tiene que ser menor a la 2da");
        inicial = pedirEnteroIntMenorA(inicial, MAXIMO);
        finale = pedirEnteroMenorAMayorA(finale, MAXIMO, inicial);

        System.out.println("\n El array inicial es :");
        mostrarArray(numeros);

        // creo el array auxiliar desde el principio hasta llegar a la posicion que
        // marca "inicial"
        for (int i = 0; i < inicial + 1; i++) {
            if (i == 0) {
                auxiliar[i] = numeros[numeros.length - 1];
            } else {
                auxiliar[i] = numeros[i - 1];
            }
        }
        // creo el array auxiliar desde la posicion que marca "finale" hasta terminar el
        // array
        for (int i = finale; i < auxiliar.length; i++) {
            if (i == finale) {
                auxiliar[i] = numeros[inicial];
            } else {
                auxiliar[i] = numeros[i - 1];
            }
        }
        // creo en el array auxiliar la parte del array que no va a cambiar
        for (int i = inicial + 1; i < finale; i++) {
            auxiliar[i] = numeros[i];

        }
        System.out.println("\n El array modificado es :");
        mostrarArray(auxiliar);
    }

    /**
     * pide un numero menor al mayor indice del array
     * 
     * @param numero
     * @param menor
     * @return
     */
    public static int pedirEnteroIntMenorA(int numero, int menor) {
        do {

            numero = Integer.parseInt(System.console().readLine());
            if (numero > menor) {
                System.out.println("Error. Introduzca un número entero menor a  " + menor);
            }
        } while (numero > menor);
        return numero;
    }

    /**
     * pide un numero que este entre otros dos numeros
     * 
     * @param numero
     * @param maximo
     * @param incial
     * @return
     */
    public static int pedirEnteroMenorAMayorA(int numero, int maximo, int incial) {
        do {

            numero = Integer.parseInt(System.console().readLine());
            if ((numero > maximo) || (numero < incial)) {
                System.out.printf("Error: Introduzca un numero menor a %d y mayor a %d:", maximo, incial);
            }
        } while ((numero > maximo) || (numero < incial));
        return numero;
    }

    /**
     * crear un array de numeros introducidos por teclado
     * 
     * @param numeros
     */
    public static void pedirArray(int[] numeros) {
        System.out.println("introduzca 10 numeros separados por intro");
        for (int item = 0; item < numeros.length; item++) {
            numeros[item] = Integer.parseInt(System.console().readLine());
        }
        /*
         * for (int item : numeros) {
         * item = Integer.parseInt(System.console().readLine());
         * porque esto no guarda los elemenos en el array?
         * }
         */
    }

    /**
     * muestra el array en pantalla
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }
}
