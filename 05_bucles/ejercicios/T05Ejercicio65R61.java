
/*
 * Escribe un programa que pinte por pantalla la letra A. El usuario debe introducir
la altura total y la fila en la que debe aparecer el palito horizontal (contando
desde el vértice). La altura mínima es de 3 pisos. La fila donde va el palito
horizontal debe ser mayor que 1 y menor que la altura total. Si el usuario
introduce algún dato incorrecto, el programa debe mostrar un mensaje de error. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio65R61 {
    public static void main(String[] args) {

        int altura = 0;
        int filaPalito = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("introduzca la altura de la A.Debe ser mayor o igual a 3");
        altura = s.nextInt();
        if (altura < 3) {
            System.out.println("La altura introducida no es correcta");
        } else {
            System.out
                    .println("introduzca la fila para la linea horizontal de la A. Debe ser entre 2 y " + (altura - 1));
            filaPalito = s.nextInt();
            if ((filaPalito < 2) || (filaPalito > altura - 1)) {
                System.out.println("La fila introducida no es correcta");
            }
        }
        s.close();

        for (int fila = 0; fila < altura; fila++) {
            System.out.print(fila);
            // imprime espacios izquierdos:
            for (int espacios = 0; espacios < altura - fila; espacios++) {
                System.out.print(" ");
            }
            for (int estrellas = 0; estrellas < (fila * 2) + 1; estrellas++) {

                if ((fila == 0) || (fila == filaPalito - 1)) {
                    System.out.print("*");
                } else {
                    if ((estrellas == 0) || (estrellas == (fila * 2))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");

                    }

                }
            }
            System.out.println();
        }
    }
}
