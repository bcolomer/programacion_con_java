package clasesDiscos;

public class Coleccion {

    private static final int MAX = 10;
    private int ultimo;
    private Disco[] listado;

    public Coleccion() {
        this.ultimo = 0;
        this.listado = new Disco[MAX];

    }

    public void mostrar() {
        for (int i = 0; i < this.ultimo; i++) {
            System.out.println("Disco " + (i + 1) + this.listado[i]);
        }
    }

    public Disco[] getListado() {
        return this.listado;
    }

    public void crear(Disco disco) {

        this.listado[this.ultimo] = disco;
        this.ultimo++;
    }

    public boolean estaLleno() {
        return this.ultimo >= MAX - 1;

    }

    public boolean estaVacia() {
        return this.ultimo == 0;

    }

    public int total() {
        return this.ultimo;
    }

    public Disco buscarPorCodigo(String codigo) {
        int i = 0;
        while ((i < this.ultimo) && (!listado[i].getCodigo().equalsIgnoreCase(codigo))) {

            i++;
        }
        // si i es menor al ultimo disco ingresado devuelve el disco de lo contrario
        // devuelve null
        return (i < this.ultimo) ? this.listado[i] : null;
    }

    public Disco buscarPorId(int id) {

        int i = 0;
        while ((i < this.ultimo) && (i < (id - 1))) {
            i++;
        }
        return (i < this.ultimo) ? this.listado[i] : null;
    }

    public Disco buscarDiscoTitulo(String titulo) {

        int i = 0;
        while ((i < this.ultimo) && (!titulo.equalsIgnoreCase(this.listado[i].getTitulo()))) {
            i++;
        }
        return (i < this.ultimo) ? this.listado[i] : null;
    }

    public void buscarTodosDuracion(int duracionBuscar) {
        boolean encontrado = false;
        for (int i = 0; i < this.ultimo; i++) {
            if (this.listado[i].getDuracion() == duracionBuscar) {
                System.out.println(this.listado[i]);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron discos con la duración especificada.");
        }
    }
}
