package Ejercicio02Vehiculo;

public class Bicicleta extends Vehiculo {

    // ATRIBUTOS ////
    int cantidadPlatos;
    String tipo;

    // CONTRUCTORES ////
    public Bicicleta() {
        super();
    }

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    public Bicicleta(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }
    // GETTERS ////

    public int getCantidadPlatos() {
        return cantidadPlatos;
    }

    public String getTipo() {
        return tipo;
    }
    // SETTERS ////

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCantidadPlatos(int cantidadPlatos) {
        this.cantidadPlatos = cantidadPlatos;
    }

    // METODOS //////

    public void haceCaballito() {
        System.out.println("El conductor de la bici esta haciendo el loco andando en una rueda");
    }
}
