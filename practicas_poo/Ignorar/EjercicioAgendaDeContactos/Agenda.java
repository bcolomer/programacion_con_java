package EjercicioAgendaDeContactos;

public class Agenda {

    private static final int TOTAL = 5;

    private int posicion;
    private int totalContactos;
    private Contacto[] listado; // listado de contactos

    /**
     * Constructor de la clase
     */
    public Agenda() {
        this.posicion = 0;
        this.totalContactos = 0;
        this.listado = new Contacto[TOTAL];
    }

    /**
     * Comprueba si la agenda está llena
     * 
     * @return
     */
    public boolean esLlena() {
        return this.totalContactos >= TOTAL;
    }

    /**
     * Comprueba si la agenda es vacía
     * 
     * @return
     */
    public boolean esVacia() {
        return this.totalContactos == 0;
    }

    /**
     * Devuelve el total de contactos que tenemos
     * 
     * @return
     */
    public int total() {
        return this.totalContactos;
    }

    /**
     * Buscamos por DNI y devolvemos la posición del contacto
     * 
     * @param dni
     * @return
     */
    private int buscar(String dni) {
        int i = 0;
        while ((i < TOTAL) && (!listado[i].getDni().equals(dni))) {
            i++;
        }
        return i;
    }

    /**
     * @param contacto
     */
    public void crear(Contacto contacto) {
        int i = 0;

        // introducimos el contacto
        this.listado[this.posicion] = contacto;
        this.totalContactos++;

        // buscamos siguiente posición libre
        while ((i < TOTAL) && (this.listado[i] != null)) {

            this.posicion++;
            if (this.posicion >= TOTAL) {
                this.posicion = 0;
            }

            i++;
        }
    }

    /**
     * Borra el contacto por DNI
     * 
     * @param dni
     */
    public void borrar(String dni) {

        // buscamos el contacto por DNI
        int i = buscar(dni);

        if (i < TOTAL) {
            this.listado[i] = null; // eliminamos el contacto
            this.totalContactos--; // decrementamos el número de usuarios
        }
    }

    /**
     * Busca un contacto por DNI.
     * 
     * @param dni
     */
    public Contacto buscarPorDni(String dni) {
        int i = buscar(dni);
        return (i < TOTAL) ? this.listado[i] : null;
    }

    /**
     * Busco un contacto por nombre. Si lo encuentro
     * devuelvo el contacto; si no, devuelvo nulo.
     * 
     * @param nombre
     * @return
     */
    public Contacto buscarPorNombre(String nombre) {
        int i = 0;
        while ((i < TOTAL) && (!this.listado[i].getNombre().equals(nombre))) {
            i++;
        }
        return (i < TOTAL) ? this.listado[i] : null;
    }

    /**
     * Busca un contacto utilizando la posición dentro
     * del array. Devuelve el contacto si lo encuentra;
     * en otro caso, devuelve nulo.
     * 
     * @param id
     */
    public Contacto buscarPorId(int id) {
        int i = 0;
        while ((i < TOTAL) && (i < (id - 1))) {
            i++;
        }
        return (i < TOTAL) ? this.listado[i] : null;
    }

    /**
     * @param nombre
     */
    public void listarTodosNombre(String nombre) {
        for (int i = 0; i < TOTAL; i++) {
            if ((this.listado[i] != null) && (this.listado[i].getNombre().equals(nombre))) {
                System.out.println(this.listado[i]);
            }
        }
    }

    /**
     * Muestra un listado de contactos
     */
    public void listar() {
        for (int i = 0; i < TOTAL; i++) {
            if (this.listado[i] != null) {
                System.out.println("Contacto " + (i + 1));
                System.out.println(this.listado[i]);
            }
        }
    }

}
