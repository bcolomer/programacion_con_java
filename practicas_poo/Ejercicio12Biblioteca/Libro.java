package Ejercicio12Biblioteca;

public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro() {
        super();

    }

    public Libro(String isbn, String titulo, int year) {
        super(isbn, titulo, year);
        this.prestado = false;
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {

        return this.prestado;
    }

    @Override
    public void presta() {
        if (this.prestado) {
            System.out.println("Lo siento, el libro esta prestado");
        } else {
            this.prestado = true;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " (" + (this.prestado ? "prestado" : "no prestado") + ")";
    }

}
