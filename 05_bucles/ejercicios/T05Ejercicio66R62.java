/*
 * La Guardia Civil de Tráfico nos ha encargado un programa que pinte una señal
para desviar el tráfico hacia la derecha. La señal es una doble flecha con el
vértice apuntando a la derecha. Se pide al usuario la altura de la figura, que
debe ser un número impar mayor o igual que 3. La distancia entre cada flecha
de asteriscos es siempre de 4 espacios. Si la altura introducida por el usuario
no es un número impar mayor o igual que 3, el programa debe mostrar un
mensaje de error. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T05Ejercicio66R62 {
    public static void main(String[] args) {

        int altura = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca altura: Numero impar mayor o igual a 3");
        altura = s.nextInt();
        s.close();
        if ((altura < 3) || (altura % 2 == 0)) {
            System.out.println("La altura no es correcta, debe ser un número impar mayor o igual que 3.");
        } else {
            // mitad superior
            for (int filaA = 0; filaA < altura / 2 + 1; filaA++) {
                // imprimir espacios:
                for (int espacios = 0; espacios < filaA; espacios++) {
                    System.out.print(" ");
                }
                // imprimir estrellas
                System.out.print("*    *");
                System.out.println();
            }
            // mitad inferior
            for (int filaB = altura / 2; filaB > 0; filaB--) {
                // imprimir espacios:
                for (int espacios = 0; espacios < filaB - 1; espacios++) {
                    System.out.print(" ");
                }
                // imprimir estrellas
                System.out.print("*    *");
                System.out.println();
            }
        }
    }
}
