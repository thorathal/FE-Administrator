package Data;

/**
 * @author Bjarke Carlsen
 */
public class ListItem implements java.io.Serializable {
    
    private final String text;
    private final int value;

    public ListItem(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return text;
    }
}
