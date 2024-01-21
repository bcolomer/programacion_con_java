import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testAdd() {
        Calculadora calculadora = new Calculadora();
        Assert.assertEquals(4, calculadora.add(2, 2), 0);

    }
}
