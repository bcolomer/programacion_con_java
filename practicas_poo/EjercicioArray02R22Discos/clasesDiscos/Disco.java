package clasesDiscos;

public class Disco {
    // ATRIBUTOS STATIC DE CLASE ////

    private static int cantidadDiscos = 0;

    // ATRIBUTOS DE INSTANCIA ////

    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;

    // CONSTRUCTORES ////
    public Disco() {
        cantidadDiscos++;
    }

    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
        cantidadDiscos++;
    }

    // GETTERS ////

    public static int getCantidadDiscos() {
        return cantidadDiscos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    // SETTERS ////
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // METODOS ////

    @Override
    public String toString() {
        return String.format(
                "Codigo: %s\nAutor: %s\nTitulo: %s\nGenreo: %s\nDuracion: %d\n", this.codigo, this.autor, this.titulo,
                this.genero, this.duracion);
    }
}
