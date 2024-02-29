package Ejercicio01R02Caballo.Clases;

public class Caballo {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private String nombre;
    private String raza;
    private String Color;
    private int edad;

    // CONSTRUCTORES ////
    public Caballo() {
    }

    public Caballo(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS ////
    public String getNombre() {
        return nombre;
    }

    // SETTERS ////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // METODOS ////
    public void relincha() {
        System.out.println("Hiiieeee");
    }

    public void come() {
        System.out.println("Ñam, ñam");
    }

    public void cabalga() {
        System.out.println("tocotoc tocotoc");
    }

    public void saluda() {
        System.out.println("hola, yo soy " + this.nombre);
    }

    @Override
    public String toString() {
        return "Hola, me llamo " + nombre;
    }
}
