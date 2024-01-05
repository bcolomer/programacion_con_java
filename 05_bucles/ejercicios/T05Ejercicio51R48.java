
/*
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
(todos los que encuentre). Realiza un programa que muestre un número antes
y después de haber sido comido por el gusano. Si el animalito no se ha comido
ningún dígito, el programa debe indicarlo. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio51R48 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        long numero = 0;
        long volteado = 0;

        System.out.println("Introduzca un numero entero mayor a cero");
        numero = Matematicas.pedirEnteroLongMayorA(s, numero, 0);
        s.close();

        volteado = Matematicas.voltea(numero);

        int modulo = 0;
        long componer = 0;

        do {
            modulo = (int) volteado % 10;
            volteado = volteado / 10;
            if ((modulo != 0) && (modulo != 8)) {
                componer = (componer * 10) + modulo;
            }
        } while (volteado > 0);

        if (Matematicas.cuentaDigitos(numero) > (Matematicas.cuentaDigitos(componer))) {
            System.out.printf(
                    "Después de haber sido comido por el gusano numerico el numero introducido se queda en %d",
                    componer);
        } else {
            System.out.println("El gusano numerico no se ha comido ningun numero");
        }
    }
}
