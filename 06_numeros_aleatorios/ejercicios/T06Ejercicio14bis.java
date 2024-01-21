
/*
* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
programa intentará adivinar el número que estás pensando - un número entre 0
y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
debe preguntar si el número que estás pensando es mayor o menor que el que
te acaba de decir. 
* 
* @autor Barbara Colomer
*/
import java.util.Scanner;

public class T06Ejercicio14bis {
    // public static void main(String[] args) {
    // int opcion = 0;
    // int random = 0;
    // int numeroFinal = 101;
    // int numeroInicial = 0;
    // String respuesta = "";
    // Scanner s = new Scanner(System.in);
    // System.out.println("Piensa en un numero del 0 al 100");

    // do {
    // System.out.println("el numero final es:" + numeroFinal);
    // System.out.println("el numero inicial es " + numeroInicial);
    // random = (int) (Math.random() * numeroFinal + numeroInicial);
    // System.out.printf("El numero que estas pensando es : %d ?\n", random);
    // System.out.println("Responde si mi numero es mayor, menor o igual al que
    // estas pensando");
    // respuesta = s.nextLine();
    // if (respuesta.equals("mayor")) {
    // numeroFinal = numeroFinal - random + 1;
    // numeroInicial = random + 1;
    // } else if (respuesta.equals("menor")) {
    // numeroFinal = random;

    // } else if (respuesta.equals("igual")) {
    // System.out.println("Bien! He ganado!!!!");
    // }

    // } while (!respuesta.equals("igual"));
    // s.close();
    // }

    public static final int MAXIMO = 10;
    public static final String BORRAR = "\033[H\033[2J";

    public static void main(String[] args) {
        int intentos = 15;
        int numero = 0;
        int opcion = 0;
        int min = 0;
        int max = MAXIMO + 1;

        System.out.println("piensa un numero");
        System.out.println("pulsa intro cuando estes listo");
        System.console().readLine();
        do {

            System.out.println(BORRAR);
            System.out.println("desde " + min + " hasta" + max);
            numero = aleatorio(min, max);
            // numero = (int) (Math.random() * max);

            System.out.println("es el numero ?:" + numero);

            System.out.println("El numero que estas pensando es mayor(1), menor(2), el mismo (3)");
            opcion = Integer.parseInt(System.console().readLine());
            intentos--;
            switch (opcion) {
                case 1:
                    System.out.println("has elegido mayor");
                    min = numero + 1;
                    break;
                case 2:
                    max = numero;
                    System.out.println("has elegido menor");
                    break;
                case 3:
                    System.out.println("He acertado");
                    break;
            }
        } while ((intentos > 0) && (opcion != 3));

    }

    public static int aleatorio(int a, int b) {
        b = b - a + 1;//
        return (int) (Math.random() * b) + a;
    }

}
// teniendo 15 intentos, del 0 al 10 (para ver los errores mas rapido) eligiendo
// como numero a adivinar el 5, las opciones que dio el ordenador fueron :
// 10.8.8.2.7.6.8.4.6.8
