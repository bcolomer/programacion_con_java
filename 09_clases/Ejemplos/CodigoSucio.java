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
        int opcionMenu;
        char primerCaracSimb;
        String cadenaTeclado;
        int numeroPos;
        int numeroPosImpar;

        try {

            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                opcionMenu = s.nextInt();

                switch (opcionMenu) {
                    case 1:
                        do {
                            System.out.print("Escribe un símbolo: ");
                            cadenaTeclado = System.console().readLine();

                            System.out.print("Introduce un valor entero positivo:");
                            numeroPos = s.nextInt();

                            if (numeroPos < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }
                        } while (numeroPos < 0);

                        funcion1(numeroPos, cadenaTeclado);
                        break;
                    case 2:
                        System.out.print("Escribe un símbolo: ");
                        cadenaTeclado = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        primerCaracSimb = cadenaTeclado.charAt(0);
                        numeroPosImpar = s.nextInt();
                        if (numeroPosImpar > 0 && numeroPosImpar % 2 != 0) {
                            funcion2(numeroPosImpar, primerCaracSimb);
                        } else {
                            System.out.println("El valor debe ser positivo e impar.");
                        }
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (opcionMenu != 0);
        } catch (Exception e) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    public static void funcion1(int numero, String caracter) {
        for (int fila = -numero; fila <= numero; fila++) {// imprime el doble de lineas +1 que el numero dado
            // System.out.print("fila" + fila);
            for (int columna = numero; columna <= numero; columna++) {
                // System.out.print("columna"+columna);
                if (fila * fila + columna * columna <= numero * numero
                        && fila * fila + columna * columna > (numero - 2) * (numero - 1)) {

                    System.out.printf("%s ", caracter);
                } else {// nunca entra aca?
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void funcion2(int numPositImpar, char simbolo) {

        int mitadNumero = (int) (numPositImpar / 2);
        for (int fila = 0; fila < numPositImpar; fila++) {
            for (int j = 0; j < numPositImpar; j++) {
                if (fila < numPositImpar / 2) {
                    if (j == mitadNumero || j == numPositImpar - mitadNumero - 1) {
                        System.out.print(simbolo);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == mitadNumero || j == numPositImpar - mitadNumero - 1) {
                        System.out.print(simbolo);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (fila < numPositImpar / 2) {
                mitadNumero--;
            } else {
                mitadNumero++;
            }
            System.out.println();
        }
    }

}
