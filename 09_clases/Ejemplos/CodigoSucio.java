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
        int m;
        char j;
        String t;
        int x;
        int a;

        try {

            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                m = s.nextInt();

                switch (m) {
                    case 1:
                        do {
                            System.out.print("Escribe un símbolo: ");
                            t = System.console().readLine();

                            System.out.print("Introduce un valor entero positivo:");
                            x = s.nextInt();

                            if (x < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }
                        } while (x < 0);

                        f1(x, t.charAt(0));

                    case 2:
                        System.out.print("Escribe un símbolo: ");
                        t = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        j = t.charAt(0);
                        a = s.nextInt();
                        if (a > 0 && a % 2 != 0) {
                            f2(a, j);
                        } else {
                            System.out.println("El valor debe ser positivo e impar.");
                        }
                        break;

                    case 0:
                        break;

                    default:
                        System.out.println("Opción no válida");
                }

            } while (m != 0);
        } catch (Exception e) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    private static void f1(int r, String x) {
        for (int i = -r; i <= r; i++) {
            for (int j = r; j <= r; j++) {
                if (i * i + j * j <= r * r && i * i + j * j > (r - 2) * (r - 1)) {
                    System.out.printf("%s ", x);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void f2(float a, char w) {
        int e = (int) (a / 2);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i < a / 2) {
                    if (j == e || j == a - e - 1) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == e || j == a - e - 1) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            if (i < a / 2) {
                e--;
            } else {
                e++;
            }
            System.out.println();
        }
    }

}