/*
 * Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
aleatorio. La cabeza se representará con el carácter @ y se debe colocar
exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
el cuerpo irá serpenteando de la siguiente manera: se generará de forma
aleatoria un valor entre tres posibles que hará que el siguiente carácter se
coloque una posición a la izquierda del anterior, alineado con el anterior o una
posición a la derecha del anterior. La longitud de la serpiente se pedirá por
teclado y se supone que el usuario introducirá un dato correcto. 
 * 
 * @autor Barbara Colomer
 */

import java.util.Scanner;

public class T06Ejercicio22Serpiente {
    public static void main(String[] args) {
        int altura = 0;
        int random = 0;
        int cuerpo = 12;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca la altura para la serpiente");
        altura = s.nextInt();
        s.close();
        for (int i = 0; i < 12; i++) {
            System.out.print(" ");
        }
        System.out.println("@");
        for (int i = 0; i <= altura - 1; i++) {
            random = (int) (Math.random() * 3 + 1);
            if (random == 1) {
                cuerpo--;
            }
            if (random == 3) {
                cuerpo++;
            }
            for (int j = 0; j < cuerpo; j++) {

                System.out.print(" ");
            }

            System.out.print("*");

            System.out.println();
        }
    }
}
