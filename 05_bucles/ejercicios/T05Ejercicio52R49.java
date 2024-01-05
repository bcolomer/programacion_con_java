
/*
 * Realiza un programa que sea capaz de desplazar todos los dígitos de un número
de derecha a izquierda una posición. El dígito de más a la izquierda, pasaría a
dar la vuelta y se colocaría a la derecha. Si el número tiene un solo dígito, se
queda igual. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio52R49 {
    public static void main(String[] args) {
        long numerocompuesto = 0;
        long numero = 0;
        long numeroAgregado = 0;
        int cantDigitos = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = s.nextLong();
        s.close();

        // cuento la cantidad de digitos que tiene el numero
        cantDigitos = Matematicas.cuentaDigitos(numero);

        // controlo que si es solo un digito que lo muestre directamente
        if (Matematicas.cuentaDigitos(numero) <= 1) {
            System.out.println("el numero resultante es : " + numero);

            // si tiene mas de un digito:
        } else {
            // le quito 1 numero por delante al numero:
            numerocompuesto = Matematicas.quitaDelante(1, numero);

            // obtengo el numero que he quitado arriba dividiendo el numero 10 elevado a la
            // cantidad de digitos menos 1
            numeroAgregado = numero / ((long) Math.pow(10, (cantDigitos - 1)));

            // agrego el numero obtenido de la operacion anterior al final
            numerocompuesto = (numerocompuesto * 10) + numeroAgregado;

            System.out.println("el numero resultante es: " + numerocompuesto);

        }
    }
}