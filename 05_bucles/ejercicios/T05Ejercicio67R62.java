
/*
 * Realiza un programa que pinte una escalera que va descendiendo de izquierda
a derecha. El programa pedirá el número de escalones y la altura de cada
escalón. La anchura de los escalones siempre es la misma: 4 asteriscos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio67R62 {
    public static void main(String[] args) {

        int altura = 0;
        int cantEscalones = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("introduzca la cantidad de escalones");
        cantEscalones = s.nextInt();
        System.out.println("introduzca la altura para el escalon");
        altura = s.nextInt();
        s.close();

        for (int fila = 0; fila <= cantEscalones; fila++) {
            for (int alturaEscalon = 0; alturaEscalon < altura; alturaEscalon++) {
                for (int impresionEscalon = 0; impresionEscalon < fila; impresionEscalon++) {
                    System.out.print("****");
                }
                System.out.println();
            }
        }
    }
}
