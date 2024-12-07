package co.com.common.utils.validations;


public class OilReferenceValidate {
    public static final String ID_NOT_NULL = "El ID de la referencia del aceite no puede ser nulo";

    public static final String NAME_NOT_EMPTY = "El nombre de la referencia del aceite no puede ser nulo o vacío";
    public static final String NAME_NOT_VALID = "El nombre de la referencia del aceite no es válido";
    public static final String NAME_REGEX = "^[\\s\\S]{1,10}$\n";

    public static final String OIL_REFERENCE_NOT_FOUND = "La referencia del aceite con ID %s no fue encontrada";
    public static final String OIL_REFERENCE_NOT_FOUND_BY_NAME = "La referencia del aceite con nombre %s no fue encontrada";

    public static final String VISCOSITIES_NOT_EMPTY = "La lista de viscosidades de la referencia del aceite no puede ser nula o vacía";
    public static final String VISCOSITIES_NOT_FOUND = "La viscosidad de la referencia del aceite con ID %s no fue encontrada";

    public static final String LITERS_QUANTITY_NOT_EMPTY = "La cantidad de litros de la referencia del aceite no puede ser nula o vacía";
    public static final String LITERS_QUANTITY_NOT_VALID = "La cantidad de litros de la referencia del aceite no es válida, debe ser un número mayor a 0";
    public static final String LITERS_QUANTITY_REGEX = "^[0-9]+(\\.[0-9]+)?$";

    public static final String ACTIVE_FOR_RAPPI_COURIER_NOT_EMPTY = "La activación para el mensajero de Rappi de la referencia del aceite no puede ser nula o vacía";

    public static final String ADMIN_NOT_EMPTY = "El administrador de la referencia del aceite no puede ser nulo";
    public static final String ADMIN_NOT_FOUND = "El administrador de la referencia del aceite con ID %s no fue encontrado";
}