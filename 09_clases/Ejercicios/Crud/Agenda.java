package Crud;

public class Agenda {

    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    Contacto[] contactos;
    int cantContactos;

    // CONSTRUCTORES ////
    public Agenda(Contacto[] contactos, int cantContactos) {
        this.contactos = contactos;
        this.cantContactos = cantContactos;

    }
    // GETTERS ////
    // SETTERS ////
    // METODOS ////

    /**
     * private Contacto[] contactos;
     * private int cantidadContactos;
     * 
     * public Agenda(int capacidadMaxima) {
     * this.contactos = new Contacto[capacidadMaxima];
     * this.cantidadContactos = 0;
     * }
     */
}
