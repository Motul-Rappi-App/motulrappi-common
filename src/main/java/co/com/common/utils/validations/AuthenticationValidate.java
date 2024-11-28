package co.com.common.utils.validations;


public class AuthenticationValidate {
    public static final String EMAIL_NOT_EMPTY = "El correo electrónico no puede ser nulo o vacío";
    public static final String EMAIL_NOT_VALID = "El correo electrónico no es válido";
    public static final String EMAIL_NOT_FOUND = "El correo electrónico %s no fue encontrado";

    public static final String PASSWORD_NOT_EMPTY = "La contraseña no puede ser nula o vacía";
    public static final String PASSWORD_NOT_VALID = "La contraseña no es válida, debe tener al menos 8 caracteres, una mayúscula, una minúscula y un número";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";

    public static final String CREDENTIAL_NOT_FOUND = "Las credenciales no fueron encontradas";
    public static final String CREDENTIAL_INCORRECT_PASSWORD = "La contraseña es incorrecta";

    public static final String TOKEN_NOT_VALID = "El token no es válido";
}