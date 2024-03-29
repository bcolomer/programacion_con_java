/*
 * Realiza un programa que muestre al azar el nombre de una carta de la baraja
francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
1). Para convertir un número en una cadena de caracteres podemos usar
String.valueOf(n). 
 * 
 * @autor Barbara Colomer
 */

public class T06Ejercicio02 {

    public static void main(String[] args) {
        int carta = 0;
        int simbolo = 0;

        carta = (int) (Math.random() * 13 + 1);
        simbolo = (int) (Math.random() * 4 + 1);
        // System.out.println(carta + " " + simbolo);

        switch (carta) {
            case 1:
                System.out.print("A");
                break;
            case 2:
                System.out.print("2");
                break;
            case 3:
                System.out.print("3");
                break;
            case 4:
                System.out.print("4");
                break;
            case 5:
                System.out.print("5");
                break;
            case 6:
                System.out.print("6");
                break;
            case 7:
                System.out.print("7");
                break;
            case 8:
                System.out.print("8");
                break;
            case 9:
                System.out.print("9");
                break;
            case 10:
                System.out.print("10");
                break;
            case 11:
                System.out.print("J");
                break;
            case 12:
                System.out.print("Q");
                break;
            case 13:
                System.out.print("K");
                break;
        }

        switch (simbolo) {
            case 1:
                System.out.print(" de picas");
                break;
            case 2:
                System.out.print(" de corazones");
                break;
            case 3:
                System.out.print(" de diamantes");
                break;
            case 4:
                System.out.print(" de treboles");
                break;
        }

    }
}
