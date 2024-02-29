package Ejercicio00GatoSimple;

public class AppGatoSimple {
    public static void main(String[] args) {

        GatoSimple mini = new GatoSimple("hembra");
        System.out.println(mini);
        mini.maulla();

        GatoSimple garfield = new GatoSimple("macho");
        System.out.println(garfield);
        garfield.come("pienso");

        mini.peleaCon(garfield);
        garfield.peleaCon(mini);
        GatoSimple tom = new GatoSimple("macho");
        tom.peleaCon(garfield);
    }

}
