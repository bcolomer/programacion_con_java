package EjercicioArray01R20Gato;

public class Gato {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private int numero;
    private String nombre;
    private String Color;
    private String raza;

    // CONSTRUCTORES ////

    public Gato() {

    }

    public Gato(int numero, String nombre, String color, String raza) {
        this.numero = numero;
        this.nombre = nombre;
        Color = color;
        this.raza = raza;
    }
    // GETTERS ////

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return Color;
    }

    public String getRaza() {
        return raza;
    }
    // SETTERS ////

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    // METODOS ////

    @Override
    public String toString() {
        return String.format("Gato nro %d \nNombre: %s\nColor: %s\nRaza: %s\n", this.numero, this.nombre, this.Color,
                this.raza);
    }
}
