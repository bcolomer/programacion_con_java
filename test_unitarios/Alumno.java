/* Necesitamos crear una clase Alumno con una propiedad grade de tipo float 
o double que sea privada. Debe tener un getter y un setter para esa propiedad. 
Pero ademas, tendrá otro método que nos devuelva la nota en formato cualitativo.
Crea la clase, el getter y el setter. Crea también la función getQualitativeGrade() 
pero no la implementes. Esta función usará el valor que haya en ese momento
 en la propiedad grade y devolverá la nota en formato cualitativo siguiendo la 
 siguiente tabla.

Nota numérica 	Nota cualitativa
[0, 3) 	Muy deficiente
[3, 5) 	Insuficiente
[5,6) 	Suficiente
[6,7) 	Bien
[7,9) 	Notable
[9,10] 	 Sobresaliente

 * 
 * @autor Barbara Colomer
 */
public class Alumno {
    private double grade;

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getQualitativeGrade() {
        return "paquito";
    }
}
