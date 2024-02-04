
/*
 * codigo 
 * 
 * @autor Barbara Colomer
 */ import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int M;
        try {
            char j;
            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                M = s.nextInt();
                String t;
                switch (M) {
                    case 1:
                        int x;
                        do {
                            System.out.print("Escribe un símbolo: ");
                            t = s.next();
                            System.out.print("Introduce un valor entero positivo:");
                            x = s.nextInt();
                            if (x < 0) {
                                System.out.println("El valor debe ser un número igual o mayor a cero.");
                            }
                        } while (x < 0);
                        f1(x, t.charAt(0)); // Corregido: añadida coma para separar los argumentos
                        break; // Agregado el break para salir del case
                    case 2:
                        System.out.print("Escribe un símbolo: ");
                        t = s.next();
                        System.out.println("Introduce un valor positivo e impar:");
                        j = t.charAt(0);
                        int a = s.nextInt();
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
            } while (M != 0);
        } catch (Exception e) {
            System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
            s.close();
        }
    }

    private static void f1(int r, char x) { // Corregido: parámetro String a char
        for (int i = -r; i <= r; i++) {
            for (int j = -r; j <= r; j++) { // Corregido: inicialización de j a -r
                if (i * i + j * j <= r * r && i * i + j * j > (r - 2) * (r - 1)) {
                    System.out.printf("%c ", x); // Corregido: formato para imprimir char
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    private static void f2(int a, char w) { // Corregido: parámetro float a int
        int e = a / 2;
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