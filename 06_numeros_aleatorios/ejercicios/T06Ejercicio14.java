
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

public class T06Ejercicio14 {
    public static void main(String[] args) {

        int numeroAdivinar = 0;
        int numeroIntentado = 0;
        int contador = 5;
        Scanner s = new Scanner(System.in);
        // el numero tiene que ser desde A hasta B = de 0 a 10
        int numeroFinal = 11; // esto es la cantidad de numeros a tratar de adivinar
        int numeroInicial = 0; // esto es desde que numero hay que tratar de adivinar
        String mayorMenor = "";

        try {
            do {
                System.out.println("Introduzca un numero entre 0 y 10:");
                numeroAdivinar = s.nextInt();
            } while ((numeroAdivinar < 0) || (numeroAdivinar > 10));

        } catch (Exception InputMismatchException) {
            System.out.println("ERROR. Debe introducir un valor válido.");
        }

        do {
            // numeroIntentado = (int) (Math.random() * numeroFinal + numeroInicial);
            numeroIntentado = (int) (Math.random() * (numeroFinal - numeroInicial) + numeroInicial);

            if (numeroAdivinar == numeroIntentado) {
                System.out.println("Creo que estas pensando el numero:" + numeroIntentado);
                System.out.println("ENHORABUENA PARA MI, lo he adivinado!");
            } else {

                System.out.println("Creo que el numero que estas pensando es:" + numeroIntentado);
                contador--;
                System.out.printf("Me quedan %d intentos\n", contador);
                System.out.println("el numero que estas pensando es mayor o menor al que he dicho antes?");
                mayorMenor = System.console().readLine();

                if (mayorMenor.equals("mayor")) {

                    numeroInicial = numeroIntentado + 1;
                    // numeroFinal = numeroFinal - numeroIntentado - 1;
                    // deberia ser mi opcion inicial = intentado +1? PROBAR ESTO
                } else if (mayorMenor.equals("menor")) {
                    numeroFinal = numeroIntentado;
                    // numeroFinal = numeroIntentado - 1;//esto antes lo habia puesto +1 y ahi
                    // estaba
                    // equivoada porque el inicial es el +1

                } else {
                    System.out.println("no ha introducido una opcion correcta");
                }
                if (numeroIntentado == numeroAdivinar) {
                    System.out.println("gane ");
                }
            }
        } while ((contador > 0) && (numeroAdivinar != numeroIntentado));// porque un y y no un or.. cuando quiero
        // que siga mientras una o la otra sea corecta.. esto es porque sigue mientras
        // tenga intentos
        // y el numero sea diferente
        if (contador == 0) {
            System.out.println("Se agotaron los intentos. No he conseguido adivinar tu número.");
            System.out.println("Esta vez has ganado tu.");
        }
        s.close();

    }
}
