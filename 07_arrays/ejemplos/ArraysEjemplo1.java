/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */
public class ArraysEjemplo1 {
    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[5];

        numeros[0] = 20;
        numeros[1] = 10;
        numeros[2] = 35;
        numeros[3] = 4;
        numeros[4] = 1;
        System.out.println("los valores del array son los siguientes: ");
        System.out.printf("%d, %d, %d, %d, %d\n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);

        System.out.println(numeros);

    }
}
