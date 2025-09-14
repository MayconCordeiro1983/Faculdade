package exemplodesenhas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ValidadorTest {

    private Validador validator;

    @Before
    public void setUp() {
        System.out.println("Iniciando o teste...");
        validator = new Validador();
    }

    @After
    public void tearDown() {
        System.out.println("Finalizando o teste.");
        validator = null;
    }

    @Test
    public void testValidPassword() {
        String password = "Abcdef1!";
        boolean result = validator.isValid(password);
        assertThat(result, is(true));
    }

    @Test
    public void testPasswordTooShort() {
        String password = "Ab1!";
        boolean result = validator.isValid(password);
        assertEquals(false, result);
    }

    @Test
    public void testPasswordMissingUppercase() {
        String password = "abcdef1!";
        boolean result = validator.isValid(password);
        assertThat(result, is(false));
    }

    @Test
    public void testPasswordMissingNumber() {
        String password = "Abcdefg!";
        boolean result = validator.isValid(password);
        assertEquals(false, result);
    }

    @Test
    public void testPasswordWithSpaces() {
        String password = "Abc def1!";
        boolean result = validator.isValid(password);
        assertThat(result, is(false));
    }

    @Test
    public void testPasswordMissingSpecialChar() {
        String password = "Abcdef12";
        boolean result = validator.isValid(password);
        assertThat(result, is(false));
    }

    @Test
    public void testNullPassword() {
        boolean result = validator.isValid(null);
        assertEquals(false, result);
    }
}
