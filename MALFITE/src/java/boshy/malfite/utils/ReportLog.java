package boshy.malfite.utils;

/**
 *
 * @author theboshy
 */
public class ReportLog {

    public static String getErrorBuilder(Object objectMethod, Exception e) {
        String constructorError = "";
        String conClazz = "";
        String conMethod = "";
        try {
            constructorError = e != null ? "\nError : " + e.getMessage() : "\nError : No Especifica";
            conClazz = objectMethod != null
                    ? "\nClase : " + objectMethod.getClass().getEnclosingClass().getCanonicalName() : "\nClase : No Especifica";
            conMethod = objectMethod != null
                    ? "\nMetodo: " + objectMethod.getClass().getEnclosingMethod().getName() : "\nMetodo : No Especifica";
        } catch (SecurityException exception) {
            System.out.println("ocurrio un error dentro del validador de errores (XD)\n Error : " + exception);
        }
        return constructorError + conClazz + conMethod;
    }

    //--
}
