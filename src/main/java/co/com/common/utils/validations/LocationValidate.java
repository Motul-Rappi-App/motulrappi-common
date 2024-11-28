package co.com.common.utils.validations;


public class LocationValidate {
    public static final String ID_NOT_NULL = "El ID de la ubicación no puede ser nulo";

    public static final String NAME_NOT_EMPTY = "El nombre de la ubicación no puede ser nulo o vacío";
    public static final String NAME_NOT_VALID = "El nombre de la ubicación debe incluir al menos una mayúscula, y solo puede contener letras";
    public static final String NAME_REGEX = "^(?=.*[A-Z])[A-Za-zÁÉÍÓÚáéíóú]{4,50}$";

    public static final String LOCATION_NOT_FOUND = "La ubicación con ID %s no fue encontrada";
    public static final String LOCATION_ALREADY_EXISTS = "La ubicación con nombre %s ya existe";

    public static final String ADMIN_NOT_NULL = "El administrador de la ubicación no puede ser nulo";
    public static final String ADMIN_NOT_FOUND = "El administrador de la ubicación con ID %s no fue encontrado";
}