import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    // ************************************************************/
    // *****NO HACER LOS TEST ASI PORQUE NO SON LEGIBLES*****/*****/
    // ************************************************************/

    @Test
    public void testAdd1() {
        Calculator calculadora = new Calculator();
        Assert.assertEquals(4, calculadora.add(2, 2), 0);

    }
    // ************************************************************/
    // ********************TEST CORRECTOS**************************/
    // ************************************************************/

    /*
     * este test si se entiende porque sigue la escrturctura given, when y then
     * y utiliza variables con nombres descriptivos en lugar de numeros magicos
     */

    @Test
    public void testAdd2() {// aqui se puede poner el nombre que se quiera mientras sea descriptivo

        // GIVEN
        double addend1 = 2;
        double addend2 = 4;
        double expectedSum = 6;
        Calculator calculator = new Calculator();
        double toleratedDelta = 0;

        // WHEN
        double actualSum = calculator.add(addend1, addend2);

        // THEN
        Assert.assertEquals(expectedSum, actualSum, toleratedDelta);
    }

    @Test
    public void testSubstrac() {

        // given subtrahend and minuend
        double subtrahend = 4;
        double minuend = 1;
        double expectedDifference = 3;
        Calculator calculator = new Calculator();
        double toleratedDelta = 0;

        // when
        double actualDifference = calculator.subtract(subtrahend, minuend);

        // then
        Assert.assertEquals(expectedDifference, actualDifference, toleratedDelta);

    }

    @Test
    public void testMultiplied() {

        // given
        double factor1 = 4;
        double factor2 = 2;
        double expectedProduct = 8;
        Calculator calculator = new Calculator();
        double toleratedDelta = 0;

        // when
        double actualProduct = calculator.multiply(factor1, factor2);

        // then
        Assert.assertEquals(expectedProduct, actualProduct, toleratedDelta);

    }

    @Test
    public void testDivide() {

        // given
        double dividend = 16;
        double divisor = 3;
        double expectedQuotient = 5.3;
        Calculator calculator = new Calculator();
        double toleratedDelta = 0.05;

        // when
        double actualQuotient = calculator.divide(dividend, divisor);

        // then
        Assert.assertEquals(expectedQuotient, actualQuotient, toleratedDelta);

    }

    @Test
    public void testDivide2() {

        // given
        double dividend = 15;
        double divisor = 3;
        double expectedQuotient = 5;
        Calculator calculator = new Calculator();
        double toleratedDelta = 0;

        // when
        double actualQuotient = calculator.divide(dividend, divisor);

        // then
        Assert.assertEquals(expectedQuotient, actualQuotient, toleratedDelta);

    }
    /*
     * 
     * 
     * /*
     * if (number2 == 0) {
     * throw new IllegalArgumentException("Cannot divide by zero");
     * }
     *
     * 
     * @Test
     * public void testDivideByZero() {
     * 
     * // given
     * double dividend = 5;
     * double divisor = 0;
     * String expectedErrorMessage = "Cannot divide by zero";
     * Calculator calculator = new Calculator();
     * String actualErrorMessage = "";
     * // when
     * try {
     * calculator.divide(dividend, divisor);
     * } catch (IllegalArgumentException e) {
     * actualErrorMessage = e.getMessage();
     * }
     * double actualQuotient = calculator.divide(dividend, divisor);
     * 
     * // then
     * Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
     * 
     * }
     */
}