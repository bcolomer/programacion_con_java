package clases;

public class Profesor extends Persona {
    /**
     * constructor de la clase profesor
     */
    public Profesor() {
        super();
    }

    /**
     * 2do constructor
     * 
     * @param dni
     */
    public Profesor(String dni) {
        super(dni);
    }

    public void gritar() {
        System.out.println("ohhh");
    }

}
