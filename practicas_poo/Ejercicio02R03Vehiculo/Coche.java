package Ejercicio02R03Vehiculo;

public class Coche extends Vehiculo {
    // ATRIBUTOS STATIC DE CLASE ////

    // ATRIBUTOS DE INSTANCIA ////
    String Color;
    String Marca;
    int kilometrosCoche = 0;

    // CONSTRUCTORES ////
    public Coche() {

    }

    public Coche(int kilometrosCoche) {
        this.kilometrosCoche = kilometrosCoche;
    }

    // GETTERS ////
    public int getKilometrosCoche() {
        return kilometrosCoche;
    }

    // SETTERS ////
    public void setKilometroCoche(int kmCoche) {
        kilometrosTotales += kmCoche;
        this.kilometrosCoche += kmCoche;

    }

    // METODOS ////
    public void quemaRueda() {
        System.out.println("Estoy quemando neumaticos, buenisimo para el Medio Ambiente");
    }

    @Override
    public void anda() {
        System.out.println("Gasto gasolina brrrrrrrr brrrrrr");

    }

}
