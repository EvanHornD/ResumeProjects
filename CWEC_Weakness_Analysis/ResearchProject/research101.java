
import java.io.IOException;

public class research101 {
    public static void main(String[] args) throws IOException {
        xmlReader reader = new xmlReader("cwec_v4.15.xml");
        reader.printWeaknessNames();
    }
}
