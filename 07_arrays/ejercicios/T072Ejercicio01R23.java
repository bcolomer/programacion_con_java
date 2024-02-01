
/*
 * Define un array de números enteros de 3 filas por 6 columnas con nombre num
y asigna los valores según la siguiente tabla. Muestra el contenido de todos
los elementos del array dispuestos en forma de tabla como se muestra en la
figura. 
 * 
 * @autor Barbara Colomer
*/
public class T072Ejercicio01R23 {
    public static void main(String[] args) {

        int[][] num;
        num = new int[3][6];

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 5;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        mostrarArray(num);
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.println(i);
        }

    }

    public static void mostrarArray(int[][] numeros) {
        int contador = 0;
        System.out.print("Array Num ");
        for (int i = 0; i < 6; i++) {
            System.out.print("Columna " + i + "   ");
        }
        System.out.println();
        for (int[] fila : numeros) {
            System.out.print("  fila  " + contador + "     ");
            contador++;
            for (int columna : fila) {
                System.out.print(" " + columna + "          ");
                // System.out.print( + );
            }
            System.out.println();
        }

    }
}
