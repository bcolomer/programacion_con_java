package EjercicioAgendaDeContactos;

public class Contacto {

    private String dni;
    private String nombre;
    private String apellido;
    private int edad;

    public Contacto() {
    }

    /**
     * @param dni
     * @param nombre
     * @param apellido
     */
    public Contacto(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * @return
     */
    public String getDni() {
        return this.dni;
    }

    /**
     * Getter del nombre
     * 
     * @return
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**     
     */
    @Override
    public String toString() {
        return this.dni + " - " + this.nombre + " " + this.apellido + ", " + this.edad + " años.";
    }

}
