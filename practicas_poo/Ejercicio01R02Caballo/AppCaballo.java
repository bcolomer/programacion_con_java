package Ejercicio01R02Caballo;

import Ejercicio01R02Caballo.Clases.Caballo;

public class AppCaballo {
    public static void main(String[] args) {

        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo();

        caballo1.setNombre("Babieca");
        caballo2.setNombre("Lykos");

        System.out.println(caballo1);
        caballo1.cabalga();
        caballo1.relincha();
        caballo2.saluda();
        caballo2.come();
        caballo2.cabalga();
    }
}
