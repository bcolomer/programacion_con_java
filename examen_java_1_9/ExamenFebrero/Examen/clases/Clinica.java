package clases;
/* 
 * 
 * @autor Barbara Colomer
 */

public class Clinica {

    // ATRIBUTOS ////
    final int LISTADO = 100;
    Clinica clinica[] = new Clinica[LISTADO];

    /**
     * devuelve true si el listado esta vacio
     * 
     * @param clinica
     * @return
     */
    public boolean esVacia() {
        return true;

    }

    /**
     * devuelve false si el listado esta lleno
     * 
     * @param clinica
     * @return
     */
    public boolean esLlena() {
        return false;
    }

    /**
     * devuelve la cantidad de perros dados de alta
     */
    public int totalPerros() {
        return Perro.getTotalPerros();
    }

    /**
     * devuelve la cantidad de gatos dados de alta
     */
    public int totalGatos() {
        return Gato.getTotalGatos();
    }

    /**
     * devuelve la cantidad de mascotas dadas de alta
     */
    public int totalMascotas() {
        return Mascota.getTotalMascotas();
    }

    /**
     * agrega mascota
     * 
     * @param mascota
     */
    public void agregar(Mascota mascota) {

    }

    /**
     * lista las mascotas registradas.
     */
    public void listar() {
        for (int i = 0; i < clinica.length; i++) {
            System.out.println(clinica[i]);
        }
    }

}