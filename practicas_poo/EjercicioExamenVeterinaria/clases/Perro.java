package clases;

public class Perro extends Mascota {

    // ATRIBUTOS STATIC DE CLASE ////
    private static int totalPerros = 0;
    // ATRIBUTOS DE INSTANCIA ////
    private String raza;
    // CONSTRUCTORES ////

    public Perro() {
    }

    public Perro(String chip, String nombre) {
        super();
        totalPerros++;
        totalMascotas++;

    }

    public Perro(String chip) {
        super();
        totalPerros++;
        totalMascotas++;

    }

    // GETTERS ////
    public String getRaza() {
        return raza;
    }

    // SETTERS ////
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // METODOS ////
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    public void grunir() {
        System.out.println("Grrr.....");
    }

    @Override
    public void pasear() {
        if (this.getVacunada() == true) {
            ladrar();
        } else {
            System.out.println(this.getNombre() + ", no puede pasear hasta no ser vacunado/a.");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Raza: " + this.raza;
    }
}
