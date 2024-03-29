/*
 * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
cuadrado se deben almacenar los cuadrados de los valores que hay en el array
numero. En el array cubo se deben almacenar los cubos de los valores que hay en
numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
columnas. 
 * 
 * @autor Barbara Colomer
 */

public class T07Ejercicio04 {
    public static void main(String[] args) {
        int[] numero;
        int[] cuadrado;
        int[] cubo;

        numero = new int[20];
        cuadrado = new int[20];
        cubo = new int[20];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 101);
        }
        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = (int) Math.pow(numero[i], 3);

        }
        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = (int) Math.pow(numero[i], 2);
        }
        System.out.printf("%-10s %-10s %-10s\n", "numero", "cuadrado", "cubo");
        for (int i = 0; i < numero.length; i++) {
            System.out.printf("%-10d %-10d %-10d", numero[i], cuadrado[i], cubo[i]);
            System.out.println();
        }

    }
}
