package co.com.common.utils.validations;


public class CommerceValidate {
    public static final String ID_NOT_NULL = "El ID del comercio no puede ser nulo";

    public static final String NIT_NOT_EMPTY = "El NIT del comercio no puede ser nulo o vacío";
    public static final String NIT_NOT_VALID = "El NIT del comercio no debe tener espacios o caracteres especiales";
    public static final String NIT_SIZE = "El NIT del comercio debe tener entre 1 y 20 caracteres";
    public static final String NIT_REGEX = "^[a-zA-Z0-9 ]*$";

    public static final String EMAIL_NOT_EMPTY = "El correo electrónico del comercio no puede ser nulo o vacío";
    public static final String EMAIL_NOT_VALID = "El correo electrónico del comercio no es válido";

    public static final String PASSWORD_NOT_EMPTY = "La contraseña del comercio no puede ser nula o vacía";
    public static final String PASSWORD_NOT_VALID = "La contraseña del comercio no es válida, debe tener al menos 8 caracteres, una mayúscula, una minúscula y un número";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";

    public static final String NAME_NOT_EMPTY = "El nombre del comercio no puede ser nulo o vacío";
    public static final String NAME_NOT_VALID = "El nombre del comercio debe incluir al menos una mayúscula, y solo puede contener letras y números";
    public static final String NAME_REGEX = "^(?=.*[A-Z])[A-Za-zÁÉÍÓÚáéíóú0-9\\s]{2,50}$";

    public static final String COMMERCE_NOT_FOUND = "El comercio con ID %s no fue encontrado";
    public static final String COMMERCE_ALREADY_EXISTS = "El comercio con nombre %s ya se encuentra registrado";
    public static final String NIT_ALREADY_EXISTS = "El NIT de comercio ya se ha usado en otro";

    public static final String LOCATION_NOT_NULL = "La ubicación del comercio no puede ser nula";
    public static final String LOCATION_NOT_FOUND = "La ubicación del comercio con ID %s no fue encontrada";

    public static final String ADMIN_NOT_NULL = "El administrador del comercio no puede ser nulo";
    public static final String ADMIN_NOT_FOUND = "El administrador del comercio con ID %s no fue encontrado";
    
    public static final String PERSON_STATUS_NOT_NULL = "El estado de la persona del comercio no puede ser nulo";

    public static final String COMMERCE_BY_ADMIN_ID_NOT_FOUND = "No se encuentran comercios relacionados al ID de administrador %s";
}