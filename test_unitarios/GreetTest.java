import org.junit.Test;
import org.junit.Assert;

public class GreetTest {
    @Test
    public void testSays() {
        Greet greet = new Greet();// creo un objeto de nombre greet de tipo greet
        Assert.assertEquals("Hello", greet.says());// el primer parametro es lo que tiene que devolver, y el segundo es
                                                   // llamar al metodo a ver que respuesta da
    }

}
