package Ejercicio02R03Vehiculo;

public class Bicicleta extends Vehiculo {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    String marca;
    String modelo;
    int kilometrosBicicleta = 0;

    // CONSTRUCTORES ////
    public Bicicleta() {

    }

    public Bicicleta(int kmBici) {
        this.kilometrosBicicleta = kmBici;
    }
    // GETTERS ////

    public int getKilometrosBicicleta() {
        return kilometrosBicicleta;
    }

    // SETTERS ////
    public void setKilometrosBicicleta(int kmBici) {
        kilometrosTotales += kmBici;
        this.kilometrosBicicleta += kmBici;
    }

    // METODOS ////
    public void hacerCaballito() {
        System.out.println("Mira mi equilibrio, voy en una rueda!");
    }

    @Override
    public void anda() {
        System.out.println("Pedaleo kilometros, bueno para mi cuerpo y no utilizo combustibles, soy ecologica");
    }

}
