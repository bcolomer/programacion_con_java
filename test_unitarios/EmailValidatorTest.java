import org.junit.Assert;
import org.junit.Test;

public class EmailValidatorTest {

    @Test
    public void testEmailValidator1() {
        // given
        String mail = "entiendo@poco.com";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = true;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }

    @Test
    public void testEmailValidator2() {
        // given
        String mail = "alanturing@instituto.com";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = true;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }

    @Test
    public void testEmailValidator3() {
        // given
        String mail = "mucho estress";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = false;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }

    @Test
    public void testEmailValidatorMail1() {
        // given
        String mail = "entiendo@poco.com";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = true;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }

    @Test
    public void testEmailValidatorMail2() {
        // given
        String mail = "alanturing@instituto.com";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = true;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }

    @Test
    public void testEmailValidatorMail3() {
        // given
        String mail = "mucho estress";
        EmailValidator emailValidator = new EmailValidator();
        boolean expectedEmail = false;

        // when
        boolean actualMail = emailValidator.isValidEmail(mail);

        // then
        Assert.assertEquals(expectedEmail, actualMail);
    }
}