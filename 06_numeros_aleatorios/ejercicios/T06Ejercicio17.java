/*
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
serán de 4 unidades. No hay que comprobar que los datos se introducen
correctamente; podemos suponer que el usuario los introduce bien. Dentro de
la pecera hay que colocar de forma aleatoria un pececito, que puede estar
situado en cualquiera de las posiciones que quedan en el hueco que forma el
rectángulo. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T06Ejercicio17 {
    public static void main(String[] args) {

        int alto = 0;
        int ancho = 0;
        int fila = 0;
        int alturapez = 0;
        int anchopez = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura para la pecera, el minimo es 4");
        alto = s.nextInt();
        System.out.println("Introduzca el ancho para la pecera, el minimo es 4");
        ancho = s.nextInt();
        s.close();
        alturapez = (int) (Math.random() * (alto - 2) + 1); // esto da un aleatorio entre 1 y la altura-1
        anchopez = (int) (Math.random() * (ancho - 2) + 1);

        System.out.println(alturapez);
        System.out.println(anchopez);

        for (fila = 0; fila < alto; fila++) {
            if ((fila == 0) || (fila == alto - 1)) {
                for (int filaSupInf = 0; filaSupInf < ancho; filaSupInf++) {
                    System.out.print("*");
                }

            } else {
                System.out.print("*");
                for (int espaciosinternos = 1; espaciosinternos <= ancho - 2; espaciosinternos++) {
                    if ((fila == alturapez) && (espaciosinternos == anchopez)) {
                        System.out.print("&");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
