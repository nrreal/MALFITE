package boshy.malfite.ejecutor.types;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author theboshy
 */
public enum EjecutorType {

    JAVA("java_"),
    C("c_"),
    C_CHAR("c#_");

    private final String typString;

    private EjecutorType(String typString) {
        this.typString = typString;
    }

    public String getTypString() {
        return typString;
    }

}
