package Caballo;

public class AppCaballo {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("percheron", "pardo", 3, "Rosinante", 1);
        caballo1.setRaza("arabe");
        caballo1.setColorPelaje("Negro");

        caballo1.getColorPelaje();
        System.out.println(caballo1.getColorPelaje());
        System.out.println(caballo1.getNombre());
        System.out.println(caballo1);

        Caballo caballo2 = new Caballo("salvaje", "negro", 2, "Bestia", 0);

        System.out.println(caballo2);
        Caballo caballo3 = new Caballo();
        caballo3.setNombre("pepe");
        caballo3.setColorPelaje("blanco nieve");

        System.out.println(caballo3);
        // System.out.println("hola soy " + caballo1.getNombre() +
        // caballo1.relinchar());
        System.out.print("hola soy " + caballo1.getNombre() + " ");
        caballo1.relinchar();

    }
}