package boshy.malfite.ejecutor.simple;

import boshy.malfite.utils.ReportLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static class timeOut extends Thread {

        private static boolean detener;

        @Override
        public void run() {
            try {
                sleep(5000);
                System.exit(0);
            } catch (InterruptedException ex) {
                System.out.println("intern Ex : " + ex.getMessage());
            }
        }

        public static void runn() {
            if (detener) {
                runn();
            }
        }

        public static void stap() {
            detener = false;
        }

        public static void continoe() {
            detener = true;
        }
    }
}
