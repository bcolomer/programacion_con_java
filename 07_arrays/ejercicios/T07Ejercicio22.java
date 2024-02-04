/*
 * Realiza un programa que sea capaz de recolocar los números de un array de fuera
hacia adentro. En primer lugar, el programa pedirá al usuario el tamaño. A
continuación generará un array con esa longitud con números enteros aleatorios entre
0 y 200 ambos incluidos. Seguidamente, el programa irá colocando desde fuera hacia
adentro los números de tal forma que el primero se coloca en la primera posición, el
segundo en la última, el tercero en la segunda, el cuarto en la penúltima, el quinto en
la tercera, en sexto en la antepenúltima, etc. Se debe mostrar por pantalla tanto el
array original como el array resultado. 
 * 
 * @autor Barbara Colomer
 */
public class T07Ejercicio22 {
    public static final int MAXIMO = 200;

    public static void main(String[] args) {
        int[] numeros;
        int[] modificado;
        int longitud = solicitaLongitud();
        numeros = new int[longitud];
        modificado = new int[longitud];

        generoArray(numeros);
        mostrarArray(numeros);
        modificoArray(numeros, modificado);
        System.out.println();
        mostrarArray(modificado);
    }

    /**
     * modifico el array segun instrucciones
     * 
     * @param numeros
     * @param modificado
     */
    public static void modificoArray(int[] numeros, int[] modificado) {
        int contadorpares = 0;
        int contadorimpares = modificado.length - 1;

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                modificado[contadorpares] = numeros[i];
                contadorpares++;
            } else {
                modificado[contadorimpares] = numeros[i];
                contadorimpares--;
            }
        }
    }

    /**
     * muestro array
     * 
     * @param numeros
     */
    public static void mostrarArray(int[] numeros) {
        System.out.println("El array generado es: ");
        for (int item : numeros) {
            System.out.print(item + " ");
        }
    }

    /**
     * genero array
     * 
     * @param numeros
     */
    public static void generoArray(int[] numeros) {
        for (int item = 0; item < numeros.length; item++) {
            numeros[item] = generarAleatorio();
        }
    }

    /**
     * solicito un entero para la longitud del array
     * 
     * @return
     */
    public static int solicitaLongitud() {
        int num;
        System.out.println("Introduzca la logitud del array: ");
        num = Integer.parseInt(System.console().readLine());
        return num;
    }

    /**
     * genero aleatorio
     * 
     * @return
     */
    public static int generarAleatorio() {
        return (int) (Math.random() * (MAXIMO + 1));
    }
}
