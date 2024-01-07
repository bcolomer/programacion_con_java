
/*
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres
de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
orientación, los valores de anchura y altura se intercambian. El valor mínimo
de la altura o la anchura es 2. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T05Ejercicio64R60 {
    public static void main(String[] args) {

        int opcion = 0;
        Scanner s = new Scanner(System.in);
        int altura = 3;
        int anchura = 6;
        int aux = 0;
        System.out.println();
        System.out.println(rectangulo(altura, anchura));

        do {

            System.out.print(
                    "1. Agrandarlo\n2. Achicarlo\n3. Cambiar la orientacion\n4. Salir\nIndique que quiere hacer con el rectángulo:");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println();
                    if (altura < 2) {
                        altura = 2;
                    }
                    if (anchura < 2) {
                        anchura = 2;
                    }
                    altura++;
                    anchura++;
                    System.out.println(rectangulo(altura, anchura));
                    break;
                case 2:
                    System.out.println();
                    if (altura < 2) {
                        altura = 2;
                    }
                    if (anchura < 2) {
                        anchura = 2;
                    }
                    altura--;
                    anchura--;
                    System.out.println(rectangulo(altura, anchura));
                    break;
                case 3:
                    System.out.println();
                    if (altura < 2) {
                        altura = 2;
                    }
                    if (anchura < 2) {
                        anchura = 2;
                    }
                    aux = altura;
                    altura = anchura;
                    anchura = aux;
                    System.out.println(rectangulo(altura, anchura));
                    break;

                default:
                    break;
            }

        } while (opcion != 4);

        s.close();

    }

    public static String rectangulo(int altura, int anchura) {
        String rectangulo = "";
        // imprime la linea superior
        for (int horizontal = 0; horizontal < anchura; horizontal++) {
            rectangulo += "*";
        }
        rectangulo += "\n";
        // imprime lineas intermedias
        for (int lineasIntermedias = 0; lineasIntermedias < altura - 2; lineasIntermedias++) {
            rectangulo += "*";
            for (int espacios = 0; espacios < anchura - 2; espacios++) {
                rectangulo += " ";
            }
            rectangulo += "*";
            rectangulo += "\n";
        }

        // imprime linea inferior
        for (int horizontal = 0; horizontal < anchura; horizontal++) {
            rectangulo += "*";
        }
        rectangulo += "\n";
        return rectangulo;
    }

}
