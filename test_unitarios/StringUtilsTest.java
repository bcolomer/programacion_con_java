import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverseCat() {

        // given
        String given = "cat";
        StringUtils stringUtils = new StringUtils();
        String expectedGiven = "tac";

        // when
        String actualGiven = stringUtils.reverse(given);

        // then
        Assert.assertEquals(expectedGiven, actualGiven);

    }

    @Test
    public void testReverseDog() {

        // given
        String given = "dog";
        StringUtils stringUtils = new StringUtils();
        String expectedGiven = "god";

        // when
        String actualGiven = stringUtils.reverse(given);

        // then
        Assert.assertEquals(expectedGiven, actualGiven);

    }

    @Test
    public void testReverseEmpty() {

        // given
        String given = "";
        StringUtils stringUtils = new StringUtils();
        String expectedGiven = "";

        // when
        String actualGiven = stringUtils.reverse(given);

        // then
        Assert.assertEquals(expectedGiven, actualGiven);

    }

    @Test
    public void testReverseApple() {

        // given
        String given = "apple";
        StringUtils stringUtils = new StringUtils();
        String expectedGiven = "elppa";

        // when
        String actualGiven = stringUtils.reverse(given);

        // then
        Assert.assertEquals(expectedGiven, actualGiven);

    }

    @Test
    public void testBooleanReverseWords1() {

        // given
        String word = "mum";
        StringUtils stringUtils = new StringUtils();
        boolean expectedWord = true;

        // when
        boolean actualWord = stringUtils.reverseWord(word);

        // then
        Assert.assertEquals(expectedWord, actualWord);

    }

    @Test
    public void testBooleanReverseWords2() {

        // given
        String word = "cat";
        StringUtils stringUtils = new StringUtils();
        boolean expectedWord = false;

        // when
        boolean actualWord = stringUtils.reverseWord(word);

        // then
        Assert.assertEquals(expectedWord, actualWord);

    }
}
