package boshy.malfite.ejecutor.java;

import boshy.malfite.utils.ReportLog;
import boshy.malfite.utils.files.TempFiles;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author theboshy
 */
public class JEjecutor {

    //private static final String TEMP_FILE_PATH = "..\\applications\\MALFITE\\java_temps";
    private static final String TEMP_FILE_PATH = "C:\\Users\\SOFTWARE1\\Desktop\\MALFITEfiles\\java_temps";
    private static final String EXTENCION_JAVA = ".java";

    public static void generateJavaFile(String nombre, String code) throws IOException {
        /*File concretePath = TempFiles.createTempFile(EXTENCION_JAVA, nombre, TEMP_FILE_PATH);
        if (Files.exists(concretePath.toPath())) {*/
            TempFiles.adContentToFile(TEMP_FILE_PATH, nombre + EXTENCION_JAVA, code);
        /*} else {
            System.out.println(ReportLog.getErrorBuilder(new Object(), null));
        }*/

    }

}
