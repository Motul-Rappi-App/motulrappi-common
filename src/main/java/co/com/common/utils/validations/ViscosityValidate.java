package co.com.common.utils.validations;


public class ViscosityValidate {
    public static final String ID_NOT_NULL = "El ID de la viscosidad no puede ser nulo";

    public static final String DESCRIPTION_NOT_EMPTY = "La descripción de la viscosidad no puede ser nula o vacía";
    public static final String DESCRIPTION_NOT_VALID = "La descripción de la viscosidad no es válida";
    public static final String DESCRIPTION_REGEX = "^[a-zA-Z0-9áéíóúÁÉÍÓÚ ,.-]{3,50}$";

    public static final String VISCOSITY_NOT_FOUND = "La viscosidad con ID %s no fue encontrada";
    public static final String VISCOSITY_ALREADY_EXISTS = "La viscosidad con descripción %s ya existe";

    public static final String ADMIN_NOT_NULL = "El administrador de la viscosidad no puede ser nulo";
    public static final String ADMIN_NOT_FOUND = "El administrador de la viscosidad con ID %s no fue encontrado";
}