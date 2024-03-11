package clases;

public abstract class Mascota implements MascotaInterface {
    // ATRIBUTOS STATIC DE CLASE ////
    public static int totalMascotas = 0;
    // ATRIBUTOS DE INSTANCIA ////
    private String chip;
    private String nombre;
    private int edad;
    private boolean vacunada;

    // CONSTRUCTORES ////
    public Mascota() {
        this.vacunada = false;
    }

    // GETTERS ////
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public boolean getVacunada() {
        return vacunada;
    }

    public String getChip() {
        return chip;
    }

    // SETTERS ////
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // METODOS ////
    public void vacunar() {
        this.vacunada = true;

    }

    @Override
    public String toString() {

        return String.format("[%s]: %s, %d años", this.chip, this.nombre, this.edad);
    }
}