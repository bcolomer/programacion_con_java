import org.junit.Assert;
import org.junit.Test;

public class AlumnoTest {
    @Test
    public void testGetQualitativeGrade() {
        // given
        // vamos a hacer un test de un metodo que nos devuelve una nota, hay que ver que
        // nota me pone y que resultado espero
        // estoy probando el objeto alumno, creo el alumno

        Alumno alumno = new Alumno();
        double grade = 5;
        String expectedResult = "Suficiente";

        // when
        // varias acciones, algunas se pueden poner en el given

        alumno.setGrade(grade);// le pongo una nota al alumno, esto se puede poner en el given
        // quiro probar el getqualitativegrade
        // quiero guardar la accion en una variable, me devuelve un string (sufi, bien
        // etc) por lo que tengo que crear variable String
        String actualResult = alumno.getQualitativeGrade();// llamo al alumno y le digo que quiero que cree la nota
                                                           // cualitativa y guardo el resultado en la variable

        // then
        Assert.assertEquals(expectedResult, actualResult);// tiene que ser iguales
    }
}
