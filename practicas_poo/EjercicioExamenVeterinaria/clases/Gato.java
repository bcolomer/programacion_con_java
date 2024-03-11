package clases;

public class Gato extends Mascota {
    // ATRIBUTOS STATIC DE CLASE ////
    private static int totalGatos = 0;
    // ATRIBUTOS DE INSTANCIA ////
    private String pelaje;

    // CONSTRUCTORES ////
    public Gato() {
        super();
    }

    public Gato(String chip) {
        super();
        totalGatos++;
        totalMascotas++;
    }

    public Gato(String chip, String nombre) {
        super();
        totalGatos++;
        totalMascotas++;

    }

    // GETTERS ////
    public String getPelaje() {
        return pelaje;
    }

    // SETTERS ////
    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    // METODOS ////
    public void maullar() {
        System.out.println("¡Miaaaauuuuu! Brrrr.....");
    }

    public void bufar() {
        System.out.println("Fuuuuuuuu......");
    }

    @Override
    public void pasear() {
        if (this.getVacunada() == true) {
            maullar();
        } else {
            System.out.println(this.getNombre() + ", no puede pasear hasta no ser vacunado/a.");
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Pelaje " + this.pelaje;
    }
}
