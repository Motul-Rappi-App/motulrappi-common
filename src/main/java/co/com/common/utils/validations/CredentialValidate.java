package co.com.common.utils.validations;


public class CredentialValidate {
    public static final String ID_NOT_NULL = "El ID de la credencial no puede ser nulo";

    public static final String EMAIL_NOT_EMPTY = "El correo electrónico de la credencial no puede ser nulo o vacío";
    public static final String EMAIL_NOT_VALID = "El correo electrónico de la credencial no es válido";
    public static final String EMAIL_ALREADY_EXISTS = "El correo electrónico de la credencial %s ya existe";

    public static final String PASSWORD_NOT_EMPTY = "La contraseña de la credencial no puede ser nula o vacía";
    public static final String PASSWORD_NOT_VALID = "La contraseña de la credencial no es válida";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";

    public static final String ROL_USUARIO_NOT_NULL = "El rol del usuario no puede ser nulo";

    public static final String CREDENTIAL_NOT_FOUND = "La credencial con el ID %s no fue encontrada";
}