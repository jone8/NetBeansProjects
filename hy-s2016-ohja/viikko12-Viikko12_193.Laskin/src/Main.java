
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        Laskin laskin = new Laskin();

        SwingUtilities.invokeLater(new GraafinenLaskin(laskin));
    }
}
