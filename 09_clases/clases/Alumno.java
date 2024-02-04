package clases;

public class Alumno extends Persona {
    /**
     * constructor de la clase alumno
     */
    public Alumno() {
        super();
    }

    /**
     * segundo constructor de la clase alumno
     * 
     * @param dni
     */
    public Alumno(String dni) {
        super(dni);
    }

    public void gritar() {
        System.out.println("ahhh");
    }
}