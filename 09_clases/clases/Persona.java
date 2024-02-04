package clases;

public abstract class Persona {

    private String dni;
    private String nombre = "John";
    private String apellido = "";
    private int edad;

    /**
     * todas las clases tienen que tener un constructor y es publico para que pueda
     * verse fuera del package
     * constructor de la clase
     */
    public Persona() {

    }

    /**
     * constructor de la clase que recibe unicamente el dni de la persona
     */
    public Persona(String dni) {
        this.dni = dni;
    }

    // no se puede tener dos contructores que se llamen igual y que tengan el mismo
    // numero de parametros y del mismo tipo (string, int etc, si son diferentes si)

    /**
     * setter de la propiedad nombre
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * setter de la propiedad apellido
     * 
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * devolvemos una cadena
     */
    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

    /**
     * la persona grita
     */
    public abstract void gritar();
}