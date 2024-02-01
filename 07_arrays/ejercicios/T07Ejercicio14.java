/*
 * Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. 
 * 
 * @autor Barbara Colomer
 */
//TODO colocar el contenido del main en funciones
//TODO realizar cuadricula
public class T07Ejercicio14 {
    public static final int CANTIDAD = 8;
    public static final String[] COLORES = { "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco",
            "morado" };

    public static void main(String[] args) {
        String[] palabras;
        String[] palabrasOrdenado;
        String[] auxiliar;
        int contador = 0;
        boolean noEsColor = false;
        int contador2 = 0;

        palabras = new String[CANTIDAD];
        palabrasOrdenado = new String[CANTIDAD];
        auxiliar = new String[CANTIDAD];

        // creo un array de palabras introducidas por teclado
        crearArrayPalabras(palabras);

        // recorro un bucle para dividir los colores en un array y lo que no lo son en
        // otro
        for (int i = 0; i < palabras.length; i++) {
            noEsColor = false;
            for (int j = 0; j < COLORES.length; j++) {
                if (palabras[i].equals(COLORES[j])) {
                    palabrasOrdenado[contador] = palabras[i];
                    contador++;
                    noEsColor = true;
                }
            }
            if (noEsColor == false) {
                auxiliar[contador2] = palabras[i];
                contador2++;
            }
        }
        // reinicio el contador, para reutilizarlo
        contador2 = 0;
        // recorro un bucle que empiece donde termino de introducir los colores para
        // agregar el resto
        for (int i = contador; i < palabrasOrdenado.length; i++) {
            palabrasOrdenado[i] = auxiliar[contador2];
            contador2++;
        }
        System.out.println();
        mostrarArray(palabras);
        System.out.println();
        mostrarArray(palabrasOrdenado);
        System.out.println();
        mostrarArray(auxiliar);

    }

    /**
     * muestro un array de cadenas
     * 
     * @param palabras
     */
    public static void mostrarArray(String[] palabras) {
        for (String item : palabras) {
            System.out.print(item + " ");
        }

    }

    /**
     * crear un array de palabras pedidas por teclado
     * 
     * @param palabras
     */
    public static void crearArrayPalabras(String[] palabras) {
        for (int i = 0; i < palabras.length; i++) {
            palabras[i] = pedirPalabra();
        }
    }

    /**
     * pido palabra por teclado
     * 
     * @return
     */
    public static String pedirPalabra() {
        String palabra = "";
        System.out.println("Introduzca palabra y presione intro:");
        palabra = System.console().readLine();
        return palabra;
    }

}
