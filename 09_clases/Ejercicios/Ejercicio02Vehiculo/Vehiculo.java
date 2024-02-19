package Ejercicio02Vehiculo;

public class Vehiculo {

    // ATRIBUTOS ////
    int vehiculosCreados;
    int kilometrosTotales;
    int kilometrosRecorridos;

    // CONTRUCTORES ////
    public Vehiculo() {
    }

    public Vehiculo(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }
    // GETTERS ////

    public int getVehiculosCreados() {
        return vehiculosCreados;
    }

    public int getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public int getKilometrosTotales() {
        return kilometrosTotales;
    }

    // SETTERS ////
    public void setKilometrosTotales(int kilometrosTotales) {
        this.kilometrosTotales = kilometrosTotales;
    }

    public void setVehiculosCreados(int vehiculosCreados) {
        this.vehiculosCreados = vehiculosCreados;
    }

    public void setKilometrosRecorridos(int kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    // METODOS ////
    public void anda() {
        System.out.println(" Está andando");
    }
}
