package co.com.common.utils.constants;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ExcelConstants {
    public static final String REPORTS_FILE_NAME = "REPORTES";

    public static final String RAPPI_TENDEROS_INSCRITOS = "RAPPI TENDEROS INSCRITOS (%s)";
    public static final String RAPPI_TENDEROS_REDIMIDOS = "RAPPI TENDEROS REDIMIDOS (%s)";
    public static final String SOAT_REDIMIDOS = "SOAT REDIMIDOS (%s)";

    public static final String DATE_FORMAT = "HH:mm:ss dd/MM/yyyy";
    public static String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);

        return dateFormat.format(date);
    }
}