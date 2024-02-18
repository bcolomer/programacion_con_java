package Caballo;

/*Haz una lista con los atributos que podría tener la clase caballo. A continuación haz una lista 
con los posibles métodos (acciones asociadas a los caballos). 
Hecho esto implementa la clase Caballo y pruébala creando instancias y aplicándole algunos métodos.*/
public class Caballo {
    private String raza;
    private String colorPelaje;
    private int edad;
    private String nombre;
    private int numeroCuadra;

    // CONTRUCTOR ////////
    public Caballo() {

    }

    public Caballo(String raza, String colorPelaje, int edad, String nombre, int numeroCuadra) {
        this.raza = raza;
        this.colorPelaje = colorPelaje;
        this.edad = edad;
        this.nombre = nombre;
        this.numeroCuadra = numeroCuadra;

    }

    // GETTERS ////////

    public String getRaza() {
        return raza;
    }

    public Caballo() {
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroCuadra() {
        return numeroCuadra;
    }

    // SETTERS /////////

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroCuadra(int numeroCuadra) {
        this.numeroCuadra = numeroCuadra;
    }

    public void relinchar() {
        System.out.println("Hiiihiiiiii");
    }

    public void comer() {
        System.out.println("Ñam, ñam");
    }

    public void correr() {
        System.out.println("Tocotoc tocotoc tocotoc");
    }

    @Override
    public String toString() {
        return "La raza del caballo es " + this.raza + " y el nombre es " + this.nombre;
    }
}
