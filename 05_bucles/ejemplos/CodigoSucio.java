
import java.util.Scanner;

/**
 * Práctica código sucio.
 * 
 * @author Antonio J.Sánchez
 * @author José David Quero
 */

public class CodigoSucio {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int opcion;
        char simbChar;
        String simbCadena;
        int numEntPos;
        int numPosImpar;

        try {

            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                opcion = s.nextInt();

                switch (opcion) {
                    case 1:
                        do {
                            System.out.print("Escribe un símbolo: ");
                            simbCadena = System.console().readLine();

                            System.out.print("Introduce un valor entero positivo:");
                            numEntPos = s.nextInt();

                            if (numEntPos < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }
                        } while (numEntPos < 0);

                        nFilasEstrEnMedio(numEntPos, simbCadena);

                    case 2:
                        System.out.print("Escribe un símbolo: ");
                        simbCadena = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        simbChar = simbCadena.charAt(0);
                        numPosImpar = s.nextInt();
                        if (numPosImpar > 0 && numPosImpar % 2 != 0) {
                            f2(numPosImpar, simbChar);
                        } else {
                            System.out.println("El valor debe ser positivo e impar.");
                        }
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcion != 0);
        } catch (Exception e) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    public static void nFilasEstrEnMedio(int numero, String caracter) {
        for (int fila = -numero; fila <= numero; fila++) {// imprime el doble de lineas +1 que el numero dado
            for (int columna = numero; columna <= numero; columna++) {
                System.out.print(columna);
                if ((((fila * fila) + (columna * columna)) <= (numero * numero))
                        && (((fila * fila) + (columna * columna)) > ((numero - 2) * (numero - 1)))) {
                    System.out.printf("%s ", caracter);
                } else {
                    System.out.print("uu");// imprime espacio?
                }
            }
            System.out.println();
        }
    }

    public static void f2(float numero, char w) {
        int medioRombo = (int) (numero / 2);
        for (int fila = 0; fila < numero; fila++) {
            System.out.print(fila);
            for (int columna = 0; columna < numero; columna++) {
                if (fila < numero / 2) {
                    if ((columna == medioRombo) || (columna == (numero - medioRombo - 1))) {
                        System.out.print("a");// imprime simbolo w?
                    } else {
                        System.out.print("8"); // imprime espacio?
                    }
                } else {
                    if ((columna == medioRombo) || (columna == (numero - medioRombo - 1))) {
                        System.out.print("y"); // imprime silbolo w?
                    } else {
                        System.out.print("0");// imprime espacio?
                    }
                }
            }
            if (fila < numero / 2) {
                medioRombo--;
            } else {
                medioRombo++;
            }
            System.out.println();
        }
    }

}