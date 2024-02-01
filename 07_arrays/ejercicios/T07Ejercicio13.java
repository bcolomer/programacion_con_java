/*
 * Escribe un programa que rellene un array de 100 elementos con números enteros
aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio13 {
    // establezco el limite maximo para aleatorio en 500
    public static final int MAXIMO = 501;

    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[100];
        int opcion = 0;

        // creo un array con numeros aleatorios
        crearArray(numeros, opcion);

        // muestro el array
        mostrarArray(numeros);

        // solicito opcion para que elija si quiere entrecomillar el mayor o menor
        opcion = solicitarOpcion(opcion);

        // busco y guardo en variable el numero obtenido segun la opcion elegida
        opcion = indicarMaximoMinimo(numeros, opcion);

        // muestro array con el numero entrecomillado
        mostrarArrayOpcionSeñalada(numeros, opcion);

    }

    /**
     * obtener un numero aleatorio de un maximo de numeros indicado por parametro
     * 
     * @param numeroMaximo
     * @return
     */
    public static int obtenerAleatorio(int numeroMaximo) {
        int numero = (int) (Math.random() * numeroMaximo);
        return numero;
    }

    /**
     * creo un array de cantidad indicada por la constante maximo
     * 
     * @param numeros
     * @param numero
     */
    public static void crearArray(int[] numeros, int numero) {
        for (int index = 0; index < numeros.length; index++) {
            numeros[index] = obtenerAleatorio(MAXIMO);
        }

    }

    /**
     * muestro array
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        for (int elemento : numeros) {
            System.out.print(elemento + " ");
        }
    }

    /**
     * devuleve el maximo o el minimo segun opcion
     * 
     * @param numeros
     * @param opcion
     * @return
     */
    public static int indicarMaximoMinimo(int[] numeros, int opcion) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int elemento = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        if (opcion == 1) {
            elemento = min;
        } else {
            elemento = max;
        }

        // devulevo elemento que ya tendra el valor mayor o menor segun la opcion del
        // parametro
        return elemento; // opcion == 1 ? min : max

    }

    /**
     * pedir respuesta 1 o 2
     * 
     * @param opcion
     * @return
     */
    public static int solicitarOpcion(int opcion) {
        System.out.println();
        System.out.println("¿Que desea destacar? ");
        try {

            do {
                System.out.println("\n1- minimo \n2- maximo");
                System.out.println("Ingrese opcion valida: ");
                opcion = Integer.parseInt(System.console().readLine());
            } while ((opcion >= 3) || (opcion <= 0));
        } catch (NumberFormatException e) {
            System.out.println("Ha introducido valores invalidos. Reinicie el programa");
        }

        return opcion;
    }

    /**
     * muestro array con un elemento entrecomillado
     * 
     * @param numeros
     * @param opcion
     */
    public static void mostrarArrayOpcionSeñalada(int[] numeros, int opcion) {
        for (int elemento : numeros) {
            if (elemento == opcion) {
                System.out.print("\"\"" + elemento + "\"\" ");
            } else {
                System.out.print(elemento + " ");
            }
        }
    }
}