package co.com.common.utils.validations;


public class MotorcycleValidate {
    public static final String ID_NOT_NULL = "El ID de la moto no puede ser nulo";

    public static final String BRAND_NOT_EMPTY = "La marca de la moto no puede ser nula o vacía";
    public static final String BRAND_NOT_VALID = "La marca de la moto debe incluir al menos una mayúscula, y solo puede contener letras";
    public static final String BRAND_REGEX = "^(?=.*[A-Z])[A-Za-zÁÉÍÓÚáéíóú\\s]{3,20}$";

    public static final String CYLINDER_CAPACITY_NOT_EMPTY = "La capacidad del cilindraje de la moto no puede ser nula o vacía";
    public static final String CYLINDER_CAPACITY_NOT_VALID = "La capacidad del cilindraje de la moto no es válida, debe tener entre 2 y 4 dígitos";
    public static final String CYLINDER_CAPACITY_REGEX = "^[0-9]{2,4}$";

    public static final String YEAR_NOT_EMPTY = "El año de la moto no puede ser nulo o vacío";
    public static final String YEAR_NOT_VALID = "El año de la moto no es válido";
    public static final String YEAR_REGEX = "^(19[8-9]\\d|20[0-1]\\d|202[0-6])$";

    public static final String MOTOR_STROKE_NOT_NULL = "El motor de la moto no puede ser nulo o vacío";

    public static final String REFERENCE_NOT_EMPTY = "La referencia de la moto no puede ser nula o vacía";

    public static final String MOTORCYCLE_NOT_FOUND = "La moto con ID %s no fue encontrada";
}