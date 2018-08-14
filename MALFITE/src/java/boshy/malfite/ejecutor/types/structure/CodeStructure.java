package boshy.malfite.ejecutor.types.structure;

/**
 *
 * @author theboshy
 */
public enum CodeStructure {

    JAVA_HEAD("public class "),
    JAVA_BODY_OPEN("{"),
    JAVA_BODY_CLOSE("}");
    //TODO

    private final String typString;

    private CodeStructure(String typString) {
        this.typString = typString;
    }

    public String getTypString() {
        return typString;
    }
}
