/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */

public class ArraysEjemplo2 {
    public static void main(String[] args) {
        int[] numeros = { -5, 6, 8, 10, 9, 5, 3, 1, 0, 10 };

        for (int j = 0; j < numeros.length; j++) {
            System.out.printf("%d  ", numeros[j]);
        }
        System.out.println("---");
        for (int i : numeros) {
            System.out.printf("%d  ", i);

        }
    }

}
