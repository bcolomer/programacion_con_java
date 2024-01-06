
/*
 * Escribe un programa que pinte por pantalla un árbol de navidad. El usuario debe
introducir la altura. En esa altura va incluida la estrella y el tronco. Suponemos
que el usuario introduce una altura mayor o igual a 4. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio59R56 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int alturaTotal = 0;

        System.out.println("Introduzca la altura para el arbol de navidad, debe ser mayor a 4");
        alturaTotal = Matematicas.pedirEnteroIntMayorA(s, alturaTotal, 4);
        s.close();

        int alturaArbol = alturaTotal - 4;
        for (int i = 0; i < alturaArbol + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < alturaArbol + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("^");
        // imprime la parte media del arbol de navidad:
        for (int fila = 0; fila < alturaArbol; fila++) {
            for (int espacio = 0; espacio < alturaArbol - fila; espacio++) {// imprime espacios de la izq
                System.out.print(" ");
            }
            // System.out.print(fila);
            System.out.print("^");// imprime el lado izquierdo
            for (int espacio = 0; espacio < (fila * 2) + 1; espacio++) {// imprime espacios dentro del arbol
                System.out.print(" ");
            }
            System.out.print("^");// imprime lado derecho
            System.out.println();// salto de linea

        }
        // imprime la base del arbol
        for (int base = 0; base < 3 + (alturaArbol * 2); base++) {
            System.out.print("^");
        }

        System.out.println();
        for (int i = 0; i < alturaArbol + 1; i++) {
            System.out.print(" ");// espacios antes del tronco
        }
        System.out.println("Y");// imprime tronco
    }

}
