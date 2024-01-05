
/*
 * Una empresa de cartelería nos ha encargado un programa para realizar uno de
sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
durante el 2018, han recibido muchos pedidos del cartel que muestra el número
155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
usuario se le pedirán dos datos, la altura del cartel y el número de espacios
que habrá entre los números. La altura mínima es 5. La anchura de los números
siempre es la misma. La parte superior de los cincos también es siempre igual.
La parte inferior del 5 sí que varía en función de la altura. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio50R47 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int altura = 0;
        int espaciado = 0;

        System.out.println("introduzca la altura de los numeros, debe ser mayor a 5:");
        altura = pedirEnteroIntMayorA(s, altura, 5);
        System.out.println("Introduzca el espaciado de los numeros, debe ser numero entero positivo:");
        espaciado = pedirEnteroIntMayorA(s, espaciado, 1);
        s.close();

        System.out.println(lineaPrincipal(espaciado));
        System.out.println(lineaSegunda(espaciado));
        System.out.println(lineaPrincipal(espaciado));
        for (int i = 0; i < altura - 4; i++) {
            System.out.println(lineaCuarta(espaciado));
        }
        System.out.println(lineaPrincipal(espaciado));
    }

    /**
     * funcion para imprimir las filas primera, ultima y de en medio
     * 
     * @param espaciado
     * @return
     */
    public static String lineaPrincipal(int espaciado) {
        String linea = "";
        linea += "*";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "****";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "****";
        return linea;
    }

    /**
     * funcion para imprimir la 2da fila
     * 
     * @param espaciado
     * @return
     */
    public static String lineaSegunda(int espaciado) {
        String linea = "";
        linea += "*";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "*   ";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "*   ";
        return linea;
    }

    /**
     * funcion para imprimir la 4ta fila
     * 
     * @param espaciado
     * @return
     */
    public static String lineaCuarta(int espaciado) {
        String linea = "";
        linea += "*";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "   *";
        for (int j = 0; j < espaciado; j++) {
            linea += " ";
        }
        linea += "   *";
        return linea;
    }

    /**
     * funcion para pedir un int numero entero positivo mayor a un numero dado
     * 
     * @param numero
     * @param mayor
     * @return
     */
    public static int pedirEnteroIntMayorA(Scanner s, int numero, int mayor) {
        do {
            while (!s.hasNextInt()) {
                System.out.println("Error. Introduzca un número entero mayor a " + mayor);
                s.next(); // Limpiar el buffer de teclado
            }
            numero = s.nextInt();
            if (numero < mayor) {
                System.out.println("Error. Introduzca un número entero mayor a " + mayor);
            }
        } while (numero < mayor);
        return numero;
    }

}
