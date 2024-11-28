package co.com.common.utils.validations;


public class ValidatePromotionValidation {
    public static final String IDENTIFICATION_NOT_EMPTY = "La identificacion no puede ser nula o vacía";

    public static final String IDENTIFICATION_NOT_FOUND = "El numero de cedula %s no esta registrado para promocion, ¿se trata de un Rappi Tendero? inscribelo";

    public static final String SOAT_PROMOTION_VALID = "Felicitaciones, la cedula es apta para usar la promocion";
    public static final String SOAT_PROMOTION_INVALID_FOR_USE = "Esta cedula ya fue redimida por Soat, lastimosamente no aplica";

    public static final long RT_PROMOTION_DAYS_MIN = 10;
    public static final String RT_PROMOTION_VALID_FIRST_USE = "Felicitaciones por la primera vez usando la promocion";
    public static final String RT_PROMOTION_VALID_WITH_TIME = "Felicitaciones, aplica para promocion, puede redimirla de nuevo en %s dias";
    public static final String RT_PROMOTION_INVALID_WITH_TIME = "No aplica para promocion, no han pasado %s dias desde el ultimo uso, la ultima vez fue el dia %s";
    public static final String RT_PROMOTION_ERROR_WITH_DATE = "Error al obtener fechas del uso de la promocion";

    public static final String SAVE_IN_RT_PROMOTION_USES = "RT_PROMOTION_USES";
    public static final String SAVE_IN_SOAT_PROMOTION_USES = "SOAT_PROMOTION_USES";
    public static final String SEND_OPTION_TO_CREATE_RT = "CREATE_RT";
}