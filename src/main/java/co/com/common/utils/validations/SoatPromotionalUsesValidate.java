package co.com.common.utils.validations;


public class SoatPromotionalUsesValidate {
    public static final String ID_NOT_NULL = "El ID del uso de la promoción para SOAT no puede ser nulo";

    public static final String COMMERCE_NOT_NULL = "El comercio de la promoción para SOAT no puede ser nulo";
    public static final String COMMERCE_NOT_FOUND = "El comercio de la promoción para SOAT con ID %s no fue encontrado";

    public static final String IDENTIFICATION_NOT_EMPTY = "La identificación de la promoción para SOAT no puede estar vacía";
    public static final String IDENTIFICATION_ALREADY_USED = "La identificación con ID %s ya fue utilizada para promoción";

    public static final String QUANTITY_LITERS_NOT_NULL = "La cantidad de litros de la promoción para SOAT no puede ser nula";
    public static final String QUANTITY_LITERS_NOT_EMPTY = "El campo quantityLiters no puede ser nulo o vacío";
    public static final String QUANTITY_LITERS_INVALID = "El campo quantityLiters es inválido (debe ser 1 o 2)";

    public static final String OIL_REFERENCES_NOT_NULL = "Debe enviar la lista de productos seleccionados";

    public static final String OIL_REFERENCE_NOT_FOUND = "No se encuentra la referencia seleccionada";
    public static final String VISCOSITY_NOT_FOUND = "No se encuentra la viscosidad seleccionada";
}