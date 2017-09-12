package boshy.malfite.utils;

/**
 *
 * @author theboshy
 */
public class ReportLog {

    public static String getErrorBuilder(Object objectMethod, Exception e) {
        String constructorError = new String();
        try {
            constructorError += "\nError:  " + e != null ? e.getMessage() : "No Especifica" + "\nClase : " + objectMethod != null ? objectMethod.getClass().getEnclosingClass().getCanonicalName() : "No Especifica" + "\nMetodo : " + objectMethod != null ? objectMethod.getClass().getEnclosingMethod().getName() : "No Especifica";
        } catch (SecurityException exception) {
            System.out.println("ocurrio un error dentro del validador de errores (XD)\n Error : " + exception);
        }
        return constructorError;
    }

    //--
}
