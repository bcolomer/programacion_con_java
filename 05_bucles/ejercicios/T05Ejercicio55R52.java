
/*
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de izquierda a derecha una posición. El dígito de más a la derecha, pasaría a
dar la vuelta y se colocaría a la izquierda. Si el número tiene un solo dígito, se
queda igual. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio55R52 {
    public static void main(String[] args) {

        long numero = 0;
        long numeroCompuesto = 0;
        int modulo = 0;
        int cantDigitos = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("introduzca un numero");
        numero = s.nextLong();
        s.close();

        cantDigitos = Matematicas.cuentaDigitos(numero);
        numeroCompuesto = Matematicas.quitaDetras(1, numero);
        modulo = (int) numero % 10;
        numeroCompuesto = (modulo * (long) (Math.pow(10, (cantDigitos - 1))) + numeroCompuesto);

        System.out.println("el numero resultado es: " + numeroCompuesto);

    }
}
