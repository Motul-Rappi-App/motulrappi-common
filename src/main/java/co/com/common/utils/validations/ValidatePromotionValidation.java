package co.com.common.utils.validations;


public class ValidatePromotionValidation {
    public static final String IDENTIFICATION_NOT_EMPTY = "La identificacion no puede ser nula o vacía";

    public static final String IDENTIFICATION_NOT_FOUND = "El numero de cedula %s no esta registrado para promocion, ¿se trata de un Rappi Tendero? inscribelo";

    public static final String SOAT_PROMOTION_VALID = "Felicitaciones, al consumidor final; la cédula es apta para obtener un descuento del 25 porciento.";
    public static final String SOAT_PROMOTION_INVALID_FOR_USE = "Esta cédula ya fue redimida por el consumidor final; lastimosamente no aplica el descuento.";

    public static final long RT_PROMOTION_DAYS_MIN = 10;
    public static final String RT_PROMOTION_VALID_FIRST_USE = "Felicitaciones al Rappi Tendero por su primera vez usando la promoción. Es apto para recibir un descuento del 10 porciento";
    public static final String RT_PROMOTION_VALID_WITH_TIME = "Felicitaciones, aplica para la promoción un descuento del 10 porciento. Rappi Tendero puede redimirla de nuevo en %s días.";
    public static final String RT_PROMOTION_INVALID_WITH_TIME = "No aplica para promoción; no han pasado %s días desde el último uso, la última vez fue el día %s.";
    public static final String RT_PROMOTION_ERROR_WITH_DATE = "Error al obtener fechas del uso de la promocion";

    public static final String SAVE_IN_RT_PROMOTION_USES = "RT_PROMOTION_USES";
    public static final String SAVE_IN_SOAT_PROMOTION_USES = "SOAT_PROMOTION_USES";
    public static final String SEND_OPTION_TO_CREATE_RT = "CREATE_RT";
}