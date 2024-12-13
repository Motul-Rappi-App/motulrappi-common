package co.com.common.utils.validations;


public class AdminValidate {
    public static final String ID_NOT_NULL = "El ID del administrador no puede ser nulo";

    public static final String NAME_NOT_EMPTY = "El nombre del administrador no puede ser nulo o vacío";
    public static final String NAME_NOT_VALID = "El nombre del administrador debe incluir al menos una mayúscula, y solo puede contener letras";
    public static final String NAME_REGEX = "^(?=.*[A-Z])[A-Za-zÁÉÍÓÚáéíóú\\s]{1,100}$";

    public static final String EMAIL_NOT_EMPTY = "El correo electrónico del administrador no puede ser nulo o vacío";
    public static final String EMAIL_NOT_VALID = "El correo electrónico del administrador no es válido";

    public static final String PASSWORD_NOT_EMPTY = "La contraseña del administrador no puede ser nula o vacía";
    public static final String PASSWORD_NOT_VALID = "La contraseña del administrador no es válida, debe tener al menos 8 caracteres, una mayúscula, una minúscula y un número";
    public static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";

    public static final String ADMIN_NOT_FOUND = "El administrador con ID %s no fue encontrado";

    public static final String SUPER_ADMIN_NOT_NULL = "El campo superAdmin no puede ser nulo";

    public static final String SUPER_ADMIN_NOT_SUPPORTED = "El administrador es superadministrador y no puede acceder a este método";
    public static final String NO_SUPER_ADMIN_NOT_SUPPORTED = "El administrador no es superadministrador y no puede acceder a este método";

}