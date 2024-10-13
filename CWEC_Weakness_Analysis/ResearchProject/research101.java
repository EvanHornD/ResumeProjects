
import java.io.IOException;

public class research101 {
    public static void main(String[] args) throws IOException {
        xmlReader reader = new xmlReader("ResearchProject\\cwec_v4.15.xml");
        reader.printWeaknessNames();
        System.out.println("\nPress Enter to exit...");
        new java.util.Scanner(System.in).nextLine();
    }
}
