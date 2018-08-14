package boshy.malfite.ejecutor.temp.file;

import boshy.malfite.ejecutor.java.JEjecutor;
import boshy.malfite.ejecutor.types.EjecutorType;
import boshy.malfite.ejecutor.types.structure.CodeStructure;
import boshy.malfite.utils.ReportLog;
import java.io.IOException;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author theboshy
 */
@ManagedBean
public class Enrrutador {

    private static String nombreEnrrutadorFileJava;

    public static void changeWay(EjecutorType ejecutorType, String codeValue) throws IOException {
        try {

            switch (ejecutorType) {
                case JAVA: {
                    if (nombreEnrrutadorFileJava != null && !nombreEnrrutadorFileJava.isEmpty()) {
                        JEjecutor.generateJavaFile(nombreEnrrutadorFileJava, structureAdapterJava(codeValue, nombreEnrrutadorFileJava));
                    }
                    break;
                }
                case C: {
                    //--->
                    break;
                }
                case C_CHAR: {
                    //--->
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println(ReportLog.getErrorBuilder(new Object() {
            }, e));
        }

    }

    public static String getNombreEnrrutadorFileJava() {
        return nombreEnrrutadorFileJava;
    }

    public static void setNombreEnrrutadorFileJava(String nombreEnrrutadorFileJava) {
        Enrrutador.nombreEnrrutadorFileJava = nombreEnrrutadorFileJava;
    }

    //--
    private static String structureAdapterJava(String code, String nombre) {
        return CodeStructure.JAVA_HEAD.getTypString() + nombre + CodeStructure.JAVA_BODY_OPEN.getTypString() + code + CodeStructure.JAVA_BODY_CLOSE.getTypString();
    }

}
