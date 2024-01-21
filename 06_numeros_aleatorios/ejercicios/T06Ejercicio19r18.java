/*
 * Escribe un programa que muestre 50 números enteros aleatorios comprendidos
entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra luego
el máximo de los pares el mínimo de los impares y la media de todos los
números generados. 
 * 
 * @autor Barbara Colomer
 */
public class T06Ejercicio19r18 {
    public static void main(String[] args) {
        int aleatorio = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int suma = 0;

        for (int i = 0; i < 50; i++) {
            aleatorio = (int) ((Math.random() * 302 - 1) - 100);
            suma += aleatorio;
            if (aleatorio % 2 == 0) {
                if (aleatorio > max) {
                    max = aleatorio;
                }
            } else {
                if (aleatorio < min) {
                    min = aleatorio;
                }
            }
            System.out.print(aleatorio + " ");
        }
        System.out.println();
        System.out.printf("El mayor numero generado es : %d\n", max);
        System.out.printf("El menor numero generado es : %d\n", min);
        System.out.printf("La media de todos los numeros generados es : %.2f\n", (double) suma / 50);
    }
}