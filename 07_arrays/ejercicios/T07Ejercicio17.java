/*
 * Escribe un programa que muestre por pantalla un array de 10 números enteros
generados al azar entre 0 y 100. A continuación, el programa debe pedir un
número al usuario. Se debe comprobar que el número introducido por teclado
se encuentra dentro del array, en caso contrario se mostrará un mensaje por
pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
correctamente. A continuación, el programa rotará el array hacia la derecha
las veces que haga falta hasta que el número introducido quede situado en la
posición 0 del array. Por último, se mostrará el array rotado por pantalla. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio17 {
    // variable donde se establece el maximo numero para los aleatorios
    public static final int MAXIMO = 100;

    // FIXME no funciona bien en todos los casos, en algunos el ultimo valor lo
    // ignora y repite la seleccion de usuario
    public static void main(String[] args) {
        int[] numeros;
        int[] aux;
        int opcionUsuario = 0;
        boolean numeroEsta = false;
        int posicionNumero = 0;
        // falta que coloque bien el ultimo numero
        numeros = new int[10];
        aux = new int[10];

        crearArrayAleatorio(numeros);
        mostrarArray(numeros);

        do {
            System.out.println("Introduzca un numero:");
            opcionUsuario = Integer.parseInt(System.console().readLine());
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] == opcionUsuario) {
                    numeroEsta = true;
                    posicionNumero = i;
                }
            }
            if (!numeroEsta) {
                System.out.println("El numero introducido no se encuentra dentro de la seleccion.");
            }

        } while (!numeroEsta);
        if (numeroEsta) {

        }
        System.out.println("El nuevo array es: ");
        System.out.println();
        mostrarArray(nuevoarray(numeros, aux, posicionNumero));
    }

    /**
     * crea array de numeros aleatorios
     * 
     * @param numeros
     */
    public static void crearArrayAleatorio(int[] numeros) {
        for (int item = 0; item < numeros.length; item++) {
            numeros[item] = (int) (Math.random() * MAXIMO + 1);

        }
    }

    /**
     * muestra array en pantalla
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }

    /**
     * creo un nuevo array con los numeros rotados
     * 
     * @param primerArray
     * @param segundoArray
     * @param posicion
     */
    public static int[] nuevoarray(int[] primerArray, int[] segundoArray, int posicion) {
        int contador = 0;
        int contador2 = primerArray.length;

        do {
            segundoArray[contador] = primerArray[posicion];
            contador++;
            posicion++;
            if (posicion == primerArray.length - 1) {
                posicion = 0;
            }
            contador2--;
        } while (contador2 > 0);
        return segundoArray;
    }
}
