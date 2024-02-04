/*
 * Crea una clase EmailValidator con un método que verifique si una dirección de correo electrónico es válida. 
 * Este método recibirá un String y devolverá un boolean. No lo implementes aún, haz que siempre devuelva false.
 * Escribe pruebas unitarias para este método. Comprueba que fallan algunas de ellas, las que tengan que devolver true. 
 * Finalmente implementa el método (búscalo por internet, no hace falta que lo hagas tú) 
 *  y repite los tests para verificar que ahora sí pasan todos. 
 *  9
 * @autor Barbara Colomer
 */
public class EmailValidator {

    private boolean isValidEmail(String email) {
        boolean isValid = false;
        if (email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            isValid = true;
        }

        return isValid;
    }
}
