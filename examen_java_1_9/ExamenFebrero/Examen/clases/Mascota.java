package clases;

/* 
 * 
 * @autor Barbara Colomer
 */

public abstract class Mascota implements MascotaInterface {

    // ATRIBUTOS /////
    public static int totalMascotas = 0;

    String chip;
    String nombre;
    int edad;
    boolean vacunada;

    // CONTRUCTORES////
    /**
     * se define vacuna como false
     * 
     * @param vacunada
     */
    public Mascota(boolean vacunada) {
        this.vacunada = false;
    }

    /**
     * recibe chip
     * 
     * @param chip
     */
    public Mascota(String chip) {
        this.chip = chip;
    }

    /**
     * recibe chip y nombre
     * 
     * @param chip
     * @param nombre
     */
    public Mascota(String chip, String nombre) {
        this.chip = chip;
        this.nombre = nombre;

    }

    // GETTERS ///
    public boolean getVacunada() {
        return this.vacunada;
    }

    /**
     * devuelve la cantidad de mascotas total
     * 
     * @return
     */
    public static int getTotalMascotas() {
        return totalMascotas;
    }

    /**
     * devuelve el numero de chip de mascota
     * 
     * @return
     */
    public String getChip() {
        return chip;
    }

    /**
     * devuelve nombre de mascota
     * 
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * devuelve la edad
     * 
     * @return
     */
    public int getEdad() {
        return edad;
    }

    // SETTERS ///
    /**
     * setea la edad de la mascota
     * 
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * modifica el total de las mascotas
     * 
     * @param totalMascotas
     */
    public static void setTotalMascotas(int totalMascotas) {
        Mascota.totalMascotas = totalMascotas;
    }

    /**
     * vacunar mascota
     */
    public void vacunar() {
        this.vacunada = true;
    }

}
