package clases;

/* 
 * 
 * @autor Barbara Colomer
 */

public class Gato extends Mascota {

    public static int totalGatos = 0;

    // ATRIBUTOS ////

    String Pelaje;

    // CONSTRUCTORES ////
    /**
     * recibe chip
     * 
     * @param chip
     */
    public Gato(String chip) {
        super(chip);
    }

    /**
     * recibe chip y nombre
     * 
     * @param chip
     * @param nombre
     */
    public Gato(String chip, String nombre) {
        super(chip, nombre);
        setTotalGatos(totalGatos++);
        setTotalMascotas(totalMascotas++);
    }

    // GETTERS ///
    /**
     * devuelve el total de gatos
     * 
     * @return
     */
    public static int getTotalGatos() {
        return totalGatos;
    }

    /**
     * devuelve el pelaje del gato
     * 
     * @return
     */
    public String getPelaje() {
        return Pelaje;
    }

    // SETTERS ////
    /**
     * agrega/ modifica el pelaje al gato
     * 
     * @param pelaje
     */
    public void setPelaje(String pelaje) {
        Pelaje = pelaje;
    }

    /**
     * modifica el total de gatos
     * 
     * @param totalGatos
     */
    public static void setTotalGatos(int totalGatos) {
        Gato.totalGatos = totalGatos;
    }

    // METODOS ////

    /**
     * gato maulla
     */
    public void maulla() {
        System.out.println("¡Miaaaaaaaaau! Brrrrr.....");
    }

    /**
     * gato bufa
     */
    public void bufa() {
        System.out.println("Fuuuuuuu.......");
    }

    /**
     * gato pasea si ha sido vacunado, de lo contrario no.
     */
    public void pasear() {
        if (vacunada) {
            maulla();
        } else {
            System.out.println(this.nombre + ", no puede pasear hasta no ser vacunado/a.");
        }
    }

    /**
     * se vacuna al gato si no ha sido vacunado
     */
    public void vacunar() {
        if (!vacunada) {
            this.vacunada = true;
            this.bufa();
        } else {
            System.out.println(this.nombre + ", ya ha sido vacunado");

        }
    }

}
