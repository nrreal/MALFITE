package boshy.malfite.ejecutor.simple;

import boshy.malfite.utils.ReportLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author theboshy
 */
public class SimpleEjecutor {

    private static final String COMAND = "cmd /c";
    //--
    private static String salida = null;

    public static void ejecComand(String comandoExterno) {
        if (comandoExterno != null && !comandoExterno.isEmpty()) {
            try {
                Process proceso = Runtime.getRuntime().exec(COMAND + " " + comandoExterno);

                InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
                BufferedReader stdInput = new BufferedReader(entrada);

                if ((salida = stdInput.readLine()) != null) {
                    System.out.println("Comando ejecutado Correctamente");
                    while ((salida = stdInput.readLine()) != null) {
                        System.out.println(salida);
                    }
                } else {
                    System.out.println("No se a producido ninguna salida");
                }
            } catch (IOException e) {
                System.out.println(ReportLog.getErrorBuilder(new Object() {
                }, e));
            }
        } else {
            System.err.println("sin sentencia para ejecutar");
        }

    }
}
