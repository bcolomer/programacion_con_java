/*
 * Escribe un programa que rellene un array de 20 elementos con números enteros
aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación el
programa mostrará el array y preguntará si el usuario quiere resaltar los
múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el array
escribiendo los números que se quieren resaltar entre corchetes. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio16 {
    public static final int MAXIMO = 400;

    public static void main(String[] args) {
        int[] numeros;
        int opcion = 0;
        int numControl = 0;
        numeros = new int[20];

        crearArray(numeros);
        System.out.println("Este es el listado de numeros: ");
        mostrarArray(numeros);
        System.out.println();

        System.out.println("desea resaltar \n 1- los multiplos de 5\n 2- los multiplos de 7\n");

        try {
            opcion = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: no ha introducido un numero");
        }

        if (opcion == 1) {
            numControl = 5;
            mostrarArrayModificado(numeros, numControl);

        } else if (opcion == 02) {
            numControl = 7;
            mostrarArrayModificado(numeros, numControl);

        } else {
            System.out.println("La opcion indicada no es válida.");
        }
    }

    /**
     * muestra array modificado cuando el numero dentro del array es multiplo de un
     * numero de control
     * 
     * @param numeros
     * @param numControl
     */
    public static void mostrarArrayModificado(int[] numeros, int numControl) {
        for (int i = 0; i < numeros.length; i++) {
            if (multiplos(numeros[i], numControl) == true) {
                System.out.print("[" + numeros[i] + "] ");
            } else {
                System.out.print(numeros[i] + " ");
            }
        }
    }

    /**
     * muestra array en pantalla separado por espacios
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }

    /**
     * creo array con numeros aleatorios
     * 
     * @param numeros
     */
    public static void crearArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeroAleatorio();
        }
    }

    /**
     * creo numero aleatorio hasta el maximo de la variable de entrada
     * 
     * @return
     */
    public static int numeroAleatorio() {
        return (int) (Math.random() * (MAXIMO + 1));
    }

    /**
     * devuelve verdadero si un numero es multiplo de otro dado
     * 
     * @param numero
     * @param numControl
     * @return
     */
    public static boolean multiplos(int numero, int numControl) {
        boolean multiplo = false;
        if (numero % numControl == 0) {
            multiplo = true;
        }
        return multiplo;
    }
}
