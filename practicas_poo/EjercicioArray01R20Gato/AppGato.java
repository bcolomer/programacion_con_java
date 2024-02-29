package EjercicioArray01R20Gato;

public class AppGato {
    public static void main(String[] args) {

        // Gato[] gatoarray = new Gato[4];
        // introducirDatos(gatoarray);
        // mostrarDatos(gatoarray);

        Gato gato1 = new Gato(1, "Garfield", "naranja", "mestizo");
        Gato gato2 = new Gato(2, "Pepe", "gris", "angora");
        Gato gato3 = new Gato(3, "Mauri", "blanco", "manx");
        Gato gato4 = new Gato(4, "Ulises", "marron", "persa");

        System.out.println(gato1);
        System.out.println(gato2);
        System.out.println(gato3);
        System.out.println(gato4);

    }

    public static void introducirDatos(Gato[] gatoarray) {
        System.out.println("Por favor, introduzca los datos de los gatos:");

        for (int i = 0; i < gatoarray.length; i++) {

            gatoarray[i] = new Gato();
            System.out.println("Gato nro " + (i + 1));
            System.out.print("Nombre: ");
            gatoarray[i].setNombre(System.console().readLine());
            System.out.print("Color: ");
            gatoarray[i].setColor(System.console().readLine());
            System.out.print("Raza: ");
            gatoarray[i].setRaza(System.console().readLine());

        }
    }

    public static void mostrarDatos(Gato[] gatoarray) {
        System.out.println("Datos de los gatos: ");
        for (int i = 0; i < gatoarray.length; i++) {
            System.out.println("Gato nro " + (i + 1));
            System.out.println("Nombre: " + gatoarray[i].getNombre());
            System.out.println("Color: " + gatoarray[i].getColor());
            System.out.println("Raza: " + gatoarray[i].getRaza());

        }
    }
}
