package clases;

/*  
 * 
 * @autor Barbara Colomer
 */

public class Perro extends Mascota {

    // ATRIBUTOS ////
    public static int totalPerros = 0;

    String raza;

    // CONTRUCTORES ////
    /**
     * recibe chip
     * 
     * @param chip
     */
    public Perro(String chip) {
        super(chip);
    }

    /**
     * recibe chip y nombre
     * 
     * @param chip
     * @param nombre
     */
    public Perro(String chip, String nombre) {
        super(chip, nombre);
        setTotalPerros(totalPerros++);
        setTotalMascotas(totalMascotas++);
    }

    // GETTERS ///

    /**
     * devuelve la cantidad de perros
     * 
     * @return
     */
    public static int getTotalPerros() {
        return totalPerros;
    }

    /**
     * devuelve la raza del perro
     * 
     * @return
     */
    public String getRaza() {
        return raza;
    }

    // SETTERS//
    /**
     * agrego raza de perro
     * 
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * modifica el total de perros
     * 
     * @param totalPerros
     */
    public static void setTotalPerros(int totalPerros) {
        Perro.totalPerros = totalPerros;
    }

    // METODOS ////

    /**
     * perro ladra
     */
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    /**
     * perro gruñe
     */
    public void grunir() {
        System.out.println("Grrrrr....");
    }

    /**
     * perro pasea si ha sido vacunado, de lo contrario no.
     */
    public void pasear() {
        if (vacunada) {
            ladrar();
        } else {
            System.out.println(this.nombre + ", no puede pasear hasta no ser vacunado/a.");
        }
    }

    /**
     * se vacuna al perro si no ha sido vacunado
     */
    public void vacunar() {
        if (!vacunada) {
            this.vacunada = true;
            this.grunir();
        } else {
            System.out.println(this.nombre + ", ya ha sido vacunado");

        }
    }

}
