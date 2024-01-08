
/*
 * Escribe un programa que pida un número por teclado y que luego lo “disloque”
de tal forma que a cada dígito se le suma 1 si es par y se le resta 1 si
es impar. Usa long en lugar de int donde sea necesario para admitir números
largos. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio68 {
    public static void main(String[] args) {

        long numero = 0;
        Scanner s = new Scanner(System.in);
        long volteado = 0;
        long dislocado = 0;
        int modulo = 0;
        int diferenciadigitos = 0;

        System.out.println("Por favor, introduzca un número: ");
        numero = s.nextLong();
        s.close();

        volteado = Matematicas.voltea(numero);
        diferenciadigitos = Matematicas.cuentaDigitos(numero) - Matematicas.cuentaDigitos(volteado);

        do {
            modulo = (int) volteado % 10;
            volteado = volteado / 10;
            if (modulo % 2 == 0) {
                modulo = modulo + 1;

            } else {
                modulo = modulo - 1;
            }
            dislocado = (dislocado * 10) + modulo;
        } while (volteado > 0);

        if (diferenciadigitos >= 1) {
            for (int i = 0; i < diferenciadigitos; i++) {
                dislocado = (dislocado * 10) + 1;
            }
        }
        System.out.printf("Dislocando el %d sale el %d", numero, dislocado);
    }
}