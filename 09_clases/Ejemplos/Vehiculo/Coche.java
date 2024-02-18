package Vehiculo;

public class Coche extends Vehiculo {

    // ATRIBUTOS ////
    int cantidadPuertas;
    int velocidadMaxima;

    // CONTRUCTORES ////
    public Coche() {
        super();
    }

    // GETTERS ////
    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    // SETTERS ////
    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    // METODOS //////
    public void quemaRueda() {
        System.out.println("escriiiiiiiiiiiich!");
    }

}
