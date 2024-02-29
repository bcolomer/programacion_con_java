package Ejercicio12Biblioteca;

public class Publicacion {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    private String isbn;
    private String titulo;
    private int year;

    // CONSTRUCTORES ////
    public Publicacion() {
    }

    public Publicacion(String isbn, String titulo, int year) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.year = year;

        // GETTERS ////
        // SETTERS ////
        // METODOS ////

    }

    @Override
    public String toString() {
        return "ISBN: " + this.isbn + ", títutlo " + this.titulo + ", año de publicacion: " + this.year;
    }
}