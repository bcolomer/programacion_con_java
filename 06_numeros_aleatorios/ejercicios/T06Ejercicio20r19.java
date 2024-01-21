
/*
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
agua. La capacidad será indicada por el usuario. La cuba se llenará con una
cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
pueda admitir. El ancho de la cuba no varía. 
 * 
 * @autor Barbara Colomer
 */
import java.util.Scanner;

public class T06Ejercicio20r19 {
    public static void main(String[] args) {

        int capacidadCuba = 0;
        int cantidadAgua = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("introduzca la capacidad de la cuba");
        capacidadCuba = s.nextInt();
        s.close();

        // obtener un numero aleatrorio entre 0 y la capacidad de la cuba dada por el
        // usuario
        cantidadAgua = (int) (Math.random() * (capacidadCuba + 1));

        // imprime la parte de la cuba vacia
        for (int i = 0; i < capacidadCuba - cantidadAgua; i++) {
            litrosVacios();
        }
        // imprime la parte de la cuba con agua
        for (int i = 0; i < cantidadAgua; i++) {
            litrosLlenos();

        }
        // imrpime la base de la cuba
        baseCuba();
        System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua", capacidadCuba,
                cantidadAgua);
    }

    /**
     * funcion para imprimir la base de la cuba
     */
    public static void baseCuba() {
        System.out.println("######");
    }

    /**
     * funcion para imprimir las lineas donde habra agua
     */
    public static void litrosLlenos() {
        System.out.println("#====#");
    }

    /**
     * funcion para imprimir las lineas donde no habra agua
     *
     */
    public static void litrosVacios() {
        System.out.println("#    #");
    }
}
