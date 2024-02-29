package Ejercicio12Biblioteca;

public class Revista extends Publicacion {
    private int numero;

    public Revista() {
        super();

    }

    public Revista(String isbn, String titulo, int year, int numero) {
        super(isbn, titulo, year);
        this.numero = numero;
    }
}
