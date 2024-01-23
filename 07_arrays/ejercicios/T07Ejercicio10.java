/*
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario. 
 * 
 * @autor Barbara Colomer
 */

public class T07Ejercicio10 {
    public static void main(String[] args) {
        int[] numeros;
        int[] arrayAux;
        int aleatorio = 0;
        int contpar = 0;
        int auxiliarPar = 0;
        int auxiliarImpar = 0;

        numeros = new int[20];
        arrayAux = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            aleatorio = (int) (Math.random() * 101);
            numeros[i] = aleatorio;
            if (aleatorio % 2 == 0) {
                contpar++;
            }
        }
        auxiliarImpar = contpar;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                arrayAux[auxiliarPar] = numeros[i];
                auxiliarPar++;
            } else {
                arrayAux[auxiliarImpar] = numeros[i];
                auxiliarImpar++;
            }
        }

        System.out.println("array de numeros:");
        for (int i = 0; i < arrayAux.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.println("array ordenado con los numeros pares primero:");

        for (int i = 0; i < arrayAux.length; i++) {
            System.out.print(arrayAux[i] + " ");
        }

    }
}