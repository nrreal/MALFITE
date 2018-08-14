package boshy.malfite.utils.files;

import boshy.malfite.utils.ReportLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author theboshy
 */
public class TempFiles {

    public static File createTempFile(String exteString, String nombre, String path) throws IOException {
        try {
            File file = new File(path + "\\" + nombre + exteString);
//--
            Path toCreatePath = Paths.get(file.toURI());
            if (!Files.exists(toCreatePath)) {
                Files.createDirectories(toCreatePath);
            }
            //--
            Files.setAttribute(toCreatePath, "dos:hidden", true);
            return file;
        } catch (IOException e) {
            System.out.println(ReportLog.getErrorBuilder(new Object(), e));
        }
        return null;
    }

    //--
    /**
     * Permite sobreescrbir un archivo
     *
     * @param url la ruta del archivo que se desea sobreescribir
     * @param name nombre del archivo que se desea sobreescribir
     * @param content contenido para reemplazar
     * @throws IOException
     */
    public static void overrideFile(String url, String name, String content) throws IOException {
        BufferedWriter bw = null;
        try {
            File archivo = new File(url + "/" + name);
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(content);
        } catch (IOException e) {
            System.out.println("Ocurrio un Exception al intentar sobreescribir el archivo : ");
            for (StackTraceElement runnerObject : e.getStackTrace()) {
                System.out.println(runnerObject);
            }
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }

    /**
     * Anade texto a un archivo creado
     *
     * @param url la ruta del archivo que se desea sobreescribir
     * @param name nombre del archivo que se desea sobreescribir
     * @param content contenido para reemplazar
     * @throws IOException
     */
    public static void adContentToFile(String url, String name, String content) throws IOException {
        BufferedWriter bw = null;
        try {
            File archivo = new File(url + "/" + name);
            bw = new BufferedWriter(new FileWriter(archivo, true));
            bw.write(content);
        } catch (IOException e) {
            System.out.println("Ocurrio un Exception al intentar sobreescribir el archivo : ");
            for (StackTraceElement runnerObject : e.getStackTrace()) {
                System.out.println(runnerObject);
            }
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }

    /**
     * Anade texto a un archivo creado con propiedades externas
     *
     * @param url la ruta del archivo que se desea sobreescribir
     * @param name nombre del archivo que se desea sobreescribir
     * @param newLine permite insertar una neuva linea que sirve de separador
     * @param content contenido para reemplazar
     * @param separator un separador entre elementos
     * @throws IOException
     */
    public static void overrideFileCustom(String url, String name, boolean newLine, String content, String separator) throws IOException {
        BufferedWriter bw = null;
        try {
            File archivo = new File(url + "/" + name);
            bw = new BufferedWriter(new FileWriter(archivo, true));
            if (newLine) {
                bw.newLine();
            }
            if (!separator.isEmpty()) {
                bw.newLine();
                bw.write(separator);
            }
            bw.write(content);
        } catch (IOException e) {
            System.out.println("Ocurrio un Exception al intentar sobreescribir el archivo : ");
            for (StackTraceElement runnerObject : e.getStackTrace()) {
                System.out.println(runnerObject);
            }
        } finally {
            if (bw != null) {
                bw.flush();
                bw.close();
            }
        }
    }

    /**
     * Permite eliminar un archivo
     *
     * @param url la ruta del archivo que se desea eliminar
     * @param name nombre del archivo que se desea eliminar
     * @throws IOException
     */
    public static void deleteFile(String url, String name) throws IOException {
        File archivo = new File(url + "/" + name);
        if (archivo.exists()) {
            archivo.delete();
        } else {
            System.out.println("El archvivo o la ruta especificada no existe");
        }
    }
}
