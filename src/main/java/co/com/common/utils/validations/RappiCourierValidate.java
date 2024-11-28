package co.com.common.utils.validations;


public class RappiCourierValidate {
    public static final String ID_NOT_NULL = "El ID del Rappi tendero no puede ser nulo";

    public static final String IDENTIFICATION_NOT_EMPTY = "La cédula del Rappi tendero no puede ser nula o vacía";

    public static final String FULL_NAME_NOT_EMPTY = "El nombre del Rappi tendero no puede ser nulo o vacío";
    public static final String FULL_NAME_NOT_VALID = "El nombre del Rappi tendero no es válido, solo puede contener letras";
    public static final String FULL_NAME_REGEX = "^[a-zA-Z ]{3,50}$";

    public static final String RAPPI_TOKEN_NOT_EMPTY = "El token del Rappi tendero no puede ser nulo o vacío";
    public static final String RAPPI_TOKEN_ALREADY_EXISTS = "El Rappi token %s ya se encuentra registrado o ya se usó";

    public static final String COMMERCE_NOT_NULL = "El comercio del Rappi tendero no puede ser nulo";
    public static final String COMMERCE_NOT_FOUND = "El comercio con ID %s no fue encontrado";

    public static final String MOTORCYCLE_NOT_NULL = "La moto del Rappi tendero no puede ser nula";
    public static final String MOTORCYCLE_NOT_FOUND = "La moto con ID %s no fue encontrada";
    public static final String RAPPI_MOTORCYCLE_ALREADY_EXISTS = "La moto con ID %s ya está asignada a un Rappi tendero";

    public static final String LOCATION_NOT_NULL = "La ubicación del rappi tendero no puede ser nula";
    public static final String LOCATION_NOT_FOUND = "La ubicación del rappi tendero con ID %s no fue encontrada";

    public static final String RAPPI_COURIER_NOT_FOUND = "El Rappi tendero con ID %s no fue encontrado";
    public static final String RAPPI_COURIER_ALREADY_EXISTS = "El Rappi tendero con cédula %s ya se encuentra registrado";
    public static final String RAPPI_COURIER_NOT_FOUND_BY_IDENTIFICATION = "El Rappi tendero con cédula %s no fue encontrado";
}