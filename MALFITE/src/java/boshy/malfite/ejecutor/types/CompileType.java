package boshy.malfite.ejecutor.types;

/**
 *
 * @author theboshy
 */
public enum CompileType {

    JAVA(".java");
    //todo all exte

    private final String compileType;

    private CompileType(String compileType) {
        this.compileType = compileType;
    }

}
