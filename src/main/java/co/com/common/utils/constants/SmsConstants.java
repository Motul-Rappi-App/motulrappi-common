package co.com.common.utils.constants;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class SmsConstants {
    private static final String API_KEY = "3b04ad2bb8d307596d4cf4b44c9f4cbd-ec8e727f-a5ad-4499-ac87-f1d97585f856";

    public String getApiKey(){
        return API_KEY;
    }

    public static final String INSCRIPTION_MESSAGE = "Bienvenido a la alianza MotulRappi. Aprovecha el 10% de descuento en aceites Motul todo el 2025. Conoce los puntos de venta en https://www.motul.com/es-CO/discover-motul/motul-es-mas.";
    public static final String REDEMPTION_MESSAGE = "REDEMPTION SUCCESFULL";
}
