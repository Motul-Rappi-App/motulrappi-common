package co.com.common.utils.validations;

import java.time.LocalDateTime;


public class ValidatePromotionValidation {
    public static final String IDENTIFICATION_NOT_EMPTY = "La identificación no puede ser nula o vacía";

    public static final String IDENTIFICATION_NOT_FOUND = "El número de cédula %s no está registrado para promoción, ¿Se trata de un Rappi Tendero? ¡Inscríbelo!";

    public static final String SOAT_PROMOTION_VALID = "Felicitaciones, al consumidor final; la cédula es apta para obtener un descuento del 20%%.";
    public static final String SOAT_PROMOTION_INVALID_FOR_USE = "Esta cédula ya fue redimida por el consumidor final; lastimosamente, no aplica el descuento.";
    public static final String SOAT_PROMOTION_TIME_LIMIT_INVALID = "La promoción para consumidores finales ha caducado.";
    public static final LocalDateTime SOAT_PROMOTION_TIME_LIMIT = LocalDateTime.of(2025, 3, 30, 0, 0);

    public static final long RT_PROMOTION_DAYS_MIN = 10;
    public static final String RT_PROMOTION_VALID_FIRST_USE = "Felicitaciones al Rappi Tendero por su primera vez usando la promoción. Es apto para recibir un descuento del 10%%";
    public static final String RT_PROMOTION_VALID_WITH_TIME = "Felicitaciones, aplica para la promoción un descuento del 10%%. Rappi Tendero puede redimirla de nuevo en %s días.";
    public static final String RT_PROMOTION_INVALID_WITH_TIME = "No aplica para promoción; no han pasado %s días desde el último uso, la última vez fue el día %s.";
    public static final String RT_PROMOTION_ERROR_WITH_DATE = "Error al obtener fechas del uso de la promoción";

    public static final String SAVE_IN_RT_PROMOTION_USES = "RT_PROMOTION_USES";
    public static final String SAVE_IN_SOAT_PROMOTION_USES = "SOAT_PROMOTION_USES";

    public static final String SEND_OPTION_TO_CREATE_RT = "CREATE_RT";
}