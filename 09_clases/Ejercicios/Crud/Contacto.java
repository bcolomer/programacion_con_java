package Crud;

public class Contacto {
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    String nombre;
    String apellido;
    String dni;
    int telefono;
    int edad;

    // CONSTRUCTORES ////

    public Contacto() {

    }

    public Contacto(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // SETTERS ////
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    // GETTERS ////

    // METODOS ////
    // ATRIBUTOS STATIC DE CLASE ////
    // ATRIBUTOS DE INSTANCIA ////
    // CONSTRUCTORES ////
    // GETTERS ////
    // SETTERS ////
    // METODOS ////
    Contacto listado[] = new Contacto[5];

}
