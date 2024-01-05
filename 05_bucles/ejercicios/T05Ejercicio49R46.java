
/*
 * Realiza un programa que calcule el máximo, el mínimo y la media de una serie
de números enteros positivos introducidos por teclado. El programa terminará
cuando el usuario introduzca un número primo. Este último número no se
tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
números ha introducido el usuario (sin contar el primo que sirve para salir). 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio49R46 {
    public static void main(String[] args) {
        int numeroMaximo = 0;
        int numeroMinimo = 0;
        double media = 0;
        int numero = 0;
        int contador = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca numeros eneteros positivos");
        numero = s.nextInt();
        numeroMinimo = numero;
        while (!Matematicas.esPrimo(numero)) {
            contador++;
            numeroMaximo = (numeroMaximo > numero) ? numeroMaximo : numero;
            numeroMinimo = (numero > numeroMinimo) ? numeroMinimo : numero;
            media = media + numero;
            numero = s.nextInt();
        }
        media = media / contador;
        s.close();
        System.out.printf("Has introducido %d numeros\n", contador);
        System.out.printf("Numero mas grande: %d \n", numeroMaximo);
        System.out.printf("Numero mas pequeño: %d \n", numeroMinimo);
        System.out.printf("Media %.2f numeros\n", media);
    }

}
