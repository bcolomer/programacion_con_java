
/*
 * Realiza un programa que pinte dos pirámides rellenas hechas con asteriscos,
una al lado de la otra y separadas por un espacio en su base. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio63R59 {
    public static void main(String[] args) {

        int alturaPiramideA = 0;
        int alturaPiramideB = 0;
        int altura = 0;
        int diferencia = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("introduzca la altura de la 1era piramide");
        alturaPiramideA = s.nextInt();
        System.out.println("introduzca la altura de la 2da piramide");
        alturaPiramideB = s.nextInt();
        s.close();
        diferencia = Math.abs(alturaPiramideA - alturaPiramideB);
        System.out.println(diferencia);
        if (alturaPiramideA > alturaPiramideB) {
            altura = alturaPiramideA;
        } else {
            altura = alturaPiramideB;
        }

        if (altura == alturaPiramideA) {
            for (int fila = 0; fila < altura; fila++) {
                System.out.print(fila + " ");
                for (int espaciosIzq = altura + 1 - fila; espaciosIzq > 0; espaciosIzq--) {
                    // System.out.print(espaciosIzq);
                    System.out.print(" ");
                }
                for (int estrella = 0; estrella < (fila * 2) + 1; estrella++) {
                    System.out.print("*");

                }
                for (int espaciosCentro = altura - fila; espaciosCentro > 0; espaciosCentro--) {

                    System.out.print("-");

                }
                for (int espaciosCentro = altura - fila - 1; espaciosCentro > 0; espaciosCentro--) {

                    System.out.print("-");

                }
                if (diferencia <= fila) {
                    for (int estrella = 0; estrella < 1; estrella++) {
                        System.out.print("a");

                    }
                }

                System.out.println();
            }
        }
    }
}

/*
 * // si la 1era es la mas grande
 * if (altura == alturaPiramideA) {
 * for (int fila = 0; fila < altura; fila++) {
 * // System.out.print(fila);
 * // imprime espacios de la izquierda
 * for (int espIzquierdos = altura - fila; espIzquierdos >= 1; espIzquierdos--)
 * {
 * System.out.print(" ");
 * }
 * // imprimo la primer piramide
 * 
 * // imprimo los espacios entre piramides
 * for (int i = (altura * 2) - (fila * 2) - 1; i > 0; i--) {
 * System.out.print(" ");
 * }
 * // comienzo a imprimir la 2da piramide cuando el numero de fila sera la
 * // diferencia entre ambas piramides
 * 
 * if (fila >= (alturaPiramideA - alturaPiramideB)) {
 * // imprimo la 1era mitad de la piramide
 * for (int estrella = 0; estrella < fila - 1; estrella++) {
 * System.out.print("c");
 * }
 * 
 * }
 * // imprimo la 2da mitad de la piramide empizando una fila por debajo que la
 * // primera mitad
 * if (fila >= (alturaPiramideA - alturaPiramideB) + 1) {
 * for (int estrella = 0; estrella < fila - 2; estrella++) {
 * System.out.print("r");
 * }
 * }
 * System.out.println();
 * 
 * }
 * 
 * } else {
 * }
 */
cxvzcv